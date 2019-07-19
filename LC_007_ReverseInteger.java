public class Solution {
    public int reverse(int x) {
        boolean neg = x < 0;
        
        String abc = "" + x;
        
        StringBuilder cba = new StringBuilder();
        
        for(int i = abc.length() - 1; i >= 1; i--) {
            cba.append(abc.charAt(i));
        }
        
        if(!neg) {
            cba.append(abc.charAt(0));
        }
        
        int toReturn = Long.parseLong(cba.toString()) > Integer.MAX_VALUE ? 0 : Integer.parseInt(cba.toString());
        
        return !neg ? toReturn : 0 - toReturn;
    }
}
