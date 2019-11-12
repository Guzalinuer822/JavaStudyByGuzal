/*
 * 

Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds. 

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_030_Seconds_converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter seconds:");

		int inputSeconds = scan.nextInt();

		int hour = inputSeconds / 3600;
		inputSeconds = inputSeconds % 3600;
		int minute = inputSeconds / 60;
		inputSeconds = inputSeconds % 60;
		int second = inputSeconds;

		String result = hour + " hours, " + minute + " minutes, and " + second + " seconds";

		System.out.println(result);
		
		scan.close();

	}

}
