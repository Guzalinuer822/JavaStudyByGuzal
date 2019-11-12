/*
		 * In this assignment you will write a program to create a shopping list, count
		 * and prices.
		 * 
		 * Please read carefully! If you do not fully understand the requirement ask
		 * your classmates in Slack or ask your instructor!
		 * 
		 * You will use Scanner object and ask user to enter 3 items followed by its
		 * count, price and you will calculate total price and show as a report.
		 * 
		 * -Declare 4 String variables item1, item2, item3, report.
		 * 
		 * -Declare double variables price1, price2, price3, totalPrice
		 * 
		 * -Declare int variables count1, count2, count3
		 * 
		 * -Create a Scanner object named scan.
		 * 
		 * Execution flow using with example:
		 * 
		 * Use scanner to read all 3 values.
		 * 
		 * -Display prompt "Enter Item1, count and its price:" Tomatoes 2 5.4
		 * Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)
		 * 
		 * 
		 * -Display prompt "Enter Item2, count and its price:" Cheese 0 3.5 Explanation:
		 * (Item2 is "Cheese", count is 0, price is 3.5)
		 * 
		 * 
		 * -Display prompt "Enter Item3, count and its price:" Apples 5 6.3 Explanation:
		 * (Item3 is "Apples", count is 5, price is 6.3)
		 * 
		 * 
		 * -calculate totalPrice for all items only if the item's count is more than 0!
		 * 
		 * -build the report variable by concatenating Strings and double price values:
		 * -do not include items that have count 0, use if statement ! -Calculate total
		 * price for the item and concatenate like below
		 * 
		 * "Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5" Explanation: (Item2
		 * "Cheese" is not included since its count is 0)
		 * 
		 * - Print the value of report variable
		 * 
		 * - Print total Price: "Total price: 42.3"
		 */

package repl_HomeWork;

import java.util.Scanner;

public class R_028_ShoppingList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Item1, count and its price:");
		String item1 = scan.nextLine();
		int count1 = scan.nextInt();
		double price1 = scan.nextDouble();

		scan.nextLine(); // Consume newline left-over

		System.out.println("Enter Item2, count and its price:");
		String item2 = scan.nextLine();
		int count2 = scan.nextInt();
		double price2 = scan.nextDouble();

		scan.nextLine(); // Consume newline left-over

		System.out.println("Enter Item3, count and its price:");
		String item3 = scan.nextLine();
		int count3 = scan.nextInt();
		double price3 = scan.nextDouble();

		double price_1 = price1 * count1;
		double price_2 = price2 * count2;
		double price_3 = price3 * count3;

		double totalPrice = 0;
		String report = "";
		if (count1 == 0) {
			report = ("Item2: " + item2 + " Price: " + price_2 + ", Item3: " + item3 + " Price: " + price_3);
			totalPrice = price_2 + price_3;
		} else if (count2 == 0) {
			report = ("Item1: " + item1 + " Price: " + price_1 + ", Item3: " + item3 + " Price: " + price_3);
			totalPrice = price_1 + price_3;
		} else if (count3 == 0) {

			report = ("Item1: " + item1 + " Price: " + price_1 + ", Item2: " + item2 + " Price: " + price_2);
			totalPrice = price_1 + price_2;
		} else {
			report = ("Item1: " + item1 + " Price: " + price_1 + ", Item2: " + item2 + " Price: " + price_2
					+ ", Item3: " + item3 + " Price: " + price_3);
			totalPrice = price_1 + price_2 + price_3;
		}
		System.out.println(report);
		System.out.println("Total price: " + totalPrice);

		scan.close();
	}

}
