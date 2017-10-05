package com.donald.demo.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubbleSort(int[] numbers){
		boolean continueFlag = true; //Set flag to true to begin first pass
		int loopCount = 1;
	
		while(continueFlag){
			continueFlag = false; //Set flag to false awaiting possible swap
			for (int i = 0; i < numbers.length - 1; i++){
				if (numbers[i] < numbers[i+1]){ //Ascending sort
					int temp = numbers[i]; //Swap elements
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					continueFlag = true;
				}
				
			}
			System.out.println("After Pass # " + loopCount + "=>" + Arrays.toString(numbers));
			loopCount++;
		}
		
		return numbers;
	}
	
	
	public static void main(String[] args){
		//int[] numbers = {6,7,-1,1,4,3,5,6};
		int[] numbers = {84,69,76,86,94,91};
		int [] numbers2 = {84};
		bubbleSort(numbers);
		bubbleSort(numbers2);	
	}
	

}
