package maps;

import java.util.Map.Entry;
import java.util.TreeMap;

import objects.Dog;

public class TestTreeMap {
	public static void main(String[] args) {
		Dog d1 = new Dog("red", 1);
		Dog d2 = new Dog("black", 2);
		Dog d3 = new Dog("white", 3);
		Dog d4 = new Dog("white", 4);
		
		TreeMap <Dog,Integer> treeMap = new TreeMap<Dog,Integer>();
		treeMap.put(d1, 1);
		treeMap.put(d2, 2);
		treeMap.put(d3, 3);
		treeMap.put(d4, 4);
		
		for (Entry<Dog, Integer> entry : treeMap.entrySet()){
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
