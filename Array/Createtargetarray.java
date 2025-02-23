package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Your task is to create target array under the following rules:


public class Createtargetarray {
	
	public int[] createTargetArray(int[] nums , int[] index) {
		
		List<Integer> targetList = new ArrayList<>();
		for(int i = 0; i<nums.length; i++) {
			targetList.add(index[i],nums[i]);
		}
		
		
		int[] target = new int[nums.length];
		for(int i = 0; i<targetList.size(); i++) {
			target[i] = targetList.get(i);
		}
		return target;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Createtargetarray obj = new Createtargetarray();
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(obj.createTargetArray(nums, index)));
	}

}
