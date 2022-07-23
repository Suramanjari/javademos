package s15exception;

public class ExceptionTest extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ExceptionTest(String s) 
    { 
        super(s); 
    }  
    public static void main(String args[]) 
    { 
        try
        { 
            throw new ExceptionTest("temp"); 
        } 
        catch (ExceptionTest ex) 
        { 
            System.out.println("Custom"); 
            System.out.println(ex.getMessage()); 
        } 
    } 


}
