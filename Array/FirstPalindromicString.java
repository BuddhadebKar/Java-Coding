package Array;

public class FirstPalindromicString {
	String solution(String[] words) {
		
		String opString = "";
		
		for(int i = 0; i<words.length; i++) {
			
			String str = words[i];
			String rstr = "";
			char ch ;
			for(int j = str.length()-1; j>=0; j--) {
				ch = str.charAt(j);
				rstr+=ch;
			}
			if(str.equals(rstr)) {
				opString = str;
				break;
			}
		}
		return opString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstPalindromicString obj = new FirstPalindromicString();
		String[] words = {"abc","car","ada","racecar","cool"};
		System.out.println(obj.solution(words));
	}

}
