package com.donald.demo.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapList {
	protected List<Integer> list = new ArrayList<Integer>();
	protected Map<Integer,ArrayList<Integer>> indexMap = new HashMap<Integer,ArrayList<Integer>>();

	public void add(Integer number){
		System.out.println("Adding: " + number);
		System.out.println("List Before: " + list + "Map: " + indexMap);
		list.add(number);
		if (indexMap.containsKey(number)){
			indexMap.get(number).add(list.size()-1);
		}
		else{
			ArrayList<Integer> firstList = new ArrayList<Integer>();
			firstList.add(list.size()-1);
			indexMap.put(number, firstList);
		}

		System.out.println("List After: " + list + "Map: " + indexMap);
	}

	public void remove(Integer number){
		System.out.println("Removing: " + number);
		System.out.println("List Before: " + list + " Map: " + indexMap);

		if (indexMap.containsKey(number)){		
			int lastElementIndex = list.size()-1;
			
			//Swap the last element with the element we are going to delete			
			Integer lastElementValue = list.get(lastElementIndex);
			list.remove(lastElementIndex);
			
			//Get index of the element we are going to remove
			int removeElementIndex = indexMap.get(number).get(0);
			indexMap.get(number).remove(0);
			
			//Swap the removed index with the last value and delete the previous location
			indexMap.get(lastElementValue).remove(0);	
			indexMap.get(lastElementValue).add(0,removeElementIndex);

			list.set(removeElementIndex, lastElementValue);
	
			//Remove number from the map if its no longer in our list.
			if(indexMap.get(number).size() == 0){
				indexMap.remove(number);
			}	
		}
		else{
			System.out.println("The number does not exist: " + number);
		}
		System.out.println("List After: " + list + "Map: " + indexMap);
	}

	public static void main(String[] arguments){
		MapList ml = new MapList();
		ml.add(1);
		ml.add(2);
		ml.add(3);
		ml.add(3);
		ml.add(4);
		ml.add(5);
		ml.add(6);
		ml.remove(1);
		ml.remove(2);
		ml.getRandom();
		
		ml.testStrings("Donald","Ngo","Was Here");
	}
	
	public void testStrings(String...strings ){
		System.out.println("Strings are: " + Arrays.toString(strings));
		
	}
	public Integer getRandom(){
		Random rand = new Random();
		Integer randomIndex = rand.nextInt(list.size()-1) + 0;
		Integer randomValue = list.get(randomIndex);
		
		System.out.println("Random index was: " + randomIndex + " value was: " + randomValue);
		
		return randomValue;
	}


}
