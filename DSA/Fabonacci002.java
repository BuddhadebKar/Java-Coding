package DSA;

public class Fabonacci002{
	public int solution(int n){
		int first = 0;
		int second = 1;
		if(n==1){
			return 0;
		}else if(n==2){
			return 1;
		}
		else{
			for(int i = 1; i<=n; i++){
				int sum = first + second;
				
				first = second ;
				second = sum;
			}
			return first;
			
				
		}
		
	}
	public static void main(String []ar){
		Fabonacci002 obj = new Fabonacci002();
		System.out.println(obj.solution(5));
	}
}
