package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfMoves {
	public int solution(int[] seats, int[] students) {
		int total = 0;
		Arrays.sort(students);
		Arrays.sort(seats);
	
		
		for(int i = 0 ; i < students.length ; i++) {
			total += Math.abs(students[i]-seats[i]);
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfMoves obj = new NumberOfMoves();
		int[] seats = {4,1,5,9};
		int[] students = {1,3,2,6};
		System.out.println(obj.solution(seats, students));
	}

}
