package CollectionFreamWork;

import java.util.ArrayList;
import java.util.List;

public class ListPrc {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
       
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int i = 0; i< candies.length; i++) {
        	if(max<=candies[i]) {
        		max = candies[i]; 
        	}
        }
        
        for (int candy : candies) {
        	if((candy+extraCandies)>=max) {
        		result.add(true);
        	}
        	else {
        		result.add(false);
        	}
        }
        
        return result;
        
    }
    
    public static void main(String[] args) {
    	ListPrc solution = new ListPrc();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result); // Output: [true, true, true, false, true]
    }
}
