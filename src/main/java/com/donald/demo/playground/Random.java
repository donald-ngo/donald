package playground;

public class Random {
	public static void main(String[] args){
	
		for (int i = 0; i < 10 ; i++){
			double drandom = Math.random();
			int random = (int) (drandom * 10);		
			System.out.println("Random number double is: " + drandom + 
					  " Random number int is:" + random );
		}
		
	}

}
