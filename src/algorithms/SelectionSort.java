package src.algorithms;

public class SelectionSort {
    public int[] sort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex])
                    minIndex = j;
            }

            int minNumber = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = minNumber;
        }

        return numbers;
    }
}
