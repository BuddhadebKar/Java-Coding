package com.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        
        Set<Character> charSet = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
        	
            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - count + 1);
            } 
            else {
                while (charSet.contains(s.charAt(i))) {
                    charSet.remove(s.charAt(count));
                    count++;
                }
                charSet.add(s.charAt(i));
            }
        }
        
        return maxLength;
    }
}