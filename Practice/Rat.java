package Practice;

public class Rat {
	public int reqFood(int r, int unit, int[] arr ) {
		int foodReq = r*unit;
		int food = 0;
		int reqHome = 0;
		int foodSum = 0;
		for(int i = 0; i< arr.length; i++) {
			foodSum+=arr[i];
		}
		
		if(arr.length == 0) {
			return -1;
		}
		else if(foodSum<foodReq) {
			return 0;
		}
		else {
		for(int i = 0; i<arr.length; i++) {
			if(food<foodReq) {
				food = food + arr[i];
			}
			else if(food>=foodReq) {
				reqHome = i;
				break;
			}
		}
		return reqHome;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rat obj = new Rat();
		int r= 7;
		int unit = 2;
		int[] arr = { 1,3 };
		System.out.println(obj.reqFood(r, unit, arr));
		}

}
