//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

package Array;

public class CountNumberOfPairs {
	
public int countKDifference(int[] nums, int k) {
	 int n = nums.length;
	 int count = 0;
	 for(int i = 0; i< n-1; i++) {
		 for(int j = i+1 ; j < n ; j++) {
			 if(Math.abs(nums[i]-nums[j])==k) {
				 count++;
			 }
		 }
	 }
     return count;   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumberOfPairs obj = new CountNumberOfPairs();
		int[] nums = {1,2,2,1};
		int k = 1;
		System.out.println(obj.countKDifference(nums, k));
	}

}
