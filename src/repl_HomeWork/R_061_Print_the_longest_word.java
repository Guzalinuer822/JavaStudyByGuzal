/*
Write a program that will print out the longest word.
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_061_Print_the_longest_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		// WIRTE YOUR CODE HERE

		if (word1.length() > word2.length()) {
			System.out.println(word1);
		} else {
			System.out.println(word2);
		}

		scan.close();
		
	}

}
