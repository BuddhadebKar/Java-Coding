package DSA;

import java.util.Arrays;

public class TwoSum005 {
	public int[] solution(int []arr, int target) {
		
		int [] ans = new int[2];
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					ans[0] = i;
					ans[1] = j ;
					return ans;
				}
			}
		}
        return new int[]{-1, -1}; // Return an invalid index if no solution is found
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum005 obj = new TwoSum005();
		int []nums = {2,7,11,15};
		System.out.println(Arrays.toString(obj.solution(nums, 9)));
	}

}
