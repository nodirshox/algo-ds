package src.problems.crackingCodingInterview;

/*

Problem 1.4
Palindrome Permutation
Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards.
A permutation is a rearrangement of letters. The palindrome does not need to be
limited to just dictionary words.

 */

public class PalindromePermutation {
    public static boolean palindromePermutation(String word) {
        int[] chars = new int[128]; // ASCII

        for (int i = 0; i < word.length(); i++) {
            chars[word.charAt(i)]++;
        }
        boolean oddChars = false;
        for (int i = 0; i < 128; i++) {
            if (chars[i] % 2 == 1) {
                if (oddChars) return false;

                oddChars = true;
            }
        }

        return true;
    }
}
