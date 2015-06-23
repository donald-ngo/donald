package innerclass;

/*
 * Local Inner Class, inside a method.
 * Local to that particular method only.
 * 
 * Local classes are classes that are defined in a block, which is a group of zero or more statements between balanced braces. 
 * You typically find local classes defined in the body of a method.
 * 
 * Use it if you need to create more than one instance of a class, access its constructor,
 * or introduce a new, named type (because, for example, you need to invoke additional methods later).
 * 
 */
public class OuterClass2 {
	private int x = 200;
	
	@SuppressWarnings("unused")
	public void innerClassMethod(){
		int rel = 500;
		
		//Only final and abstract modifiers.
		class InnerClass{
			private int ans;
			final int final_ans = 1;
			
			public void getValue(){
				System.out.println("Outer Class Value :" + x);
				
				/*Cannot access the local variables for the method, unless
				 * its been declared as final. 
				*/
				System.out.println("Outer Class Value :" + final_ans);
			}
		}	
		new InnerClass().getValue();
	}
	
	public void display(){
		
	}	

	public static void main(String args[]){
		OuterClass2 outobj = new OuterClass2();
		outobj.innerClassMethod();
	}

}


