package arithmeticcalculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	
	public static void main(String[] args) {
		
		double a, b, result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first value:");
		a = s.nextDouble();
		System.out.println("Enter the second value");
		b = s.nextDouble();
		
		System.out.println("Enter any operator(+, -, *, /, %):");
		char opt = s.next().charAt(0);
		
		switch(opt)
		{
			case '+':
				result = a+b;
				break;
			case '-':
				result = a-b;
				break;
			case '*':
				result = a*b;
				break;
			case '/':
				result = a/b;
				break;
			case '%':
				result = a%b;
				break;
			
			default:
				System.out.println("False operator or False value");
				return;
				
		}
		
		System.out.println(a+" "+opt+" "+b+": " + result);
		
	}

}