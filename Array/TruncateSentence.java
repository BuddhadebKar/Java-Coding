package Array;

import java.util.ArrayList;
import java.util.List;

public class TruncateSentence {
	public String truncateSentence(String s, int k) {
		
		String[] word = s.split(" ");
		StringBuilder truncated = new StringBuilder();
		for(int i = 0; i< k; i++) {
			if(i>0) {
				truncated.append(" ");
			}
			truncated.append(word[i]);
		}
		return truncated.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TruncateSentence obj = new TruncateSentence();
		String s = "Hello how are you Contestant";
		int k = 4;
		System.out.println(obj.truncateSentence(s, k));
	}

}
