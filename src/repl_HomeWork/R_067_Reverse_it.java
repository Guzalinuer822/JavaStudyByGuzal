/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console. 

Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_067_Reverse_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE

		String reverse = "";

		if (word.length() < 5) {
			System.out.println("Too short!");
		} else if (word.length() > 5) {
			System.out.println("Too long!");
		} else {

			reverse = word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + ""
					+ word.charAt(0);

			System.out.println(reverse);
		}
		
		scan.close();
	}

}
