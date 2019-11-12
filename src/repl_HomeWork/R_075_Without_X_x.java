/*
Given a string word, if the first or last chars are 'x' or 'X', print the 
string without those 'x' or 'X' chars,  otherwise print the string unchanged. 

Example: 
input: xHiX 
output: Hi

Example:
input: apple 
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_075_Without_X_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		String first = word.substring(0, 1);
		String last = word.substring(word.length() - 1);

		if (first.equalsIgnoreCase("x") && !(last.equalsIgnoreCase("x"))) {
			word = word.substring(1);
		}

		else if (last.equalsIgnoreCase("x") && !(first.equalsIgnoreCase("x"))) {
			word = word.substring(0, word.length() - 1);
		}

		else if (first.equalsIgnoreCase("x") && last.equalsIgnoreCase("x")) {

			word = word.substring(1, word.length() - 1);
		}

		System.out.println(word);
		
		scan.close();
	}

}
