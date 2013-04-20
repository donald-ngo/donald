package main.codeeval.easy.panagram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main (String[] args) throws IOException {
		File file = new File("/home/donald/source/donald/java_code/main/codeeval/panagram/panagram.txt");
		//File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		TreeMap<String, String> alphabet= new TreeMap();
		for (int i=(int)'a';i<=(int)'z';i++){
			alphabet.put(String.valueOf((char)i),"exists");
		}
		System.out.println("alphabet:" + alphabet.toString());
		while ((line = in.readLine()) != null) {
			Map<String, String> copyOfAlphabet = new TreeMap<String,String>(alphabet);
			line = line.replaceAll("[^\\x00-\\x7F]", "");
			String[] lineArray = line.split("");
			//Lookup the character in the dictionary, if found delete in the dictionary
			//If the dictionary is empty break
			if (lineArray.length > 0) {
				for (int i=1;i<lineArray.length;i++){
					if (copyOfAlphabet.containsKey(lineArray[i].toLowerCase())) {	
						copyOfAlphabet.remove(lineArray[i]);
					}
					if (copyOfAlphabet.isEmpty()){
						break;
					}
				}
				Iterator iterator = copyOfAlphabet.keySet().iterator();	

				String missingLetters = "";
				while (iterator.hasNext()){
					missingLetters += iterator.next();
				}
				if (missingLetters == ""){
					System.out.println("NULL");
				}
				else{
					System.out.println(missingLetters);
				}
			}
		}
	}
}