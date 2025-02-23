package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger006 {
	public List<Integer> solution(int[] nums, int k) {
		List <Integer> ans = new ArrayList<Integer>();
		int p = nums.length-1; //p = pointer
		int carry = 0;
		while(p>=0 || k>0) {
			int numVal = 0;
			
			if(p>=0) {
				numVal = nums[p];
			}
			
			int d = k % 10;  // last digit of k
			int sum = numVal + d + carry;
			int digit = sum % 10; // because if sum will two digit i need to add
									// only last digit first digit will add to 
									//	previous   
			carry = sum/10;
			ans.add(digit);
			p--;   // pointer moving
			k = k/10 ; //remove last number of k 
		}
		if(carry>0) {
			ans.add(carry);
		}
		Collections.reverse(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddToArrayFormOfInteger006 obj = new AddToArrayFormOfInteger006();
		int []nums = {1,2,0,0};
		System.out.println(obj.solution(nums, 34));
	}

}
