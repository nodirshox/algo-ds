package test.problems.easy;

import org.junit.Test;
import src.problems.easy.ContainsDuplicateTwo;

import static org.junit.Assert.assertEquals;

public class ContainsDuplicateTwoTest {
    @Test
    public void success() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean expected = true;
        boolean actual = ContainsDuplicateTwo.containsNearbyDuplicate(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    public void unSuccess() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;

        boolean expected = false;
        boolean actual = ContainsDuplicateTwo.containsNearbyDuplicate(nums, k);

        assertEquals(expected, actual);
    }
}
