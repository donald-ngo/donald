package main.maps;

import java.util.HashMap;
import java.util.Map.Entry;

import main.objects.Dog;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<String,Dog> testDogs = Dog.createDogs();
		HashMap<Dog,Integer> hashMap = new HashMap<Dog, Integer>();
		hashMap.put(testDogs.get("white"), 1);
		hashMap.put(testDogs.get("black"), 2);
		hashMap.put(testDogs.get("yellow"), 3);
		hashMap.put(testDogs.get("orange"), 4);

		//print size
		System.out.println("Hash map size: " + hashMap.size());

		//loop HashMap
		for (Entry<Dog, Integer> entry : hashMap.entrySet()){
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
	}
}
