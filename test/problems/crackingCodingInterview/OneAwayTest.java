package test.problems.crackingCodingInterview;

import org.junit.Test;
import src.problems.crackingCodingInterview.OneAway;

import static org.junit.Assert.assertEquals;

public class OneAwayTest {
    @Test
    public void replaced() {
        String input = "pale";
        String input2 = "bale";
        boolean actual = OneAway.check(input, input2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void oneCharacterLess() {
        String input = "ple";
        String input2 = "pale";
        boolean actual = OneAway.check(input, input2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void oneCharacterMore() {
        String input = "pales";
        String input2 = "pale";
        boolean actual = OneAway.check(input, input2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void twoCharactersDifferent() {
        String input = "pale";
        String input2 = "bae";
        boolean actual = OneAway.check(input, input2);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
