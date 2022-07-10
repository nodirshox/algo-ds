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

    public boolean isUniqueSolutionByBook(String input) {
        int length = input.length();
        if (length > 128) return false;

        boolean[] list = new boolean[128];

        for (int i = 0; i < length; i++) {
            int value = input.charAt(i);
            if(list[value]) {
                return false;
            }
            list[value] = true;
        }

        return true;
    }

    @Test
    public void IsUniqueSuccess() {
        String input = "abcd";
        boolean expected = true;

        boolean actual = isUnique(input);
        assertEquals(expected, actual);

        boolean actualSolutionByBook = isUniqueSolutionByBook(input);
        assertEquals(expected, actualSolutionByBook);
    }

    @Test
    public void IsNotUnique() {
        String input = "abcdb";
        boolean expected = false;

        boolean actual = isUnique(input);
        assertEquals(expected, actual);

        boolean actualSolutionByBook = isUniqueSolutionByBook(input);
        assertEquals(expected, actualSolutionByBook);
    }
}
