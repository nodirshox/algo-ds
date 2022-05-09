package src.problems.easy;

import java.util.Arrays;

public class sortedSquaredArray {
    public static void main(String[] args) {
        System.out.println("Sorted Squared Array");
        // there is a bug when passed negative number
        int[] input31 = { 1, 2, 3, 5, 6, 8, 9 };
        int[] output31 = { 1, 4, 9, 25, 36, 64, 81 };
        System.out.println(Arrays.equals(sortedSquaredArray(input31), output31));
    }

    public static int[] sortedSquaredArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index] = array[index] * array[index];
        }

        return array;
    }
}
