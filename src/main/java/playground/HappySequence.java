package playground;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HappySequence {
	public static int getLongestHappy(String filePath) throws IOException{

		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

		int longestSequence = 0;
		int currentSequence = 0;
		String currentLine;


		ArrayList<String> lines = new ArrayList<String>();
		HashMap<String,HashMap<String,Integer>> animalMap = new HashMap<String,HashMap<String,Integer>>();

		//Read file into array
		while ( (currentLine = bufferedReader.readLine()) != null){
			lines.add(currentLine);
		}

		for (int i=0;i<lines.size();i++){
			String[] tempArray = lines.get(i).split(":");
			String currentAnimal = tempArray[0];
			int currentValue = Integer.parseInt(tempArray[1].replaceAll("\\s+",""));	

			System.out.println("....................Current line[+" + i + "]=" + lines.get(i));

			HashMap<String,Integer> innerMap = new HashMap<String,Integer>();
			if (!animalMap.containsKey(currentAnimal)){
				innerMap.put("sum", currentValue);
				innerMap.put("nextUnhappy",999);
				animalMap.put(currentAnimal,innerMap);
			}

			//Find the next sequence
			for (int j=i+1;j<lines.size();j++){
				//System.out.println("look ahead line=" + lines.get(j));
				String[] tempArray2 = lines.get(j).split(":");
				String nextAnimal = tempArray2[0];
				int nextCurrentValue = Integer.parseInt(tempArray2[1].replaceAll("\\s+",""));

				if (nextAnimal.equals(currentAnimal)){
					int  intCurrentSum =  animalMap.get(currentAnimal).get("sum") + nextCurrentValue;		
					if ( intCurrentSum > 0){
						innerMap.put("sum", intCurrentSum);
						innerMap.put("nextUnhappy",999);
					}
					else{
						innerMap.put("sum", intCurrentSum);
						innerMap.put("currentValue", currentValue);
						innerMap.put("nextUnhappyValue", nextCurrentValue);

						if (animalMap.get(currentAnimal).get("sum") < 0){
							innerMap.put("nextUnhappy",i);
						}
						else{
							innerMap.put("nextUnhappy",j);
						}
					}

					animalMap.put(currentAnimal,innerMap);
					break;
				}

			}

			System.out.println(animalMap);
			if ( animalMap.get(currentAnimal).get("sum") < 0 ){
				if (animalMap.get(currentAnimal).get("nextUnhappy") > i  ){
					currentSequence++;
				}
				else{
					System.out.println("Resetting on: " + currentAnimal + "="  + animalMap.get(currentAnimal) );
					animalMap.keySet().removeAll(animalMap.keySet());
					currentSequence = 0;
				}
			}
			else{
				currentSequence++;
			}


			if (longestSequence < currentSequence){
				longestSequence = currentSequence;	
			}
			System.out.println("currentSequence=" + currentSequence);	
			System.out.println("longestSequence=" + longestSequence);	

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
