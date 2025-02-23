package CollectionFreamWork;

import java.util.ArrayList;
import java.util.List;

public class PairOfSumLessTerget {
	public int countPairs(List<Integer> nums, int terget) {
		int count = 0;
		for(int i=0; i<nums.size()-1; i++) {
			for(int j = i+1; j< nums.size(); j++) {
				if((nums.get(i)+nums.get(j))<terget) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairOfSumLessTerget obj = new PairOfSumLessTerget();
		
		int terget = 2;
		List <Integer> nums = new ArrayList<>();
		nums.add(-1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(1);
		System.out.println(obj.countPairs(nums, terget));
		
	}

}
