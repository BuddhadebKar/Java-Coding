package leetCode.practice;

public class Solution {
	
    public int[] twoSum(int[] nums, int target) {
    	int i,j;
    	for(i = 0; i<nums.length-1; i++) {
    		
    		for(j = 0;j<nums.length;j++) {
    			
    			if((nums[i]+nums[j])==target) {
    				
    				return new int[]{i, j};
    				
    			}
    		}
    		
    	}
    	 return new int[]{};
		
        
    }
    
    public static void main(String[] args) {
    	Solution obj = new Solution();
    	int nums[] = {2,7,11,15};
        int target = 9;
        obj.twoSum(nums, target);
    }
}
