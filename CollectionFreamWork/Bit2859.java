package CollectionFreamWork;

import java.util.ArrayList;
import java.util.List;

public class Bit2859 {
	public int sumIndicesWithKSetBits(List<Integer>nums, int k) {
		int length = nums.size();
		int rem, retn = 0;
		int sum = 0;
		for(int i = 0; i< length ; i++) {
			
			int div = i;
			while(div>0) {
				rem = div % 2;
				div = div / 2;
				sum = sum + rem;
			}
			if(sum == k) {
				retn = retn + nums.get(i);
			}
			sum = 0;
			
		}
		
		return retn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bit2859 obj = new Bit2859();
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(10);
		nums.add(1);
		nums.add(5);
		nums.add(2);
		int k = 1;
		System.out.println(obj.sumIndicesWithKSetBits(nums, k));
	}

}
