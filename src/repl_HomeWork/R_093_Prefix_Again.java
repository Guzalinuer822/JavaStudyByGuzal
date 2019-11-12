/*





Given a string, consider the prefix string made of the first n chars 
of the string. Does that prefix string appear somewhere else in the string? 
Assume that the string is not empty and that n is in the range from 1 till str.length().

Example:
input: abXYabc
input: 1
output: true
a appears twice

Example:
input: abXYabc
input: 2
output: true
ab appears twice

Example:
input: abXYabc
input: 3
output: false
abX appears once only
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_093_Prefix_Again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		String check = str.substring(0, n);
		int count = 0;

		for (int i = 0; i < str.length() - (n - 1); i++) {

			if (str.substring(i, i + n).equals(check)) {
				count++;
			}

		}

		if (count > 1) {
			System.out.println("true");
		}

		else {
			System.out.println("false");
		}
		
		scan.close();
	}

}
