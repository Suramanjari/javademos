package nonstaticcontext;

import finance.BankAccount;

public class DefaultConstructorTest {
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		
		BankAccount account2 = new BankAccount();
		
		account1.printAccount();
		account2.printAccount();
	}
	BankAccount

}
