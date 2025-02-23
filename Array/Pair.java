package Array;

public class Pair {
	
	public int numberOfPairs(int[] nums1, int[] nums2, int k) {
		int output = 0;
		
		for(int i = 0; i< nums1.length; i++) {
			for(int j = 0; j < nums2.length; j++) {
				int mult = nums2[j]*k;
				if(nums1[i]%mult == 0) {
					output++;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair obj =  new Pair();
		int[] nums1 = {1,3,4};
		int[] nums2 = {1,3,4};
		int k = 1;
		System.out.println(obj.numberOfPairs(nums1, nums2, k));
	}

}
