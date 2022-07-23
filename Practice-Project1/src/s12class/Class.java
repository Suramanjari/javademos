package s12class;

public class Class {
	
	private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(3000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 3 second");
        synchronized (LOCK) 
        {
            LOCK.wait(5000);
            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 5 second");
        }
    }
}
