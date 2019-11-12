package day33_ClassesObjects_constroctors;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is your starting balance?");
		String input=scan.next();
		
		BankAccount account=new BankAccount(input);  // this invoke 3rd constructor , accept String and parse to double
		
		System.out.println("How much were you paid this month?");
		input=scan.next();

		account.deposit(input);
		
		System.out.println("Your pay has been deposited, Your current balance is: " + account.getBalance());
	}

}
