package anagrams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Anagram {
	
	public static void printAnagrams(String filename) throws IOException{
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
			
			HashMap<String, Set<String>> wordsHash = new HashMap<String, Set<String>>();	
			
			String currentLine;
			
			while ( (currentLine = bufferedReader.readLine()) != null){
					
					char[] originalChars = currentLine.toCharArray();
					Arrays.sort(originalChars);
					String sortedWord = new String(originalChars);
					
					if (wordsHash.containsKey(sortedWord)){
					 wordsHash.get(sortedWord).add(currentLine);	
					}
					else{
						Set<String> wordsList = new LinkedHashSet<String>();
						wordsList.add(currentLine);
						wordsHash.put(sortedWord, wordsList);
					}
			}
			
			bufferedReader.close();
			
			System.out.print("Anagrams from the file: ");
			
			for (String key : wordsHash.keySet()){
				if (wordsHash.get(key).size() > 1 ){
					for (String word : wordsHash.get(key)){
						System.out.print(word + " ");						
					}
				}
			}
	}
	
	public static void main(String[] args) throws IOException{
		String filename = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" 
				+ File.separator + "java" + File.separator + "anagrams" + File.separator + "words.txt";		
		printAnagrams(filename);
	}

}
