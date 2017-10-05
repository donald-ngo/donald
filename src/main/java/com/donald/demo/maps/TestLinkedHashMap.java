package maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import objects.Dog;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Dog,Integer> linkedHashMap = new LinkedHashMap<Dog, Integer>();
		Dog d1 = new Dog("red", 0);
		Dog d2 = new Dog("black", 0);
		Dog d3 = new Dog("white", 0);
		Dog d4 = new Dog("white", 0);

		linkedHashMap.put(d1, 1);
		linkedHashMap.put(d2, 2);
		linkedHashMap.put(d3, 3);
		linkedHashMap.put(d4, 4);

		//print size
		System.out.println("Hash map size: " + linkedHashMap.size());

		//loop HashMap
		for (Entry<Dog, Integer> entry : linkedHashMap.entrySet()){
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
	}

}
