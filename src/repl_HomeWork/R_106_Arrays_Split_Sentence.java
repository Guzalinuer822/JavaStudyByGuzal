/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun

 */

package repl_HomeWork;


import java.util.Scanner;

public class R_106_Arrays_Split_Sentence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// type your code below

		String[] arr = sentence.split(" ");

		for (String value : arr) {
			System.out.println(value);
		}

		input.close();
	}

}
