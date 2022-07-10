package src.problems.crackingCodingInterview;
import java.util.HashSet;
import org.junit.Test;

/*

Problem 1.1
Is Unique: Implement an algorithm to determine if a string has
all unique characters. What if you cannot use additional data structures?

Time: O(n)
Space: O(1)

 */

import static org.junit.Assert.assertEquals;

public class IsUnique {
    public boolean isUnique(String word) {
        HashSet<Character> characters = new HashSet();

        for (int index = 0; index < word.length(); index++) {
            char current = word.charAt(index);
            if(characters.contains(current)) {
                return false;
            }
            characters.add(current);
        }

        return true;
    }

    @Test
    public void testIsUniqueSuccess() {
        String input = "abcd";
        boolean actual = isUnique(input);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsNotUnique() {
        String input = "abcdb";
        boolean actual = isUnique(input);
        boolean expected = false;
        assertEquals(actual, expected);
    }
}
