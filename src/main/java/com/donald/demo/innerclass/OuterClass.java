package innerclass;
/*
 * Inner Class.
 * 
 * 
 * 
 */
public class OuterClass {
	private int x = 200;
	
	class InnerClass{
		private int ans;
		
		public void getValue(){
			display();
			System.out.println("Outer Class Value : " + x);
		}
		
		public void display(){
			System.out.println("Inner Class Display");
		}
	}
	
	public void display(){
		System.out.println("Outer Class Display");
	}
	
	public void accessInner(){
		InnerClass obj = new InnerClass();
		obj.ans = 500;
		
		System.out.println("Inner Class Value : " + obj.ans);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] argvs){
		OuterClass outobj = new OuterClass();
		InnerClass inobj = outobj.new InnerClass();
		
		//One line inner class declaration.
		InnerClass inobj1 = new OuterClass().new InnerClass();
		
		inobj.getValue();
	}
}


