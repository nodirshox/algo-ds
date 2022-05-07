package src.problems.easy;
import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] input11 = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int input12 = 10;
        int[] output11 = { -1, 11 };
        System.out.println(Arrays.equals(twoNumberSum(input11, input12), output11));
        System.out.println(Arrays.equals(twoNumberSumSecondSolution(input11, input12), output11));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] output = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] + array[j] == targetSum) {
                    output[0] = array[i];
                    output[1] = array[j];
                    break;
                }
            }
        }

        return output;
    }

    public static int[] twoNumberSumSecondSolution(int[] array, int targetSum) {
        int[] output = new int[2];

        HashSet<Integer> sums = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int theDifference = targetSum - element;

            if (sums.contains(theDifference)) {
                output[0] = element;
                output[1] = theDifference;
                break;
            } else {
                sums.add(element);
            }
        }

        return output;
    }
}