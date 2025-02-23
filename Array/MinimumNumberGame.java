package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberGame {
	
	public int[] numberGame(int[] nums) {
		int[] arr = new int[nums.length];
		int temp=0;
		for(int i = 0; i< nums.length; i++) {
			for(int j = 1; j< nums.length-i ; j++) {
				if(nums[j]<nums[j-1]) {
					temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
			}
		}
		List<Integer> l1 = new ArrayList<>();
		for(int i = 0; i< nums.length; i++) {
			int alice = nums[i];
			int bob = nums[i+1];
			l1.add(bob);//3
			l1.add(alice);//2
			i++;
		}
		
		for(int i = 0; i< l1.size(); i++) {
			arr[i] = l1.get(i);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberGame obj = new MinimumNumberGame();
		int[] nums = {5,4,2,3};
		System.out.println(Arrays.toString(obj.numberGame(nums)));
	}

}
