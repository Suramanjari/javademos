package s15exception;

public class Finally {
	
	public static void main(String[] args)
    {
        int a=69,b=3,xy=0;
        try
        {
            xy = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\nThe result is : " + xy);
        }
    }
}