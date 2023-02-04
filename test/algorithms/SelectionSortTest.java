package test.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.algorithms.SelectionSort;

@DisplayName("Selection sort test")
public class SelectionSortTest {
    @Test
    @DisplayName("Success case")
    public void successCase() {
        SelectionSort selectionSort = new SelectionSort();

        int[] numbers = new int[]{5, 3, 6, 2, 10};
        int[] expected = new int[]{2, 3, 5, 6, 10};

        int[] actual = selectionSort.sort(numbers);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Success case with negative numbers")
    public void successCaseWithNegativeNumbers() {
        SelectionSort selectionSort = new SelectionSort();

        int[] numbers = new int[]{5, -3, 6, 2, -10};
        int[] expected = new int[]{-10, -3, 2, 5, 6};

        int[] actual = selectionSort.sort(numbers);

        Assertions.assertArrayEquals(expected, actual);
    }
}
