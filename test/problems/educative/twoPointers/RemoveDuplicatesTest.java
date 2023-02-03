package test.problems.educative.twoPointers;

import org.junit.Test;
import src.problems.educative.twoPointers.RemoveDuplicates;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    @Test
    public void successCase() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {2, 3, 3, 3, 6, 9, 9};
        int expected = 4;
        int actual = removeDuplicates.solution(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void successCaseTwo() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {2, 2, 2, 11};
        int expected = 2;
        int actual = removeDuplicates.solution(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void successCaseThree() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {2, 3, 3, 3, 6, 9, 9};
        int expected = 4;
        int actual = removeDuplicates.remove(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void successCaseFour() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {2, 2, 2, 11};
        int expected = 2;
        int actual = removeDuplicates.remove(nums);

        assertEquals(expected, actual);
    }
}
