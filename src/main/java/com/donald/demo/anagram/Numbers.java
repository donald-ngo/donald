package com.donald.demo.anagram;

import java.util.HashMap;
import java.util.Map;

public class Numbers {
	public static void printMostFrequent(Integer[] numbers){
		Map<Integer,Integer> numbersMap = new HashMap<Integer,Integer>();
		
		for (int number : numbers){
			if (numbersMap.containsKey(number)){
				numbersMap.put(number, numbersMap.get(number)+1);
			}
			else{
				numbersMap.put(number, 1);
			}
		}
		
		Integer mostFrequentNumber = null;
		Integer mostFrequentNumberCount = null;
		
		for (int number : numbersMap.keySet()){	
			if (mostFrequentNumber == null){
				mostFrequentNumber = number;
				mostFrequentNumberCount = numbersMap.get(number);
			}
			else if (numbersMap.get(number) > mostFrequentNumberCount){
				mostFrequentNumber = number;
			}
		}
		
		System.out.println("Most frequent number is : " + mostFrequentNumber );
		
	}
	
	public static void main(String[] argv){
		Integer [] numbers = {1, 1, 1, 4, 7, 8, 4};
		printMostFrequent(numbers);
	}
	
}
