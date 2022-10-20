package src.problems.easy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Number Sum");
        int[] input11 = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int input12 = 10;
        int[] output11 = { 4, 6 };
        int[] output12 = { -1, 11 };
        System.out.println(Arrays.equals(twoNumberSumReturnsIndexes(input11, input12), output11));
        System.out.println(Arrays.equals(twoNumberSumReturnsValues(input11, input12), output12));
    }
    public static int[] twoNumberSumReturnsIndexes(int[] array, int target) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int difference = target - current;

            if (values.containsKey(difference)) {
                return new int[]{values.get(difference), i};
            }

            values.put(current, i);
        }

        return new int[0];
    }
    public static int[] twoNumberSumReturnsValues(int[] array, int targetSum) {
        int[] output = new int[2];

        HashSet<Integer> sums = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int theDifference = targetSum - element;

            if (sums.contains(theDifference)) {
                output[0] = element;
                output[1] = theDifference;
                break;
            }

            sums.add(element);
        }

        return output;
    }
}