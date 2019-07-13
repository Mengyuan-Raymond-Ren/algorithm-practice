public class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] table = new boolean[127];
        int i=0, j, k;
        //System.out.println(s.length());
        for(j = 0; j<s.length(); j++) {
            for(k = j; k<s.length(); k++) {
                if(table[s.charAt(k)])
                    break;
                else
                	table[s.charAt(k)] = true;
            }
            if(k - j > i)
                i = k - j;
            if(s.length() - j - 1 < i||i==127)
                break;
            table = new boolean[127];
        }
        
        return i;
    }
}
