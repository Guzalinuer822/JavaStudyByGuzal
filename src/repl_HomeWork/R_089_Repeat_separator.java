/*
Given two strings, word and a separator sep, return a big string made of 
count occurrences of the word, separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord

Example:
input: This
input: And
input: 2
output: ThisAndThis

Example:
input: This
input: And
input: 1
output: This
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_089_Repeat_separator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();

		String result = "";
		
		for (int i = 1; i <= count; i++) {

			result = result + word + separator;

		}

		result = result.substring(0, result.length() - separator.length());
		System.out.println(result);
		
		scan.close();

	}

}
