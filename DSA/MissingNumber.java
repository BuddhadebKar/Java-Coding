package DSA;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int len = nums.length;
        int expectSum = len * (len+1)/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        
        return expectSum - actualSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []nums = {3,0,1};
		 MissingNumber obj = new MissingNumber();
		 System.out.println(obj.missingNumber(nums));

	}

}
