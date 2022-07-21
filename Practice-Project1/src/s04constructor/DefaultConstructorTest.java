package s04constructor;

public class DefaultConstructorTest {
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(1023, 5000);
		
		BankAccount account2 = new BankAccount(1025, 8000);
		
		account1.withdrawMoney(500);
		account2.depositMoney(1700);
		
		account1.printAccount();
		account2.printAccount();
					
	}
}
