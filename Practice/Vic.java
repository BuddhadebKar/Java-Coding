package Practice;

public class Vic {

		

	public static void main(String[] args) {
		int totalVic = 200;
		int totalWhi = 540;
		for (int fw = 0; fw <= totalVic; fw++) {
			int tw = totalVic - fw;
			int newWhi = (fw * 4) + (tw * 2);
			if (newWhi == totalWhi) {
				System.out.println("NUm of twoWHi is " + tw);
				System.out.println("Num of fw is " + fw);
				break;
			}
		}
	}
}
