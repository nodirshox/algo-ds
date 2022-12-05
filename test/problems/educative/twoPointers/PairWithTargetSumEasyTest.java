package test.problems.educative.twoPointers;

import org.junit.Test;
import src.problems.educative.twoPointers.PairWithTargetSumEasy;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class PairWithTargetSumEasyTest {
    @Test
    public void successCase() {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 6;

        PairWithTargetSumEasy pairWithTargetSumEasy = new PairWithTargetSumEasy();
        int[] actual = pairWithTargetSumEasy.solution(nums, target);
        int[] expected = new int[]{1, 3};

        assertTrue(Arrays.equals(expected, actual));
    }
    @Test
    public void successCaseTwo() {
        int[] nums = {2, 5, 9, 11};
        int target = 11;

        PairWithTargetSumEasy pairWithTargetSumEasy = new PairWithTargetSumEasy();
        int[] actual = pairWithTargetSumEasy.solution(nums, target);
        int[] expected = new int[]{0, 2};

        assertTrue(Arrays.equals(expected, actual));
    }
}
