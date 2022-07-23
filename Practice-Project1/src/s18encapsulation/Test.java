package s18encapsulation;

public class Test {
	
public static void main(String[] args) {

		Student student = new Student();
		student.id = 781;
		student.name = "Saraah";
		student.courseName = "JAVA";
		student.printDetails();

		BankAccount acc = new BankAccount(10000);
		acc.setAccountName("ABC");
		acc.setAccountNumber(-2);
		acc.depositMoney(6700);
		acc.withdrawMoney(5200);
		acc.printDetails();
		
		Product product = new Product(1, "Phone", 50000);
		int id = product.getId();
		System.out.println("Product Id: " + id);
		
	}

}
