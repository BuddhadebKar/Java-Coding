package Codes;

public class EquilibriumIndex {
	
    public static int findEquilibrium(int[] arr) {
    	int totalSum = 0;
    	for(int i = 0 ; i < arr.length ; i++) {
    		totalSum+=arr[i];
    	}
    	
    	
        for(int i = 0; i<arr.length; i++) {
        	int leftSum = 0;
        	for(int j = 0 ; j < i ; j++) {
        		leftSum = leftSum+arr[j];
       		}
        	
        	int rightSum = 0;
        	for(int k = i+1 ; k < arr.length ; k++) {
        		rightSum = rightSum + arr[k];
        	}
        	
        	if(leftSum == rightSum) {
        		return i;
        	}
        }
		return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 1, 6};
        System.out.println(findEquilibrium(arr)); // Output: 2
    }
}