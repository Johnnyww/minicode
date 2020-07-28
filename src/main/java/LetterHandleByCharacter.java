import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author johnnychan
 * Implement this using two queue of the character data type
 */
public class LetterHandleByCharacter extends LetterHandle {

    public Queue<Character> resultstrbuilderqueue = new LinkedList<>();

    public Queue<Character> tempcharqueue = new LinkedList<>();


    @Override
    public String letterHandle(Integer[] integerarray) {
        if (integerarray != null && integerarray.length > 0) {
            List<Integer> s = new LinkedList<>();
            for (Integer tempinteger : integerarray) {
                int prefixnumber = tempinteger / 10;
                int suffixesnumber = tempinteger % 10;
                if (prefixnumber != 0 && prefixnumber != 1) {
                    s.add(prefixnumber);
                }
                if (suffixesnumber != 0 && prefixnumber != 1) {
                    s.add(suffixesnumber);
                }
            }
            paramsarray = s.toArray(new Integer[0]);
            letterCombination(paramsarray.length);
            for (Character tempcharacter : resultstrbuilderqueue) {
                resultstrbuilder.append(tempcharacter);
            }
        }
        return resultstrbuilder.toString();
    }

    @Override
    public void letterCombination(int paramscounts) {
        if (paramscounts > 1) {
            letterCombination(paramscounts - 1);
        } else {
            //Get char array according to key
            char[] valuetemp = conditionmap.get(paramsarray[paramscounts - 1]);
            if (valuetemp != null && valuetemp.length > 0) {
                for (char c : valuetemp) {
                    resultstrbuilderqueue.offer(c);
                    resultstrbuilderqueue.offer(' ');
                }
            }
            return;
        }
        if (resultstrbuilderqueue.size() == 0) {
            char[] valuetemp = conditionmap.get(paramsarray[paramscounts - 1]);
            if (valuetemp != null && valuetemp.length > 0) {
                for (char c : valuetemp) {
                    resultstrbuilderqueue.offer(c);
                    resultstrbuilderqueue.offer(' ');
                }
            }
        } else {
            int queuesize = resultstrbuilderqueue.size();
            char[] valuetemp = conditionmap.get(paramsarray[paramscounts - 1]);
            if (valuetemp != null && valuetemp.length > 0) {
                for (int i = 1; i <= queuesize; i++) {
                    Character tempchar = resultstrbuilderqueue.poll();
                    if (tempchar != null) {
                        if (' ' != tempchar) {
                            tempcharqueue.offer(tempchar);
                        } else {
                            int tempcharqueuesize = tempcharqueue.size();
                            for (int j = 0; j < valuetemp.length; j++) {
                                for (int k = 0; k < tempcharqueuesize; k++) {
                                    Character temp = tempcharqueue.poll();
                                    resultstrbuilderqueue.offer(temp);
                                    if (j != valuetemp.length - 1) {
                                        tempcharqueue.add(temp);
                                    }
                                }
                                resultstrbuilderqueue.offer(valuetemp[j]);
                                resultstrbuilderqueue.offer(' ');
                            }
                        }
                    }
                }
            }
        }
    }

}
