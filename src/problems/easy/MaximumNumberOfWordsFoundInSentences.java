package src.problems.easy;
import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        // https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
        System.out.println("Maximum Number of Words Found in Sentences");
        String[] input = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int output = 6;
        System.out.println(mostWordsFound(input) == output);
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] splintedWords = sentences[i].split(" ");
            int lengthOfWord = splintedWords.length;
            if (lengthOfWord > max)
                max = lengthOfWord;
        }

        return max;
    }
}
