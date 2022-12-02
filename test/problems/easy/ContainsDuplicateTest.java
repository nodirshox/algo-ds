package test.problems.easy;

import org.junit.Test;
import src.problems.easy.ContainsDuplicate;

import static org.junit.Assert.assertEquals;

public class ContainsDuplicateTest {
    @Test
    public void successCase() {
        int[] input = {1, 2, 3, 1};

        boolean expected = true;
        boolean actual = ContainsDuplicate.containsDuplicate(input);

        assertEquals(expected, actual);
    }

    @Test
    public void unSuccessCase() {
        int[] input = {1, 2, 3, 4};

        boolean expected = false;
        boolean actual = ContainsDuplicate.containsDuplicate(input);

        assertEquals(expected, actual);
    }
}
