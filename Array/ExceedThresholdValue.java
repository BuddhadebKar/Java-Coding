//minimum-operations-to-exceed-threshold-value-i

package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceedThresholdValue {
	public int minOperations(int[] nums, int k) {
		
		List<Integer> l = new ArrayList<Integer>();
		Arrays.sort(nums);
		int count= 0;
		for(int i = 0; i<nums.length; i++) {
			l.add(nums[i]);
		}
		for(int i = 0; i< l.size();i++) {
			if(k<=l.get(i)) {
				count++;
			}
		}
		
		return nums.length-count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceedThresholdValue obj = new ExceedThresholdValue();
		int[] nums = {2,11,10,1,3};
		int k = 10;
		System.out.println(obj.minOperations(nums, k));
	}

}
