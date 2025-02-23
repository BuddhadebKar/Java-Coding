package com.array;

import java.util.Arrays;

public class ShuffleArray{
	public static void main(String[] ar){
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		int[] ans = new int[nums.length];
		for(int i = 0; i < nums.length;i++){
			if((i==0) || (i==(nums.length-1))) {
				ans[i] = nums[i];
			}
			else if(i%2!=0) {
				ans[i] = nums[n];
				n++;
			}
			else{
				ans[i] = nums[i/2];
			}
		}
		for(int i =0;i<nums.length;i++) {
			System.out.println(ans[i]);
		}
		
	}
 }