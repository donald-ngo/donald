package com.donald.demo.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import com.donald.demo.objects.Dog;

public class TestLists {
	public static void main(String[] args) {
		Map<String, Dog> testDogs = Dog.createDogs();
		/******************************************
		 *   			Arrays
		 ****************************************/
		//Arrays have fixed size can contain primitives and objects
		Dog[] dogArray = {testDogs.get("white"),testDogs.get("black"),testDogs.get("yellow")};
		
		//Sort our dogArrayList
		Arrays.sort(dogArray);
		
		System.out.println("Printing dogArray: ");
		for (Dog currentDog: dogArray){
			System.out.printf("%s dog size %d\n",currentDog.getColor(),currentDog.getSize());
		}
		
		/******************************************
		 *   			ArrayList
		 ****************************************/
		//ArrayList do not have that limitation of fixed size, can only hold objects
		ArrayList<Dog> dogArrayList = new ArrayList<Dog>();
		dogArrayList.add(testDogs.get("white"));
		dogArrayList.add(testDogs.get("black"));
		dogArrayList.add(testDogs.get("yellow"));
		
		//Sort our dogArrayList
		Collections.sort(dogArrayList);
		
		System.out.println("\nPrinting dogArrayList: ");
		for (Dog currentDog: dogArrayList){
			System.out.printf("%s dog size %d\n",currentDog.getColor(),currentDog.getSize());
		}
	}

}
