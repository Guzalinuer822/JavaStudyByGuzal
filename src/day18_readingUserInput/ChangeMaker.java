package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Enter a whole number from 1-99, and I will find a combination of coins that
equals that amount of change.
		 
quarter = 25 cents; dimes= 10 cents; nickels= 5 cents; pennies = 1 cent;
		  
example: 87 cents= 3 quarters 1 dimes 0 nickels 2 pennies.
		 
*/

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your money from 1-99: ");

		int attempt = 0;
		do {

			int money = sc.nextInt();

			if (money >= 1 && money <= 99) {
				changeMaker(money);
				break;
			} else {
				if (attempt == 3) {
					System.out.println("Sorry , no more attempt.");
					break;
				} else {
					System.out.println("Your input is invalid,try again: ");
				}

			}
		} while (true);
		
		sc.close();

	}

	public static void changeMaker(int money) {

		int originalMoney = money;

		int quarters = money / 25; // every time money is changing , i have to handle with module.
		money = money % 25;
		int dimes = money / 10;
		money = money % 10;
		int nickels = money / 5;
		money = money % 5;
		int pennies = money;

		System.out.println(originalMoney + " cents in coins can be given as: ");

		System.out.println(quarters + " quarter ");
		System.out.println(dimes + " dimes ");
		System.out.println(nickels + " nickles ");
		System.out.println(pennies + " pennies");

	}

}
