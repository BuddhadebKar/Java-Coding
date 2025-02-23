package DSA;

public class RemoveElement009 {
	int solution(int []nums, int val) {
		int k =0;
 		for(int i = 0; i< nums.length; i++) {
			if(val != nums[i]) {
                nums[k] = nums[i];
                k++;
			}	
		}
		return k;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement009 obj = new RemoveElement009();
		int []nums = {3,2,2,3};
		int val = 2;
		System.out.println(obj.solution(nums, val));
		}

}
