package problems.easy;
/*
    13.08.2021 - Nodirbek Ergashev
    https://leetcode.com/problems/hamming-distance/
*/
class Solution {
    public String addZero(String word, int max) {
        public String addZero(String word, int max) {
        int min = word.length();
        while (min <= max) {
            word = "0" + word;
            max--;
        }
        
        return word;
    }
    public int hammingDistance(int x, int y) {
        String xString = Integer.toBinaryString(x);
        String yString = Integer.toBinaryString(y);
        
        String s1 = addZero(xString, Math.max(xString.length(), yString.length()));
        String s2 = addZero(yString, Math.max(xString.length(), yString.length()));
        
        int distance = 0;
        
        for (int index = 0; index < s1.length(); index++) {
            if (s1.charAt(index) != s2.charAt(index)) {
                distance++;
            }
        }
        
        return distance;
    }
}