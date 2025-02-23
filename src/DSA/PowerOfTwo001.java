package DSA;

public class PowerOfTwo001 {
	public boolean solution(int n) {
		if(n<=0) {
			return false;
		}
		else if(n==1){
			return true;
		}
		else {
			
			while(n%2==0) {
				n = n/2;
			}
			
			if(n==1) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOfTwo001 obj = new PowerOfTwo001();
		System.out.println(obj.solution(16));
		
	}

}
