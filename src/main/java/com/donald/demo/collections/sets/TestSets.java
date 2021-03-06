package com.donald.demo.collections.sets;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.donald.demo.objects.Dog;

public class TestSets {
	public static void main(String[] args) {
		//HashSet insures that unique elements are in the set
		/******************************************
		 *   			HashSet
		 ****************************************/
		//It makes no guarantees as to the iteration order of the set; in particular, 
		//it does not guarantee that the order will remain constant over time.
		Map<String,Dog> dogTestHashMap = Dog.createDogs();
		Set<Dog> dogHashSet = new HashSet<Dog>();
		dogHashSet.add(dogTestHashMap.get("white"));
		dogHashSet.add(dogTestHashMap.get("black"));
		dogHashSet.add(dogTestHashMap.get("yellow"));
		dogHashSet.add(dogTestHashMap.get("orange"));
		
		System.out.println("\nPrinting dogHashSet: ");
		for (Dog currentDog: dogHashSet){
			System.out.printf("%s dog size %d\n",currentDog.getColor(),currentDog.getSize());
		}
		
		/******************************************
		 *   			TreeSet
		 ****************************************/
		Set<Dog> dogTreeSet = new TreeSet<Dog>();
		dogTreeSet.add(dogTestHashMap.get("white"));
		dogTreeSet.add(dogTestHashMap.get("black"));
		dogTreeSet.add(dogTestHashMap.get("yellow"));
		dogTreeSet.add(dogTestHashMap.get("orange"));
		
		System.out.println("\nPrinting dogTreeSet: ");
		for (Dog currentDog: dogTreeSet){
			System.out.printf("%s dog size %d\n",currentDog.getColor(),currentDog.getSize());
		}
	}

}
