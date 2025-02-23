package Array;

public class MaximumNumberOfWords {
	
	public int mostWordsFound(String[] sentences) {
		int max = 0;
		for(int i = 0 ; i < sentences.length ;  i++) {
			for(int j = 0; j<sentences[i].length(); j++) {
				System.out.println(sentences[0].charAt(j));
				//System.out.println(sentences[i].charAt(j));
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumNumberOfWords obj = new MaximumNumberOfWords();
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println(obj.mostWordsFound(sentences));	
	}

}
