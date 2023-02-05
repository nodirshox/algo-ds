package src.algorithms;

import java.util.Arrays;

public class DivideAndConquerExample {
    // You're given an array of numbers. You have to add up all the numbers and return the total.
    public int sum(int[] numbers) {
        if (numbers.length == 0)
            return 0;

        return numbers[0] + sum(Arrays.copyOfRange(numbers, 1, numbers.length));
    }

    // Write a recursive function to count the number of items in a list.
    public int count(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        return 1 + count(Arrays.copyOfRange(numbers, 1, numbers.length));
    }
}
