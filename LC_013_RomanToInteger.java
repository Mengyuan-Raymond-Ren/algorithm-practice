public class Solution {
    public int romanToInt(String s) {
        int[] values = {1, 5, 10, 50, 100, 500 ,1000};
		int result = 0;
		for(int i=s.length()-1;i>=0;i--)  
        {  
            if(i==s.length()-1)  
            {  
                result = values[getValue(s.charAt(i))];  
                continue;  
            }  
            if(values[getValue(s.charAt(i))] >= values[getValue(s.charAt(i + 1))])  
                result += values[getValue(s.charAt(i))];  
            else  
                result -= values[getValue(s.charAt(i))];  
        }
        return result;
    }
    
    public int getValue(char c)
	{
		String scale = "IVXLCDM";
		return scale.indexOf(c);
	}
}
