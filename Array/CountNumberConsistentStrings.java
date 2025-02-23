package Array;

public class CountNumberConsistentStrings {
public int countConsistentStrings(String allowed, String[] words) {
	
	int count = 0;
	
	for(int i = 0; i< words.length ; i++) {
		
		if(words[i].length()==allowed.length()) {
			if(words[i].equals(allowed)) {
				count++;
			}
		}
		
		else if(words[i].length()>allowed.length()) {
			for(int j = 0; j< words[i].length()-1; j++) {
				String empt = "";
				int p = j;
				for(int k = 0 ; k< allowed.length(); k++) {
					empt += words[i].charAt(p);
					p++;
				}
				
				if(empt.equals(allowed)) {
					count++;
				}
			}
		}
		
	}
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumberConsistentStrings obj = new CountNumberConsistentStrings();
		String allowed = "abc";
		String[] words = {"ad","bd","aaab","baa","badab"};
		System.out.println(obj.countConsistentStrings(allowed, words));
	}

}
