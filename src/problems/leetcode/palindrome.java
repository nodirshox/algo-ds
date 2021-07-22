class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x!=0)) {
            return false;
        }
        
        int reverted = 0;
        
        while (x > reverted) {
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }
        System.out.println(reverted);
        return reverted == x || reverted / 10 == x;
    }
}