package test.problems.crackingCodingInterview;

import org.junit.Test;
import src.problems.crackingCodingInterview.URLify;

import org.junit.Assert;

public class URLifyTest {
    @Test
    public void successCase() {
        char[] inputWord = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        int inputSize = 13;

        char[] actual = URLify.convert(inputWord, inputSize);
        char[] expected = {'M', 'r', '%', '2', '0', 'J', 'o', 'h', 'n', '%', '2', '0', 'S', 'm', 'i', 't', 'h'};
        Assert.assertArrayEquals(expected, actual);
    }
}
