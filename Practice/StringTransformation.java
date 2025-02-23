package Practice;

public class StringTransformation {
	public String solution(String str) {
		StringBuffer strb = new StringBuffer(str);
		for(int i = 0; i < str.length(); i++) {
			if(strb.charAt(i)=='a') {
				strb.setCharAt(i, 'b');
			}
			else if(strb.charAt(i)=='b') {
				strb.setCharAt(i, 'a');
			}
		}
		return strb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTransformation obj = new StringTransformation();
		System.out.println(obj.solution("abaabbcc"));
	}

}
