package day18_readingUserInput;

import java.util.Scanner;

public class task73 { // Gessing Game

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		int secretNumber = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");

		do {

			userInput = sc.nextInt();
			if (userInput == secretNumber) {
				System.out.print("Congrar, you got it.");
			} else if (userInput < secretNumber) {
				System.out.print("Enter a bigger number:");
			} else if (userInput > secretNumber) {
				System.out.print("Enter a smaller number:");
			}

		} while (userInput != secretNumber);
		
		sc.close();
	}

}
