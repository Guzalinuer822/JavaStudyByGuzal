/*
Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_090_Count_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int count = 0;

		for (int i = 0; i < word.length() - 3; i++) {
			if (word.substring(i, i + 4).equals("java")) {
				count++;
			}
		}

		System.out.println(count);
		
		scan.close();
	}

}
