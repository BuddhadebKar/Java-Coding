package DSA;

public class Tribonacci003 {
	public int solution(int n){
		int first = 0;
		int second = 1;
		int third = 1;
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else if(n==2){
			return 1;
		}
		else{
			for(int i = 1; i<=n; i++){
				int sum = first + second + third;
				first = second;
				second = third ;
				third = sum;
			}
			return first;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tribonacci003 obj = new Tribonacci003();
		System.out.println(obj.solution(25));
	}

}
