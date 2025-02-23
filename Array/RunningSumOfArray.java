//running-sum-of-1d-array
package Array;

import java.util.Arrays;

public class RunningSumOfArray {
	int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			
			sum = sum + nums[i];
			result[i] = sum;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningSumOfArray obj = new RunningSumOfArray();
		int[] nums = {1,2,3,4};
		
		 int[] result = obj.runningSum(nums);
	        System.out.println("Output: " + Arrays.toString(result));
	}

}
