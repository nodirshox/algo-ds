class Solution {
    public int reverse(int x) {
        int reversed = 0;
        Boolean isPositive = false;
        
        if (x < 0) {
            isPositive = true;
            x *= -1;
        }
        
        while (x > 0) {
            int modular = x % 10;
            reversed += modular;
            
            if (x > 9) {
                reversed *= 10;
            }
            
            x -= modular;
            x /= 10;
        }
        
        if (isPositive) {
            reversed *= -1;
        }
        
        return reversed;
    }
}