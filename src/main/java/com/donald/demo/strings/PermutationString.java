package com.donald.demo.strings;

public class PermutationString{
	public static String sort(String str){
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return String.valueOf(content);
	}
	
	public static boolean isPermutation(String s1, String s2){		
		if (s1.length() != s2.length()) return false;
				
		if ( sort(s1).equals(sort(s2)) ) return true;
		
		return false;
	}
	
	
	public static void main(String args[]){
		String s1 = "     1";
		String s2 = "1     ";
		
		//System.out.println("s1 = " + s1);
		//System.out.println("s2 = " + s2);
		System.out.println("Is s1 a permutation of s2? -> " +  isPermutation(s1, s2));
		
		
	}
}