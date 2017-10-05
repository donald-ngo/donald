package com.donald.demo.playground;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Duplicates {
	public static void main(String args[]){
		int numbers[] = {-9, 1, 2, 55, 6, 10, 4, 5, 6, -9, 1, 2, 1, 1, -9};

		HashSet<Integer> numbersSet = new HashSet<Integer>();
		HashMap<Integer,Integer> duplicateNumbersMap = new HashMap<Integer,Integer>();
		
		String uniqueNumbers = "";
		
		//Loop through the numbers array
		for (int i = 0; i <numbers.length; i++){
			if ( !numbersSet.contains(numbers[i]) ){
				numbersSet.add(numbers[i]);
				uniqueNumbers += " " + numbers[i] + ",";
			}
			else{ //The number is a duplicate
				if (!duplicateNumbersMap.containsKey(numbers[i])){//First duplicate, initialize to be 2 occurrences
					duplicateNumbersMap.put(numbers[i],2); 
				}
				else{
					duplicateNumbersMap.put(numbers[i],duplicateNumbersMap.get(numbers[i])+1); //We see the number duplicated again
				}
			}		
		}
			
		String duplicateNumbers = "";
		for (int numberKey : duplicateNumbersMap.keySet() ){
			duplicateNumbers += " " + numberKey +  " appears " +   duplicateNumbersMap.get(numberKey) + " times,";
		}
		
		uniqueNumbers = uniqueNumbers.substring(0, uniqueNumbers.length()-1);
		duplicateNumbers = duplicateNumbers.substring(0, duplicateNumbers.length()-1);
		
		
		System.out.println("Original numbers: " + Arrays.toString(numbers));
		System.out.println("Unique numbers: " + uniqueNumbers);
		System.out.println("Duplicate numbers: " + duplicateNumbers);
	}

}
