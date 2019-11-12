/*
The code provided in your main method will take in five Strings and save 
them into an array called arr.  Print out the first three letter of each 
element of arr, one per line.  You can assume that every element of arr 
is at least 3 letters long.

Example:
arr -> ["apple", "banana"] 
 prints: app
         ban
 */
package repl_HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class R_100_Arrays_printing_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
		}
		// leave above alone! write your code below.
		// Create another loop for your solution!

		String firstThree = "";
		for (int i = 0; i < 5; i++) {
			firstThree = arr[i].substring(0, 3);
			System.out.println(firstThree);
		}

		input.close();
	}

}
