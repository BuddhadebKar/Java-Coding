package Practice;

public class ArrayEquilibrium {
	public int solution(int[] arr) {
		int point = 0;
		int left = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			left = left + arr[i];
			for(int j = i+1; j < arr.length; j++ ) {
				sum = sum + arr[j];
			}
			if(left == sum) {
				point = i;
				break;
			}
			else {
				sum = 0;
			}
		}
		if(point!=0) {
			return point;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 7, 2};
		ArrayEquilibrium obj = new ArrayEquilibrium();
		System.out.println(obj.solution(arr));
	}

}
