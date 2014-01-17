package main.playground;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Duplicates {
	public static void main(String args[]){
		int numbers[] = {-9, 1, 2, 55, 6, 10, 4, 5, 6, -9, 1, 2, 1, 1, -9};

		HashSet<Integer> numbersSet = new HashSet<Integer>();
		HashMap<Integer,Integer> duplicateNumbers = new HashMap<Integer,Integer>();
		
		//Loop through the numbers array
		for (int i = 0; i <numbers.length; i++){
			if ( !numbersSet.contains(numbers[i]) ){
				numbersSet.add(numbers[i]);
			}
			else{ //The number is a duplicate
				if (!duplicateNumbers.containsKey(numbers[i])){//First duplicate, initialize to be 2 occurrences
					duplicateNumbers.put(numbers[i],2); 
				}
				else{
					duplicateNumbers.put(numbers[i],duplicateNumbers.get(numbers[i])+1); //We see the number duplicated again
				}
			}		
		}
		System.out.println("Original numbers: " + Arrays.toString(numbers));
		System.out.println("Set of unique numbers: " + numbersSet);
		System.out.println("Duplicate numbers: " + duplicateNumbers);
	}

}
