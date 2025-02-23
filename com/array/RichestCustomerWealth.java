package com.array;

public class RichestCustomerWealth{
	
	public int m1() {
		int[][] accounts = { {1,5}, {7,3}, {3,5} };

		int sum = 0;
		int sum1 = 0;
		for(int i = 0; i < accounts.length; i++){
			for(int j = 0; j < accounts[i].length; j++){
				if(i==0) {
					sum+=accounts[i][j];
				}
				else {
					sum1+=accounts[i][j];
				}
			}
			if(sum>=sum1) {
				sum1 = 0;
			}
			else {
				sum = sum1;
				sum1 = 0;
			}
		}
		return sum;
		
	}
	public static void main(String[] ar){
		RichestCustomerWealth obj = new RichestCustomerWealth();
		obj.m1();
		System.out.println(obj.m1());
	}
}
