package repl_HomeWork;

import java.util.Scanner;

/*
Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false). 
Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false
 */
public class R_154_Methods16_CheckIfNumber_IsPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {
		// WRITE YOUR CODE HERE

		int original = num;
		int reversed = 0;
		int remainder = 0;

		// while loop is used to loop through num until it is equal to 0
		while (num != 0) {

			remainder = num % 10; // On each iteration, the last digit of num is stored in remainder.
			reversed = reversed * 10 + remainder; // remainder is added to reversedInteger such that it is added to the
													// next place value (multiplication by 10).
			num = num / 10; // the last digit is removed from num after division by 10.

		}

		// reversedInteger and originalInteger are compared. If equal, it is a
		// palindrome number. If not, it isn't.
		if (reversed == original) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}