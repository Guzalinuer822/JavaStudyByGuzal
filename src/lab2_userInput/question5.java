package lab2_userInput;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Question-5
* Write a program that computes the tax and tip on a restaurant bill. 
* The program should ask the user to enter the charge for the meal. 
* The tax should be 6.75 percent of the meal charge. The tip should 
* be 20 percent of the total after adding tax. Display the meal charge, 
* tax amount, tip amount, and total bill on the screen.
*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your charge for meal: ");
		double meal_charge=scan.nextDouble();
		
		double tax= meal_charge*0.0675;
		double tip=(meal_charge+tax)*0.2;
		double total_charge=meal_charge+tax+tip;
		System.out.println("Your charge for the meal: $ "+meal_charge);
		System.out.println("Tax will be: $ " + tax);
		System.out.println("Tip will be: $ "+tip);
		System.out.println("Total will be: $ " + total_charge);
		scan.close();
	}
	

}
