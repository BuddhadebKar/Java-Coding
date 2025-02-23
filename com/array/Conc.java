package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Conc{
	
	
	public int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int size = 2*n;
		int ans[] = new int[size];

		for(int i = 0 ; i < n ; i++){
			
			ans[i] = nums[i];
			ans[i+n] = nums[i];
		}
		
		return ans;
		
	}
	public static void main(String[] args){
		Conc obj = new Conc();
		int[] nums = {1, 2, 1};
		obj.getConcatenation(nums);
		System.out.println(Arrays.toString(obj.getConcatenation(nums)));
		
		
		/*int [] nums = {1,2,1};
		int n = nums.length;
		int size = 2*n;
		int ans[] = new int[size];

		for(int i = 0 ; i < n ; i++){
			ans[i] = nums[i];
			ans[i+n] = nums[i];
		}
		System.out.print("[ ");
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.print("]");
		*/
	}
}



