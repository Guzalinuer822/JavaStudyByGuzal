/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25% 
The program should display the following information based on the user input: 
Split or No split
Number of people entered: &&&&
Service Quality: 
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input: 
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:
 
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_051_TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tipCalculator();
	}
	
	public static void tipCalculator() {
		String people = "&";
		double totalPay = 0;
		double totalTip = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Split:");
		String split = scan.nextLine();

		System.out.println("Number of people:");
		int numberPeople = scan.nextInt();

		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();

		System.out.println("Service Quality:");
		String serviceQuality = scan.next();

		
		if (split.equalsIgnoreCase("yes")) {
			if (serviceQuality.equalsIgnoreCase("Poor")) {
				totalTip = checkAmount * 0.05;
			}

			else if (serviceQuality.equalsIgnoreCase("Fair")) {
				totalTip = checkAmount * 0.1;
			}

			else if (serviceQuality.equalsIgnoreCase("Good")) {
				totalTip = checkAmount * 0.15;
			}

			else if (serviceQuality.equalsIgnoreCase("Great")) {
				totalTip = checkAmount * 0.2;
			}

			else if (serviceQuality.equalsIgnoreCase("Excellent")) {
				totalTip = checkAmount * 0.25;
			}

		}

		totalPay = checkAmount + totalTip;
		totalPerPerson = totalPay / numberPeople;
		tipPerPerson = totalTip / numberPeople;

		System.out.print("Number of people entered: ");

		for (int i = 1; i <= numberPeople; i++) {
			System.out.print(people);
		}

		System.out.println();

		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);
		
		scan.close();

}
	

}
