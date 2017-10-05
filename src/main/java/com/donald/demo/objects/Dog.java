package objects;

import java.util.HashMap;
import java.util.Map;

public class Dog implements Comparable<Dog> {
	String color;
	int size;

	public Dog(String c, int s) {
		color = c;
		size = s;
	}

	public String getColor() {
		return this.color;
	}

	public int getSize() {
		return this.size;
	}

	public boolean equals(Object o) {
		return ((Dog) o).color == this.color;
	}

	//Needed by HashMap
	public int hashCode() {
		return color.length();
	}

	//Needed by HashMap
	public String toString(){	
		return color + " dog";
	}

	//Needed by TreeMap
	@Override
	public int compareTo(Dog o) {
		return  o.size - this.size;
	}
	
	public static Map<String,Dog> createDogs(){
		Map<String,Dog> dogHashMap = new HashMap<String,Dog>();
		dogHashMap.put("white", new Dog("white",1));
		dogHashMap.put("black", new Dog("black",100));
		dogHashMap.put("yellow", new Dog("yellow",10));
		dogHashMap.put("orange", new Dog("orange",1000));
		return dogHashMap;
		}
}


