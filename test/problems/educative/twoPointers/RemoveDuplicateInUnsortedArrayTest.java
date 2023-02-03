package test.problems.educative.twoPointers;

import org.junit.Test;
import src.problems.educative.twoPointers.RemoveDuplicateInUnsortedArray;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateInUnsortedArrayTest {
    @Test
    public void successCase() {
        RemoveDuplicateInUnsortedArray solution = new RemoveDuplicateInUnsortedArray();
        int[] nums = new int[]{3, 2, 3, 6, 3, 10, 9, 3};
        int key = 3;

        int expected = 4;
        int actual = solution.remove(nums, key);
        assertEquals(expected, actual);
    }

    @Test
    public void successCaseTwo() {
        RemoveDuplicateInUnsortedArray solution = new RemoveDuplicateInUnsortedArray();
        int[] nums = new int[]{2, 11, 2, 2, 1};
        int key = 2;

        int expected = 2;
        int actual = solution.remove(nums, key);
        assertEquals(expected, actual);
    }
}
