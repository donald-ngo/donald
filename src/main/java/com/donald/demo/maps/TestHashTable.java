package com.donald.demo.maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

import com.donald.demo.objects.Dog;

public class TestHashTable {
	public static void main(String[] args) {
		Map<Dog,Integer> hashTable = new Hashtable<Dog, Integer>();
		Dog d1 = new Dog("red", 0);
		Dog d2 = new Dog("black", 0);
		Dog d3 = new Dog("white", 0);
		Dog d4 = new Dog("white", 0);

		hashTable.put(d1, 1);
		hashTable.put(d2, 2);
		hashTable.put(d3, 3);
		hashTable.put(d4, 4);

		//print size
		System.out.println("Hash map size: " + hashTable.size());

		//loop HashMap
		for (Entry<Dog, Integer> entry : hashTable.entrySet()){
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
	}
}
