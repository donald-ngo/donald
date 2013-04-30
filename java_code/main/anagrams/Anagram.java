package main.anagrams;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {	
		String findWord = "cat";
		try{
			HashMap<String, List<String>> anagramHashMap = new HashMap<String,List<String>>();
			Scanner s = new Scanner(new File(System.getProperty("user.dir") + "/java_code/main/anagrams/input.txt"));
			while (s.hasNext()){
				String word = s.next().toLowerCase();
				
				//Change the string into char array and sort
				String anagramSortedKey = sorting(word);
				List<String> anagramWordList = anagramHashMap.get(anagramSortedKey);
				
				//{act=[cat, tac, act]}
				//Create the list if words
				//If there is currently no list create one
				if (anagramWordList == null){
					anagramHashMap.put(anagramSortedKey, anagramWordList = new ArrayList<String>());
				}
				
				//Add the word to list
				if (!anagramWordList.contains(word)){
					anagramWordList.add(word);
				}
				
				
			}
			System.out.println("Hash map contains:" + anagramHashMap);
			
			List<String> findList = anagramHashMap.get(sorting(findWord));
			if (findList == null){
				System.out.println("File contains no anagrams for: " + findWord);
			}
			else {
				System.out.println("File contains following anagrams words for: " + findWord);
				for (String mystring : findList){
					System.out.println(mystring);
				}
			}
		}
		catch (Exception e){
			System.out.println(e);
			System.exit(1);
		}
	}
	
	private static String sorting(String s) {
	    char[] a = s.toCharArray();
	    Arrays.sort(a);
	    return new String(a);
	}
}


