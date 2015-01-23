package playground;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HappySequence {
	public static int getLongestHappy(String filePath) throws IOException{

		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

		int longestSequence = 0;
		int sequenceCount = 0;
		String currentLine;


		ArrayList<String> lines = new ArrayList<String>();
		HashMap<String,Integer> animalMap = new HashMap<String,Integer>();

		//Read file into array
		while ( (currentLine = bufferedReader.readLine()) != null){
			lines.add(currentLine);
		}

		for (int i=0;i<lines.size();i++){
			String[] tempArray = lines.get(i).split(":");
			String currentKey = tempArray[0];
			int currentValue = Integer.parseInt(tempArray[1].replaceAll("\\s+",""));	
			
			if (animalMap.containsKey(currentKey)){
				if (animalMap.get(currentKey) + currentValue > 0)
				{
					animalMap.put(currentKey,animalMap.get(currentKey) + currentValue);
					sequenceCount++;
				}
			}
			else{
				animalMap.put(currentKey,currentValue);
			}
		}



		bufferedReader.close();
		return longestSequence;
	}

	public static void main(String[] argv) throws IOException{
		int longestSequence = getLongestHappy(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" 
				+ File.separator + "java" + File.separator + "playground" + File.separator +  "HappySequence.txt");
		System.out.println(longestSequence);
	}
}
