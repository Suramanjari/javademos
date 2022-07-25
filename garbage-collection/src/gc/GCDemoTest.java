package gc;

public class GCDemoTest {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5000000; i++)
			new Employee(i);
	}

}
