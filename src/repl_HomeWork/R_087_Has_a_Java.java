/*
Given a string word, print true if "java" appears starting at index 0 or 1 
in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
The string may be any length, including 0word = . 
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_087_Has_a_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() >= 4) {
			if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
				exists = true;
			} else {
				exists = false;
			}

			System.out.println(exists);
		} else {
			System.out.println(exists);
		}
		
		scan.close();
	}

}
