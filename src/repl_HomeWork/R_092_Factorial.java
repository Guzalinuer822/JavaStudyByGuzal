/*
In mathematics, the factorial of a positive integer n, denoted by n!, 
is the product of all positive integers less than or equal to n.  
Calculate factorial and output result to the console. 
Example:
input: 5
output: 120
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_092_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		long result = 1;  // if we put integer ,it will not fit

		for (int i = n; i > 0; i--) {
			result = result * i;
		}

		System.out.println(result);
		
		scan.close();
	}

}
