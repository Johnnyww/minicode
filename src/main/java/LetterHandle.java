import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author johnnychan
 * Abstract superclass of two data structure implementations
 */
public abstract class LetterHandle {

    public Map<Integer, char[]> conditionmap = new HashMap<>();

    public Integer[] paramsarray;

    public StringBuilder resultstrbuilder = new StringBuilder();


    {
        Integer[] keysarray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<char[]> valueslist = new ArrayList<>(10);
        char[] value0 = null;
        char[] value1 = null;
        char[] value2 = {'a', 'b', 'c'};
        char[] value3 = {'d', 'e', 'f'};
        char[] value4 = {'g', 'h', 'i'};
        char[] value5 = {'j', 'k', 'l'};
        char[] value6 = {'m', 'n', 'o'};
        char[] value7 = {'p', 'q', 'r', 's'};
        char[] value8 = {'t', 'u', 'v'};
        char[] value9 = {'w', 'x', 'y', 'z'};

        valueslist.add(0, value0);
        valueslist.add(1, value1);
        valueslist.add(2, value2);
        valueslist.add(3, value3);
        valueslist.add(4, value4);
        valueslist.add(5, value5);
        valueslist.add(6, value6);
        valueslist.add(7, value7);
        valueslist.add(8, value8);
        valueslist.add(9, value9);


        for (int i = 0; i < keysarray.length; i++) {
            conditionmap.put(keysarray[i], valueslist.get(i));
        }
    }

    /**
     * Because you need a recursive implementation, this is an externally encapsulated method
     *
     * @param integerarray Input array
     * @return output result
     */
    public abstract String letterHandle(Integer[] integerarray);

    /**
     * This is the real way to deal with the data, using the idea of recursion
     *
     * @param paramscounts Input array's length
     */
    public abstract void letterCombination(int paramscounts);

}
