package s18interfacepolymorphism;

public class TestCase {
	
public static void main(String[] args) {
		
		
		MacBookAir al = new MacBookAir();
		al.start();
		al.shutdown();
		
		MacBook macb = new MacBookAir();
		
		MacBookAir obj = (MacBookAir) macb;
		
		MacBook pro = new MacBookPro();
		MacBookPro obj2 = (MacBookPro) pro;
		obj2.prosmethod();
		
	}
	

}
