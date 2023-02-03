package test.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.algorithms.BinarySearch;

import static org.junit.Assert.assertEquals;

@DisplayName("Binary search test")
public class BinarySearchTest {
    @Test
    @DisplayName("Number is exists")
    public void numberExists() {
        BinarySearch binarySearch = new BinarySearch();

        int[] numbers = new int[]{-5, 0, 1, 4, 6, 8, 12, 20};
        int number = 8;

        int actual = binarySearch.find(numbers, number);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Number is exists")
    public void numberNotExists() {
        BinarySearch binarySearch = new BinarySearch();

        int[] numbers = new int[]{-5, 0, 1, 4, 6, 8, 12, 20};
        int number = 99;

        int actual = binarySearch.find(numbers, number);
        int expected = -1;

        assertEquals(expected, actual);
    }
}
