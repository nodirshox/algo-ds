package test.problems.crackingCodingInterview;

import org.junit.Test;
import src.problems.crackingCodingInterview.PalindromePermutation;

import static org.junit.Assert.assertEquals;

public class PalindromePermutationTest {
    @Test
    public void successCase() {
        String input = "tactcoa";
        boolean actual = PalindromePermutation.palindromePermutation(input);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void unSuccessCase() {
        String input = "code";
        boolean actual = PalindromePermutation.palindromePermutation(input);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
