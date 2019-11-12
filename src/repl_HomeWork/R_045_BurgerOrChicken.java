/*
this test can be done with one if.

check if in (string variable) equals "burger" or "chicken"  and output the price 10.0

also if input is "soda" output 2.0 (do this with another if)

for example:

in = "burger"

output: 10.0

in = "chicken "

output: 10.0

in = "soda"

output: 2.0

hint or operator in java is  || 
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_045_BurgerOrChicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String in = s.next();

		// your code here

		if (in.equals("burger") || in.equals("chicken")) {
			System.out.println("output: 10.0");
		} else if (in.equals("soda")) {
			System.out.println("output: 2.0");
		}
		
		s.close();
	}

}
