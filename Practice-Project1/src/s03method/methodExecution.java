package s03method;

public class methodExecution {
	
	public int multipy(int a,int b) {
		int x=a*b;
		return x;
	}

	public static void main(String[] args) {

		methodExecution b=new methodExecution();
		int ans= b.multipy(7,8);
		System.out.println("Multipilcation is :"+ans);
		}

}
