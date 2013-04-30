package main.progzoo.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SortStudents {

	public static void main(String[] args) throws Exception {
		ArrayList<String> present = new ArrayList<String>();
		String line;	
		BufferedReader fh = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/java_code/main/progzoo/ArrayList/present.txt"));
		while (null !=(line=fh.readLine())){
			present.add(line);
		}
		fh.close();
		fh = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/java_code/main/progzoo/ArrayList/students.txt"));
		while (null !=(line=fh.readLine())){
			if ( !present.contains(line)){
				System.out.println(line);
			}
		}
		
		
	}

}
