package repl_HomeWork;


import java.util.Scanner;

public class R_085_ShoopingList_2_with_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		// create two Array to put user input.
		String[] itemList = new String[10]; // put item name
		double[] priceList = new double[10]; // put item price

		// 1.ask user to enter items followed by its price
		// if answer is yes, do below :

		do {

			System.out.println("Enter Item" + (count) + " and its price:");
			item = scan.next();
			price = scan.nextDouble();

			itemList[count - 1] = item;
			priceList[count - 1] += price;

			count++;

			System.out.println("Add one more item?");
			countinue = scan.next();

		} while (countinue.equalsIgnoreCase("yes"));

		
		
		// 3.summarize the shopping list

		for (int i = 0; i < count - 1; i++) {
			shoppingListReport = shoppingListReport + "Item" + (i + 1) + ": " + itemList[i] + " Price: " + priceList[i];

			if (i != count - 2) { // it should put comma before last input

				shoppingListReport = shoppingListReport + ", "; // to control comma, it should stop before last input

			}

		}

		System.out.println(shoppingListReport);

		// 4.calculate total price;

		for (int i = 0; i < count; i++) {
			totalPrice += priceList[i];
		}

		System.out.println("Total price: " + totalPrice);
		
		scan.close();

	}

}
