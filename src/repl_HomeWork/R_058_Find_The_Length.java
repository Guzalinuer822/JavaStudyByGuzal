/*
Write a program that will output length of the text (string).

Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_058_Find_The_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the text:");
		String input=scan.nextLine();
		
		System.out.println("Length is: " + input.length());
		
		scan.close();
	}

}
