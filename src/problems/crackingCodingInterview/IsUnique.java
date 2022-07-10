package src.problems.crackingCodingInterview;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*

Problem 1.1
Is Unique: Implement an algorithm to determine if a string has
all unique characters. What if you cannot use additional data structures?

Time: O(n)
Space: O(1)

 */

public class IsUnique {
    public boolean isUnique(String input) {
        int length = input.length();

        if (length == 0) return false;

        HashSet<Character> characters = new HashSet();

        for (int index = 0; index < length; index++) {
            char current = input.charAt(index);
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
        assertEquals(expected, actual);
    }

    @Test
    public void IsNotUnique() {
        String input = "abcdb";
        boolean actual = isUnique(input);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void withWhiteSpaces() {
        String input = "a b c";
        boolean actual = isUnique(input);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void emptyString() {
        String input = "";
        boolean actual = isUnique(input);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
