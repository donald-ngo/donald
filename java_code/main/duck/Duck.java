package main.duck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
	}
	
	public abstract void display();

	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	


}
