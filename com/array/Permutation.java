package com.array;
import java.util.Arrays;
import java.util.Scanner;

public class Permutation{
	
	 public int[] buildArray(int[] nums) {
	        
			
			int[] ans = new int[nums.length];
			
			for(int i = 0; i < ans.length ; i++){
				 ans[i] = nums[nums[i]];
			}
	        return ans;
	    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int  size = sc.nextInt();
		System.out.println("Enter array elements : ");
		int[] nums = new int[size];
		for(int i = 0; i < size; i++){
			 nums[i] = sc.nextInt();
		}
		
		
		/*int[] ans = new int[size];
		
		for(int i = 0; i < nums.length ; i++){
			 ans[i] = nums[nums[i]];
		}
		for(int i = 0; i < ans.length ; i++){
			System.out.println(ans[i]);
		}
		*/
		
		Permutation obj = new Permutation();
		obj.buildArray(nums);
		System.out.println(Arrays.toString(obj.buildArray(nums)));
	}
}
