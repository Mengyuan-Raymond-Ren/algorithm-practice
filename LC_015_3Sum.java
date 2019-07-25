public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> all = new ArrayList<>();      
        
        for(int i = 0; i < nums.length - 2; i++) {
        	int j = i + 1, k = nums.length - 1;
        	while(j < k) {
        		if(nums[i] + nums[j] + nums[k] == 0) {
        			List<Integer> temp = new ArrayList<Integer>();
        			temp.add(nums[i]);
        			temp.add(nums[j]);
        			temp.add(nums[k]);
        			all.add(temp);
        			while(nums[j] == nums[j + 1] && j + 1 < k) {
        				j++;
        			}
            		while(nums[k] == nums[k - 1] && j < k - 1) {
            			k--;
        			}
        			j++;
        			k--;
        		}
        		else if(nums[i] + nums[j] + nums[k] < 0) {
        			j++;
        		}
        		else if(nums[i] + nums[j] + nums[k] > 0) {
        			k--;
        		}
        	}
        	while(nums[i] == nums[i + 1] && i + 1 < nums.length - 2)
        		i++;
        }
        
        return all;
    }
}
