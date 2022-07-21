package s04constructor;

public class BankAccount {
	
	int accountNumber;
	private int balanceTotal;
	static String bankName = "SBI";
	static double interestRate = 6.7;
	
	{
		System.out.println("This is a bank account");
	}
	
	public void withdrawMoney(int amount) {
		this.balanceTotal -= amount;
	}
	
	public void depositMoney(int amount) {
		this.balanceTotal += amount;
	}
	
	public BankAccount(int accountNum, int total) {
		this.accountNumber = accountNum;
		this.balanceTotal = total;
	}
	
	 public void printAccount() {
		System.out.println("Welcome to " + BankAccount.bankName);
		System.out.println("Current Loan Interest Rate " + BankAccount.interestRate);
		System.out.println("AccountNumber: " + this.accountNumber);
		System.out.println("Available Balance: " + this.balanceTotal);
		System.out.println("-------");
	}

}

