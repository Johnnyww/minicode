import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author johnnychan
 * Implement this using a queue of the StringBuilder data type
 */
public class LetterHandleByStringBuilder extends LetterHandle {

    public static Queue<StringBuilder> resultstrbuilderqueue;


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
            resultstrbuilderqueue = new LinkedList<>();
            letterCombination(paramsarray.length);
            for (StringBuilder tempstrbuilder : resultstrbuilderqueue) {
                resultstrbuilder.append(tempstrbuilder.toString());
                resultstrbuilder.append(" ");
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
                    resultstrbuilderqueue.offer(new StringBuilder().append(c));
                }
            }
            return;
        }
        if (resultstrbuilderqueue.size() == 0) {
            char[] valuetemp = conditionmap.get(paramsarray[paramscounts - 1]);
            if (valuetemp != null && valuetemp.length > 0) {
                for (char c : valuetemp) {
                    resultstrbuilderqueue.offer(new StringBuilder().append(c));
                }
            }
        } else {
            int queuesize = resultstrbuilderqueue.size();
            char[] valuetemp = conditionmap.get(paramsarray[paramscounts - 1]);
            if (valuetemp != null && valuetemp.length > 0) {
                for (int i = 1; i <= queuesize; i++) {
                    StringBuilder tempBuilder = resultstrbuilderqueue.poll();
                    if (tempBuilder != null) {
                        for (char c : valuetemp) {
                            resultstrbuilderqueue.offer(new StringBuilder(tempBuilder).append(c));
                        }
                    }
                }
            }
        }
    }


}
