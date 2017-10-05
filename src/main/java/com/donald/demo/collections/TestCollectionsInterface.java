package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TestCollectionsInterface {
	public static void main(String[] args){
	    String[] two = { "1", "2"};
	    String[] three = { "1", "2","3"};
	    
	    //Lists
		List<String> namesList = new ArrayList<String>(Arrays.asList(two));
		System.out.println("Length: " + namesList);	
		
		namesList = new LinkedList<String>(Arrays.asList(three)) ;
		System.out.println("Length: " + namesList);	
		
		//Sets
		Set<String> nameSet = new HashSet<String>(Arrays.asList(two));
		System.out.println("Length: " + nameSet);	
		
		nameSet = new LinkedHashSet<String>(Arrays.asList(three));
		System.out.println("Length: " + nameSet);	
		
		//Maps
		//Anonymous inner class with static initializer.
		@SuppressWarnings("serial")
		Map<Integer,String> mapList = new HashMap<Integer,String>(){ //Anonymous inner class
			{ //Static initializer
			put(3,"3");
			put(1,"1");
			put(2,"2");			
			}};
		System.out.println("Length: " + mapList);	
			
		Map<Integer,String> mapList2 = new TreeMap<Integer, String>();		
		mapList2.putAll(mapList);
		System.out.println("Length: " + mapList2);				
	
		
		
	}

}
