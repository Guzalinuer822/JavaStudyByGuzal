package day33_ClassesObjects_constroctors;

public class BankAccount {
	
	double balance;
	
	// 1. this constructor sets the starting balance at 0.0
	public BankAccount() {
		balance=0.0;
	}
	
	//2. this constructor sets the starting balance to the value passes as an argument
	public BankAccount(double balance) {
		this.balance=balance;
	}
	
	//3. this constructor sets the starting balance to the value in the String argument
	
	public BankAccount(String str) {
		balance=Double.parseDouble(str);
	}
	
	
	// this method makes a deposit into account
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	// this method makes a deposit into account
	public void deposit(String str) {
		balance=balance+Double.parseDouble(str);
	}

	public double getBalance() {
		return balance;
	}
}
