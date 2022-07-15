package src.problems.crackingCodingInterview;

import java.util.HashSet;

/*

Problem 1.2
Check Permutation: Given two strings, write a method to device if one is a permutation of the
other.

Time: O(n)
Space: O(1)

 */

public class CheckPermutation {
    public static boolean checkPermutation(String word1, String word2) {
       int wordOneLength = word1.length();
       int wordTwoLength = word2.length();

       if (wordOneLength != wordTwoLength) {
           return false; // permutations must have same length
       }

       int[] letters = new int[128]; // ASCII

        for (int i = 0; i < wordOneLength; i++) {
            letters[word1.charAt(i)]++;
        }

        for (int i = 0; i < wordTwoLength; i++) {
            letters[word2.charAt(i)]--;

            if (letters[word2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }
}
