package innerclass;

/*
 * Anonymous Inner classes. 
 * 
 * Anonymous classes enable you to make your code more concise. 
 * They enable you to declare and instantiate a class at the same time. 
 * They are like local classes except that they do not have a name. 
 * Use them if you need to use a local class only once.
 * 
 */
public class OuterClass3 {
	public void display(){
		System.out.println("Outer Class");
	}
	
	public static void main(String args[]){
		InnerClass inobj = new InnerClass();
		inobj.outobj.display();
	}
	
}

class InnerClass{
	
	//
	OuterClass3 outobj = new OuterClass3(){
		public void display(){
			System.out.println("Anonymous Class");
			display1();
		}
		
		public void display1(){
			System.out.println("Extra method");
		}
	};
	
}
