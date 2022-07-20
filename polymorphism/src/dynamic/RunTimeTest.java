package dynamic;

public class RunTimeTest {
	
	public static void main(String[] args) {
		// MacBook mac1 = new MacBookPro();
		// mac1.start();
		// mac1.shutdown();
		
		MacBookPro pro = new MacBookPro();
		operatemac(pro);
		
		MacBookAir air = new MacBookAir();
		operatemac(air);
		
		
	}
	
	static void operateMac(MacBook Mac) {
		mac.start();
		mac.shutdown();
		
	}

}
