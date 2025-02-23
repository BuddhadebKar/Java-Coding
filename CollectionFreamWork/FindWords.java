
//https://leetcode.com/problems/find-words-containing-character/description/

package CollectionFreamWork;

import java.util.ArrayList;
import java.util.List;

public class FindWords {
	public List<Integer> findWordsContaining(String[] words, char x){
		
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 0; i< words.length; i++) {
			for(int j = 0; j< words[i].length(); j++) {
				if(x == words[i].charAt(j)) {
					l.add(i);
					break;
				}
			}
		}
		
		return l;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindWords obj = new FindWords();
		String[] words = {"leet","code"};
		char x = 'e';
		System.out.println(obj.findWordsContaining(words, x));
	}

}
