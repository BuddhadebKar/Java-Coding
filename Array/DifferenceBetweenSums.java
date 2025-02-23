package Array;

public class DifferenceBetweenSums {
	
	public int solution(int[] nums) {
		int difference = 0;
		int eSum= 0;
		int oSum = 0;
		for(int i = 0; i< nums.length; i++) {
			oSum += nums[i];
			int div = nums[i];
			while(div>0) {
				int rem = div%10;
				eSum = eSum + rem;
				div = div / 10;
			}
		}
		difference = Math.abs(oSum-eSum);
		return difference;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,15,6,3};
		DifferenceBetweenSums obj = new DifferenceBetweenSums();
		System.out.println(obj.solution(nums));		
	}

}
