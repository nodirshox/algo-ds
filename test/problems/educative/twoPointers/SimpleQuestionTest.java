package test.problems.educative.twoPointers;

import org.junit.Test;
import src.problems.educative.twoPointers.SimpleQuestion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleQuestionTest {
    @Test
    public void BruteForceReturnsTrue() {
        SimpleQuestion simpleQuestion = new SimpleQuestion();
        int[] nums = {1, 2, 3, 4, 6};
        int target = 6;

        assertTrue(simpleQuestion.bruteForce(nums, target));
    }

    @Test
    public void BruteForceReturnsFalse() {
        SimpleQuestion simpleQuestion = new SimpleQuestion();
        int[] nums = {1, 2, 3, 4, 6};
        int target = 11;

        assertFalse(simpleQuestion.bruteForce(nums, target));
    }
}
