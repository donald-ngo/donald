package com.donald.demo.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.donald.demo.objects.Dog;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String,Dog> testDogs = Dog.createDogs();
		Map<Dog,Integer> map = new HashMap<Dog, Integer>();
		map.put(testDogs.get("white"), 1);
		map.put(testDogs.get("black"), 2);
		map.put(testDogs.get("yellow"), 3);
		map.put(testDogs.get("orange"), 4);

		//print size
		System.out.println("Hash map size: " + map.size());

		//loop HashMap
		for (Entry<Dog, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
	}
}
