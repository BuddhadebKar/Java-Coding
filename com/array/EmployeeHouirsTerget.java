package com.array;

public class EmployeeHouirsTerget {
	
	int findEmployee(int[] hours , int target) {
		int count = 0;
		
		for(int i = 0 ; i < hours.length ; i++) {
			if(hours[i]>=2) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHouirsTerget obj = new EmployeeHouirsTerget();
		int[] hours = {0,1,2,3,4};
		int target = 2;
		System.out.println(obj.findEmployee(hours, target));
	}

}
