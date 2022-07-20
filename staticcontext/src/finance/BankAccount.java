package finance;

public class BankAccount {

	int accountNumber;
	int balanceTotal;
	static String bankName = "SBI";
	static double interestRate = 7.2;
	
	BankAccount(int accountNum, int total) {
		this.accountNumber = accountNum;
		this.balanceTotal = total;
	}
	
	public void printAccount() {
		System.out.println("Welcome to" + BankAccount.bankName);
		System.out.println("Current Loan Interest Rate" + BankAccount.interestRate);
		System.out.println("AccountNumber:" + this.accountNumber);
		System.out.println("Availabe Balance:" + this.balanceTotal);
		System.out.println("-------");
		
	}
}
