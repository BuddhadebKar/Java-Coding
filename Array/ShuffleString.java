package Array;

public class ShuffleString {
	
	public String restoreString(String s, int[] indices) {
		String op = "";
		char[] ar = new char[s.length()];
		for(int i = 0 ; i < s.length() ; i++) {
			ar[indices[i]] = s.charAt(i);
		}
		
		
		return new String(ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuffleString obj = new ShuffleString();
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		System.out.println(obj.restoreString(s, indices));
	}

}
