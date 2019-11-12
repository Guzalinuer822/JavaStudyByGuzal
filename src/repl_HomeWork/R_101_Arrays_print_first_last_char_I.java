/*
Given a String array words, iterate through each word and print first 
and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print: 
       ho
       wy
       by
       ae
       ne
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_101_Arrays_print_first_last_char_I {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		// TODO: Write your code below

		String firstAndLast = "";
		for (int i = 0; i < words.length; i++) {
			firstAndLast = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1);
			System.out.println(firstAndLast);
		}

	}

}
