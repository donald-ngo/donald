package com.donald.demo.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstProgram {

	public static void main (String[] arguments){
		List<String> stooges = new ArrayList<String>(Arrays.asList("Larry", "Moe", "Curly"));
		System.out.println(stooges);
		stooges.add(1,"Donald");
		System.out.println(stooges);
		System.out.println(stooges.getClass());
	}

}
