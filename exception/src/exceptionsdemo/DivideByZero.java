package exceptionsdemo;

public class DivideByZero {
	
	public static void main(String[] args) {
		int a, b, c, d;
		System.out.println("Enter two integers:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = a / b;
		d = a % b;
		System.out.println(a + " / " + b +"="+ c + , "Remainder = " +d);
		System.out.println("Other programming languages continue below..");
		
	}

}
