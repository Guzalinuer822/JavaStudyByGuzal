/*
Using for loops (you may need more than one), write code that will 
cause a triangle of asterisks of size n to be output to the screen.

Example:
input: 5
output: *
output: **
output: ***
output: ****
output: *****

Example:
input: 3
output: *
output: **
output: ***
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_108_Print_triangle {

	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

	
		scan.nextLine().trim();
		for (i = 1; i <= n; i++) {

			for (j = 1; j < i+1; j++) {    // it should be j<i+1, because if it is j<i then when j=1 and i=1 
				                           // it will skip first line and will print only empty line
				                          // so it has to be j<i+1 for print from first line;
				System.out.print("*");
			}

			System.out.println();
		}

		scan.close();
	}

}
