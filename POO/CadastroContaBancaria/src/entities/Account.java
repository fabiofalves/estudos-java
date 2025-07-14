package entities;

public class Account {
	
	private int accountNumber;
	private String holderName;
	private double balance;
	private double tax = 5.0;
	
	public Account(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}
	
	public Account(int accountNumber, String holderName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		deposit(initialDeposit);
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit (double depositValue) {
		balance += depositValue;
	}
	public void withdraw (double withdrawValue) {
		balance -= tax + withdrawValue;
	}
		
	public String toString() {
		return "Account: " 
				+ accountNumber
				+ ", Holder: "
				+ holderName
				+ ", Balance: $"
				+ String.format("%.2f", balance);
				
	}

	
	
}
