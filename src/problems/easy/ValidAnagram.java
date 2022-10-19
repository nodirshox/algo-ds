package src.problems.easy;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] myList = new int[28];

        for (int index = 0; index < s.length(); index++) {
            myList[s.charAt(index) - 'a']++;
            myList[t.charAt(index) - 'a']--;
        }

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] != 0)
                return false;
        }

        return true;
    }
}
