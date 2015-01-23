package progzoo;

public class NestedForLoops {
	public static void main(String args[]){
		for (int row = 0; row < 10 ; row++){
			for (int column = 0; column < 10; column++){
				System.out.print("r_" + row + "c_" + column + " ");
			}
			System.out.println("");
		}
	}
}
