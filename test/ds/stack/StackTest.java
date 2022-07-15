package test.ds.stack;

import org.junit.Test;
import src.ds.stack.Stack;
import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void isEmpty() {
        Stack stack = new Stack();
        boolean actual = stack.isEmpty();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void isNotEmpty() {
        Stack stack = new Stack();
        stack.push(3);

        boolean actual = stack.isEmpty();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void checkEmptySize() {
        Stack stack = new Stack();
        int actual = stack.size();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void checkSizeWhenPush() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);

        int actual = stack.size();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void checkSizeWhenPushAndPop() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        stack.pop();

        int actual = stack.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void checkPush() {
        Stack stack = new Stack();
        stack.push(3);

        int actualSize = stack.size();
        int expectedSize = 1;
        assertEquals(expectedSize, actualSize);

        int actualData = (int) stack.top();
        int expectedData = 3;
        assertEquals(expectedData, actualData);
    }

    @Test
    public void checkPushTwoItems() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);

        int actualSize = stack.size();
        int expectedSize = 2;
        assertEquals(expectedSize, actualSize);

        int actualData = (int) stack.top();
        int expectedData = 4;
        assertEquals(expectedData, actualData);
    }

    @Test
    public void checkPop() {
        Stack stack = new Stack();

        assertEquals(null, stack.pop());

        stack.push(3);
        int actualData = (int) stack.pop();
        int expectedData = 3;
        assertEquals(expectedData, actualData);
    }

    @Test
    public void fullStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
        int actualSize = stack.size();
        int expectedSize = 5;

        assertEquals(expectedSize, actualSize);
    }
}
