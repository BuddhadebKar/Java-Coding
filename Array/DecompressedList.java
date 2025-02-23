package Array;

import java.util.ArrayList;

//We are given a list nums of integers representing a list compressed with run-length encoding.

import java.util.Arrays;
import java.util.List;

public class DecompressedList {
	
	public int[] decompressRLElist(int[] nums) {
		
		
		
		List<Integer> l = new ArrayList();
		for(int i = 0; i< 2; i++) {
			int freq = nums[2*i];
			int val = nums[2*i+1];
			while(freq!=0) {
				l.add(val);
				freq--;
			}
		}
		int[] output = new int[l.size()];
		for(int k = 0; k< l.size(); k++) {
			output[k] = l.get(k);
		}
		
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecompressedList obj = new DecompressedList();
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(obj.decompressRLElist(nums)));
	}

}
