package src.problems.crackingCodingInterview;

/*

Problem 1.5
One Away. Check whether given two strings only one insertion or replacement.
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bae -> false

 */

public class OneAway {
    public static boolean check(String str, String str2) {
        int word1Length = str.length();
        int word2Length = str2.length();
        if (Math.abs(word1Length - word1Length) > 1) return false;

        int minLength = word1Length < word2Length ? word1Length : word2Length;
        int pointer1 = 0;
        int pointer2 = 0;
        int counterMismatch = 0;
        for (int i = 0; i < minLength; i++) {
            if (str.charAt(pointer1) != str2.charAt(pointer2)) {
                if (word1Length != word2Length) {
                    if (word1Length < word2Length) pointer2++;
                    if (word1Length > word2Length) pointer1++;

                    counterMismatch++;
                    continue;
                }
                counterMismatch++;
            }
            pointer1++;
            pointer2++;
        }

        return counterMismatch <= 1;
    }
}
