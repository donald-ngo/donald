package playground;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HappySequence {
	public static int getLongestHappy(String filePath) throws IOException{
		int longestSequence = 0;
		int currentSum = 0;

		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		String currentLine;

		while ( (currentLine = bufferedReader.readLine()) != null){
			String[] tempArray = currentLine.split(":");
			String currentKey = tempArray[0];
			int currentValue = Integer.parseInt(tempArray[1]);
		
			System.out.println("I just read <token> = " + currentKey);
			System.out.println("I just read <value> = " + currentValue);
			
			currentSum += currentValue;
			
			if (currentSum > 0 ){
				longestSequence++;
				System.out.print("Current longestSequence is: " + longestSequence);
			}
			else{
				longestSequence = 0;
			}
		}
		
		bufferedReader.close();
		return longestSequence;
	}
	
	public static void main(String[] argv) throws IOException{
		int longestSequence = getLongestHappy("./HappySequence.txt");
		System.out.println(longestSequence);
	}
}
