package Array;

public class sumOfAllSubset {
public int subsetXORSum(int[] nums) {
	
	int[] arr = {};
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
	      
	      // For loop for end index
	      for (int j = i; j < nums.length; j++) {
	      
	         // For loop to print subarray elements
	         for (int k = i; k <=j; k++) {
	             arr[k] = nums[k];
	         }
	         if(arr.length==1) {
	        	 sum += arr[i];
	         }
	      }
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
