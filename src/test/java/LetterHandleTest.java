import org.junit.Test;

public class LetterHandleTest {

    /**
     * test use method implement of Character data type to
     * convert the digits from 0 to 9 into letters
     */
    @Test
    public void testStage1ByCharacterMethod() {
        Integer[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String result = new LetterHandleByCharacter().letterHandle(t);
        System.out.print(result);
    }

    /**
     * test use method implement of StringBuilder data type to
     * convert the digits from 0 to 9 into letters
     */
    @Test
    public void testStage1ByStringBuilderMethod() {
        Integer[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String result = new LetterHandleByStringBuilder().letterHandle(t);
        System.out.print(result);
    }

    /**
     * test use method implement of Character data type to
     * convert the digits from 0 to 99 into letters
     */
    @Test
    public void testStage2ByCharacterMethod() {
        Integer[] t = new Integer[100];
        for (int i = 0; i < 100; i++) {
            t[i] = i;
        }
        String result = new LetterHandleByCharacter().letterHandle(t);
        System.out.print(result);
    }

    /**
     * test use method implement of StringBuilder data type to
     * convert the digits from 0 to 99 into letters
     */
    @Test
    public void testStage2ByStringBuilderMethod() {
        Integer[] t = new Integer[100];
        for (int i = 0; i < 100; i++) {
            t[i] = i;
        }
        String result = new LetterHandleByStringBuilder().letterHandle(t);
        System.out.print(result);
    }
}
