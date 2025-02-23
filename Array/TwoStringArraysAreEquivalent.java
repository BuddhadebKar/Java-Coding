package Array;

public class TwoStringArraysAreEquivalent {
	
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		
		String newWord1 = word1[0] ;
		String newWord2 = word2[0] ;
		for(int i = 1; i< word1.length; i++) {
			newWord1 = newWord1+word1[i];
		}
		for(int i = 1; i< word2.length; i++) {
			newWord2 = newWord2+word2[i];
		}
		
		return newWord1.equals(newWord2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStringArraysAreEquivalent obj = new TwoStringArraysAreEquivalent();
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		System.out.println(obj.arrayStringsAreEqual(word1, word2));
	}

}
