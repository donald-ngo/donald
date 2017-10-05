package interviews;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		String fullPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" 
				+ File.separator + "java" + File.separator + "anagrams" + File.separator + "words.txt";	
		printAnagrams(fullPath);

	}
	
	public static void printAnagrams(String filePath){
		List<String> list = new ArrayList<>();
		try{
			FileReader inputFile = new FileReader(filePath);
			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;

			while ((line = bufferReader.readLine()) != null)   {
				list.add(line);
			}
			bufferReader.close();
		}catch(Exception e){
			System.out.println(e);
		}

		int size = list.size();
		System.out.println(list);

		for(int i=0; i< size; i++){
			String current = list.get(i);
			Set<String> anagrams = new LinkedHashSet<String>();

			for (int j = 0; j < size ; j++){
				String next = list.get(j);

				if (!current.equals(next) && current.length() == next.length() && current.length() != 0 && next.length() != 0){
					String sortedCurrent = sortString(current);
					String sortedNext = sortString(next);
					if (sortedCurrent.equalsIgnoreCase(sortedNext)){
						anagrams.add(current);
						anagrams.add(next);
						list.set(j, "");
					}
				}
			}
			if (!anagrams.isEmpty()){
				System.out.println("Anagram: " + anagrams);
			}
		}
	}
	
	private static String sortString(String str){
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

}
