package DSA;

public class WaterBottles004 {
	public int solution(int numBottles, int numExchange) {
		int initialDrink = numBottles;
		int newBottles,totalDrink = initialDrink,remain;
		while(initialDrink >= numExchange) {               // 9  > 3 true       6 != 0   true
				newBottles = initialDrink / numExchange;  // nB = 9/3 = 3		nB = 6/4 = 1
				remain = initialDrink % numExchange;	  // r = 3%3 = 0		r = 6%4 = 2
				totalDrink = totalDrink + newBottles;     // tD = 9+3 = 12		tD = 18 + 1 = 19
				initialDrink = newBottles + remain;       // iD = 3+0 = 3		iD = 1 + 2 = 3
			
		}
		
		return totalDrink;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterBottles004 obj = new WaterBottles004();
		System.out.println(obj.solution(9, 3));
	}

}