package s16exceptionhandling;

public class Example {
	
	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			throw new MyException("Error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }

}
