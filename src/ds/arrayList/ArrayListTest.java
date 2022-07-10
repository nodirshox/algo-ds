package src.ds.arrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    @Test
    public void isEmpty() {
        ArrayList list = new ArrayList();
        boolean actual = list.isEmpty();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void isNotEmpty() {
        ArrayList list = new ArrayList();
        list.add(3);
        boolean actual = list.isEmpty();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void length() {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        int actual = list.length();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void getByIndex() {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        int actual = list.get(1);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void getByNegativeIndex() {
        ArrayList list = new ArrayList();
        list.add(3);
        int actual = list.get(-1);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void getByOutOfIndex() {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        int actual = list.get(2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void contains() {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        boolean actual = list.contains(4);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void notContains() {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        boolean actual = list.contains(5);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void indexOf() {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        int actual = list.indexOf(4);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void notIndexOf() {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        int actual = list.indexOf(5);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        list.clear();
        int actual = list.length();
        int expectedLength = 0;
        assertEquals(expectedLength, actual);

        boolean actualCondition = list.isEmpty();
        boolean expectedCondition = true;
        assertEquals(expectedCondition, actualCondition);
    }

    @Test
    public void resize() {
        ArrayList list = new ArrayList();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        list.add(6); list.add(7); list.add(8); list.add(9); list.add(10);
        list.add(11);

        int actual = list.length();
        int expected = 11;
        assertEquals(expected, actual);
    }
}
