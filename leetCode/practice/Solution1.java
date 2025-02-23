package leetCode.practice;

public class Solution1 {
	
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
    	Solution1 obj = new Solution1();
    	int nums[] = {3,2,4};
        int target = 6;
        obj.twoSum(nums, target);
    }
}
