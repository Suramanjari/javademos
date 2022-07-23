package s15exception;

public class Throws {
	
    void Division() throws ArithmeticException
    {
        int a=78,b=1,xy;
        xy = a / b;
        System.out.print("The result is : " + xy);
    }
     public static void main(String[] args)
    {
    	 
    	 Throws T = new Throws();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
    }
}
