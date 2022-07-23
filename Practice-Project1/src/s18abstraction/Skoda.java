package s18abstraction;

public class Skoda implements Car {
	
	final int numWheels = 4;

	public void go() {
		System.out.println("Inside Skoda Go");
	}

	public void stop() {
		System.out.println("Inside Skoda Stop");
	}
	
	public void modifyCar() {
	}
}