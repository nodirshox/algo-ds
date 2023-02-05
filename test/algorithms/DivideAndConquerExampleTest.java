package test.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.algorithms.DivideAndConquerExample;

import static org.junit.Assert.assertEquals;

@DisplayName("Divide ad conquer")
public class DivideAndConquerExampleTest {
    @Test
    @DisplayName("Sum method")
    public void sumSuccess() {
        DivideAndConquerExample algorithm = new DivideAndConquerExample();

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int expected = 15;
        int actual = algorithm.sum(numbers);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sum method with empty array")
    public void sumSuccessWithEmptyArray() {
        DivideAndConquerExample algorithm = new DivideAndConquerExample();

        int[] numbers = new int[]{};
        int expected = 0;
        int actual = algorithm.sum(numbers);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Count method")
    public void countSuccessCase() {
        DivideAndConquerExample algorithm = new DivideAndConquerExample();

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        int expected = numbers.length;
        int actual = algorithm.count(numbers);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Count method with empty array")
    public void countSuccessCaseEmptyArray() {
        DivideAndConquerExample algorithm = new DivideAndConquerExample();

        int[] numbers = new int[]{};
        int expected = numbers.length;
        int actual = algorithm.count(numbers);

        assertEquals(expected, actual);
    }
}
