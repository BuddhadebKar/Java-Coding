
//https://leetcode.com/problems/find-the-highest-altitude/description/

package Array;

public class HighestAltitude {
	public int largestAltitude(int[] gain) {
	        int op = 0;
	        
	        int[] altitudes = new int[gain.length+1];
	        altitudes[0] = 0;
	        int sub = altitudes[0];
	        int largest = sub ;
	        for(int i = 0; i< gain.length; i++) {
	        	sub  = sub + gain[i];
	        	altitudes[i+1] = sub ;
	        	
	        	for(int j = 0; j < altitudes.length; j++) {
	        		if(largest <= altitudes[j]) {
		        		largest = altitudes[j];
		        	}
	        	}
	        }
	        return largest;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighestAltitude obj = new HighestAltitude();
		int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
		System.out.println(obj.largestAltitude(gain));
	}

}
