
//how-many-numbers-are-smaller-than-the-current-number

package Array;

public class SmallerThenCurrentNumber {
	int[] smallerNumbersThanCurrent(int[] nums) {
		
		int[] result =new int [nums.length] ;
		for(int i = 0; i < nums.length; i++) {
			int count = 0;
			for(int j = 0 ; j < nums.length; j++) {
				if((nums[i]>nums[j]) && (j != i )) {
					count++;
				}
			}
			result[i] = count;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallerThenCurrentNumber obj = new SmallerThenCurrentNumber();
		int nums [] = {8,1,2,2,3};
		int[] result = obj.smallerNumbersThanCurrent(nums);
		System.out.print("[ ");
		for (int count : result) {
            System.out.print(count + " , ");
        }
		System.out.print( "]");
	}

}
