package lab2_userInput;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-3
        Write a program that asks the user for a positive nonzero integer value. 
        The program should use a loop to get the sum of all the integers from 1 
        up to the number entered. 
		 */

		int sum= 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int upper_bound =scan.nextInt();
		

		int num = 0;
		while (num <upper_bound && upper_bound>0) {
			sum = sum + num;
			num++;
		}
		System.out.println("Sum of number = " + sum);
		scan.close();
	}

}
