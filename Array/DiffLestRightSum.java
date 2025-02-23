package Array;

import java.util.Arrays;

public class DiffLestRightSum {
	public int[] solution(int[] nums ) {
		int[] different = new int[nums.length];
		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];
		
		for(int i = 0; i< nums.length; i++) {
			
			if(i==0) {
				leftSum[i] = 0;
			}
			if(i==nums.length-1) {
				rightSum[i] = 0;
			}
			
			int leftSum1 = 0;
			for(int j = i ; j > 0; j--) {
				leftSum1+= nums[j-1];
			}
			leftSum[i] = leftSum1;
			
			int rightSum1 = 0;
			for(int k = i ; k < nums.length-1; k++) {
				rightSum1 += nums[k+1];
			}
			rightSum[i] = rightSum1;
		}
		
		for(int l = 0; l < different.length; l++) {
			int d = leftSum[l] - rightSum[l];
			different[l] = Math.abs(d);
		}
		return different;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffLestRightSum obj = new DiffLestRightSum();
		int[] nums = {10,4,8,3};

		 int[] result = obj.solution(nums);
	        System.out.println(Arrays.toString(result));
		
	}

}
