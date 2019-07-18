public class Solution {
    public String convert(String s, int numRows) {
        if(s.length() <= 2 || numRows == 1) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < numRows; i++) {
            if(i == 0 || i == numRows - 1) {
                int j = i;
                while(j < s.length()) {
                    sb.append(s.charAt(j));
                    j = j + (numRows - 1) * 2;
                }
            }
            else {
                int j = i;
                while(j < s.length()) {
                    sb.append(s.charAt(j));
                    j = j + (numRows - i - 1) * 2;
                    if(j >= s.length()) {
                        break;
                    }
                    sb.append(s.charAt(j));
                    j = j + i * 2;
                }
            }
        }
        
        return sb.toString();
    }
}
