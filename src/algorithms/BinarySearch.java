package src.algorithms;

public class BinarySearch {
    public int find(int[] numbers, int number) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int guess = numbers[middle];

            if (guess == number) {
                return middle;
            } else if (number < guess) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }
}
