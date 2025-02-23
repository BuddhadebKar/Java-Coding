package Codes;

public class Bulb {
	public int solution(int n) {
		int count = 0;
		String[] status = new String[n];
		for(int i = 0; i < n; i++) {
			status[i] = "on";
		}
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j< n; j++) {
				if(i!=0) {
					status[i] = "off";
				}
			}
			if(i==(n-1)) {
				for(int k = 0; k < status.length; k++) {
					if(status[k]=="on") {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulb obj = new Bulb();
		int m = 1;
		System.out.println(obj.solution(m));	
	}

}
