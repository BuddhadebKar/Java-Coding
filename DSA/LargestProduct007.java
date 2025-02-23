package DSA;

public class LargestProduct007 {
	public int maxProduct(int[] nums) {
        int product = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(product<(nums[i]-1)*(nums[j]-1)){
                    product = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return product;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestProduct007 obj = new LargestProduct007();
		int []nums = {3,4,5,2};
		System.out.println(obj.maxProduct(nums));
		}

}
