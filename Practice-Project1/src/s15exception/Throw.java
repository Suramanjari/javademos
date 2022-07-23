package s15exception;

public class Throw {
	
    public static void main(String[] args)
    {

        int a=23,b=7,xy;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                xy = a / b;
                System.out.print("The result is : " + xy);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }

        System.out.print("\nEnd of program.");
    }
}
