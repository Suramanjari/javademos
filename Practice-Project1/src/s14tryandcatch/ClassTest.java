package s14tryandcatch;

public class ClassTest {
	
	public static void main(String args[]) 
    {
        int[] array = new int[5];
        try 
        {
            array[7] = 2;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds."); 
        }
        finally 
        {
            System.out.println("The array size is " + array.length);
        }
    }
}
