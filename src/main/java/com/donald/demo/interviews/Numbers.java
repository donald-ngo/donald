package com.donald.demo.interviews;

public class Numbers {

	public static void main(String[] args) {
		Integer[] numbers = { 4, 1, 1, 1, 1, 4, 7, 8, 4 };

		printMostFrequent(numbers);

	}

	public static void printMostFrequent(Integer[] numbers) {

		int element = 0, prevcount = 0, count = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
				}
				if (count > prevcount) {
					element = numbers[i];
					prevcount = count;
				}
			}

			count = 0;

		}
		System.out.println("Most appearing element : " + element);
		System.out.println("The number of occurances : " + prevcount);
	}

}
