package lab2_userInput;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Question-1 Write a program with a loop that lets the user enter a series of
		 * integer numbers. After all the numbers have been entered, the program should
		 * display the largest and smallest numbers entered.0-yes, 1-no.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 = scan.nextInt();

		System.out.println("Enter your next number");
		int num2 = scan.nextInt();

		scan.nextLine();
		System.out.println("Do you want to enter another number: yes or no?");
		String answer = scan.nextLine();

		int numNext = 0;
		int max = 0;
		int min = 0;

		while (answer.equalsIgnoreCase("yes")) {
			
			System.out.println("Enter your next number");
			numNext = scan.nextInt();

			if (numNext > num1 && numNext > num2) {
				max = numNext;

			} else {
				if (num1 > num2) {
					max = num1;
				} else {
					max = num2;
				}
			}

			if (numNext < num1 && numNext < num2) {
				min = numNext;

			} else {
				if (num1 < num2) {
					min = num1;
				} else {
					min = num2;
				}
			}
			scan.nextLine();
			System.out.println("Do you want to enter another number: yes or no?");
			answer = scan.nextLine();
		}

		System.out.println("The largest number is " + max);
		System.out.println("The largest number is " + min);


scan.close();
	}

}
