public class Solution {
    public int[] twoSum(int[] nums, int target) {
		int[] backup = Arrays.copyOf(nums, nums.length);
        int[] temp = new int[2];
        int i=0, j=0, a=0, b=0;
        Arrays.sort(nums);
        for(i=0; i<nums.length; i++) {
            for(j=0; j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    temp[0] = nums[i];
                    temp[1] = nums[j];
                    break;
                }
                else if(nums[i]+nums[j]>target)
                    break;
            }
            if(temp[0]+temp[1]==target)
                break;
        }
        for(int x=0; x<backup.length; x++) {
            if(backup[x] == temp[0]) {
            	a=x+1;
            	break;
            }            
        }
        
        for(int y=0; y<backup.length; y++) {
            if(backup[y] == temp[1]) {
            	if(y+1==a)
            		continue;
            	else {
            		b=y+1;
            		System.out.println(temp[0]+" "+temp[1]);
            		break;
            	}
            }
        }
        if(a<b) {
            temp[0] = a;
            temp[1] = b;
        }
        else {
            temp[0] = b;
            temp[1] = a;
        }
        return temp;
    }
