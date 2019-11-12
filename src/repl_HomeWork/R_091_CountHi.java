/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_091_CountHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				count++;
			}

		}

		System.out.println(count);
		
		scan.close();
	}

}
