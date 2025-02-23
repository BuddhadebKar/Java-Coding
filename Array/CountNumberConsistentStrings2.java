//https://leetcode.com/problems/count-the-number-of-consistent-strings/description/


package Array;

public class CountNumberConsistentStrings2 {
	public int countConsistentStrings(String allowed, String[] words) {
		int output = 0;
		for(int i = 0 ; i < words.length ; i++) {
			int count = 0;
			for(int j = 0; j<words[i].length(); j++) {
				for(int k = 0 ; k < allowed.length() ; k++) {
					if(words[i].charAt(j) == allowed.charAt(k)) {
						count++;
						break;
					}
				}
				if(count == words[i].length()) {
					output ++;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumberConsistentStrings2 obj = new CountNumberConsistentStrings2();
		String allowed = "abc";
		String[] words = {"a","b","c","ab","ac","bc","abc"};
		System.out.println(obj.countConsistentStrings(allowed, words));
	}

}
