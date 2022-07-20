package nonstaticcontext;

public class NonStaticVariableDemo {
	
	int num;
	{
		System.out.println("Inside non static block");
		
	}
	
	void NonStaticVariableDemo() {
		System.out.println("Inside the constructor");
		
	}
	public static void main(String[] args) {
		System.out.println("Inside main method");
		NonStaticVariableDemo nsvd = new NonStaticVariableDemo();
		System.out.println(nsvd.num);
	}

}
