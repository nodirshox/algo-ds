package test.problems.crackingCodingInterview;

import org.junit.Test;
import src.problems.crackingCodingInterview.CheckPermutation;

import static org.junit.Assert.assertEquals;

public class CheckPermutationTest {
    @Test
    public void successCase() {
        String input1 = "abc";
        String input2 = "cba";

        boolean actual = CheckPermutation.checkPermutation(input1, input2);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void differentLength() {
        String input1 = "abc";
        String input2 = "cbdd";

        boolean actual = CheckPermutation.checkPermutation(input1, input2);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void unSuccessCase() {
        String input1 = "abc";
        String input2 = "cbt";

        boolean actual = CheckPermutation.checkPermutation(input1, input2);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
