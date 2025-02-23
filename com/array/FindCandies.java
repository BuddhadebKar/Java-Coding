package com.array;

import java.util.List;

public class FindCandies {
    public void kidsWithCandies(int[] candies, int extraCandies) {
		
    	for(int i = 0 ; i < candies.length; i++) {
    		int sum = 0;
    		sum = extraCandies + candies[i];
    		System.out.println(sum);
    		for(int j = 0 ; j< candies.length ; j++) {
    			if(sum>candies[i]) {
    				System.out.println("True");
    			}
    			else {
    				System.out.println("False");
    			}
    		}
    	}
    	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		FindCandies obj = new FindCandies();
		obj.kidsWithCandies(candies, extraCandies);
	}

}
