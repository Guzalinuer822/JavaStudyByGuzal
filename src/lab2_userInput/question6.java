package lab2_userInput;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Question-6
* Write a program that will ask the user to enter the amount of a purchase. 
* The program should then compute the state and county tax sales tax. 
* Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
* The program should display the amount of the purchase , the state sales tax, 
* the county sales tax, the total sales tax, and the total of the sale 
* (which is the sum of the amount of purchase plus the total sales tax)
*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter amount of purchase: ");
		double purchase=scan.nextDouble();
		
		double stateSaleTax=purchase*0.04;
		double countrySaleTax=purchase*0.02;
		double totalSaleTax=stateSaleTax+countrySaleTax;
		double totaleOfSale=purchase+totalSaleTax;
		
		System.out.println("The amount of purchase: $ " + purchase);
		System.out.println("The state sale tax: $ " + stateSaleTax);
		System.out.println("The country sale tax: $ " + countrySaleTax);
		System.out.println("The total sale tax: $ " + totalSaleTax);
		System.out.println("The total of the sale: $ " + totaleOfSale);
		scan.close();
	}

}
