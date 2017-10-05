package duck;
//Flying behavior implementation for ducks that DO NOT fly
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
