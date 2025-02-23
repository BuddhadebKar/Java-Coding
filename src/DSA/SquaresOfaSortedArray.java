package DSA;

import java.util.Arrays;

public class SquaresOfaSortedArray {
	int[] solution(int[] nums) {
		for(int i = 0; i< nums.length; i++) {
			nums[i] = nums[i]*nums[i];
		}
		Arrays.sort(nums);
		
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquaresOfaSortedArray obj = new SquaresOfaSortedArray();
		int []nums = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(obj.solution(nums)));
	}

}
