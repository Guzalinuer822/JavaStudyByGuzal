/*
Given the array words, it will print the word with the largest length. 
Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_115_Arrays_FindingMaxLength_inStringArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {

			words[i] = input.nextLine();

		}

		// write your code below

		int maxLength = words[0].length();
		int index = 0;
		for (int i = 0; i < 5; i++) {
			if (words[i].length() > maxLength) {
				index = i;
			}

		}

		System.out.println(words[index]);
		
		input.close();
	}

}
