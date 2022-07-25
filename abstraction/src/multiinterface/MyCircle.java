package multiinterface;

public class MyCircle implements Circle, CircleTwo {
	
	
	public void calculateArea() {
		System.out.println(CircleTwo.pi);
		
	}

}
