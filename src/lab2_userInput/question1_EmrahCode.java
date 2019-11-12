/*
Write a program with a loop that lets the user enter a series 
of integer numbers. After all the numbers have been entered, 
the program should display the largest and smallest numbers entered.
 */

package lab2_userInput;

import java.util.Scanner;

public class question1_EmrahCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 = scan.nextInt();

		System.out.println("Enter your next number");
		int num2 = scan.nextInt();

		scan.nextLine();
		System.out.println("Do you want to enter another number:");
		String answ = scan.nextLine();

		int tnum = 0;
		int max = 0;
		int min = 0;

		while (answ.equals("Yes")) {
			System.out.println("Enter your next number");
			tnum = scan.nextInt();

			if (tnum > num1 && tnum > num2) {
				max = tnum;

			} else {
				if (num1 > num2) {
					max = num1;
				} else {
					max = num2;
				}
			}

			if (tnum < num1 && tnum < num2) {
				min = tnum;

			} else {
				if (num1 < num2) {
					min = num1;
				} else {
					min = num2;
				}
			}
			scan.nextLine();
			System.out.println("Do you want to enter another number:");
			answ = scan.nextLine();
		}

		System.out.println("The largest number is " + max);
		System.out.println("The largest number is " + min);

		scan.close();
	}

}
