package com.donald.demo.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {
	static final int NO_OF_CHARS = 256;
	
	static int lengthOfLongestSubstring(String str) {
		int n = str.length();
		
		Set<Character> set = new HashSet<Character>();
		
		int ans = 0, i = 0, j = 0;
		
		
		
		
		
		
		return ans;
		
		
	}
	
	/* Driver program to test above function */
	public static void main(String[] args) {
        String str = "ABDEFGABEF";
        System.out.println("The input string is: "+ str);
		int len = lengthOfLongestSubstring(str);
		System.out.println("The length of the longest non repeating charact is " + len );
	}

}
