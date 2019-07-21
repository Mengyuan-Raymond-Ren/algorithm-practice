public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x / 10 == 0) {
            return true;
        }
        
        
        int digits = 0;
        for(int i = x; i != 0; i/=10) {
            digits++;
        }
        
        int value = x;
        int j = 0;
        while(digits > j) {
            j++;
            digits--;
            int left = value / ((int)Math.pow(10, digits)) - value / ((int)Math.pow(10, digits + 1)) * 10;
            int right = (value % ((int)Math.pow(10, j)) - value % ((int)Math.pow(10, j - 1))) / ((int)Math.pow(10, j - 1));
            
            if(left != right) {
                return false;
            }
        }
        
        return true;
    }
}
