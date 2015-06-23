package strings;


/**
 * Implement an algorithm to determine if a String has unique characters. 
 * 
 * What if you could not use data structures.
 * 
 * Assumptions: String contains only ASCII characters means only 128 characters needed encode by 7-bits.
 * Unicode contains a lot more.  
 * 
 * Time complexity O(n) and space complexity is O(1).
 */
public class UniqueString {
	
	public static boolean hasUnique(String string){
		if (string.length() > 128) return false;
		
		boolean[] char_set = new boolean[128];
		
		for (int i = 0; i < string.length(); i++){
			int char_value = string.charAt(i);
			//System.out.println("Char is: " + string.charAt(i) + " Char value is: " + char_value);
			if ( char_set[char_value] ){
				return false;
			}
			char_set[char_value] = true;
		}
		return true;
		
	}

	public static void main(String args[]){
		String string = "AaBbcC!";
		
		System.out.println("Does string: \"" + string + "\" contain unique? -> " + hasUnique(string));
	}
	

}
