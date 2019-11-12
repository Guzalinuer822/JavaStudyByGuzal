/*
Write a program that will print out letters in the alphabetic 
order accordingly to the given range. 

Example:
input: A
input: Z
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

Example:
input: a
input: f
output: abcdef

Example:
input: a
input: d
output: abcd

Example:
input: B
input: O
output: BCDEFGHIJKLMNO



 */

package repl_HomeWork;

import java.util.Scanner;

public class R_096_Print_Letters_repeatedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
		    
		    String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
				String result = "";

				if (Character.isUpperCase(start)) {

					int startPoint1 = alphabetUpper.indexOf(start);
					int endPoint1 = alphabetUpper.indexOf(end);

					for (int i = startPoint1; i <= endPoint1; i++) {
						result = result + alphabetUpper.charAt(i);
					}

					System.out.println(result);
				}

				else if (Character.isLowerCase(start)) {

					int startPoint2 = alphabetLower.indexOf(start);
					int endPoint2 = alphabetLower.indexOf(end);

					for (int i = startPoint2; i <= endPoint2; i++) {
						result = result + alphabetLower.charAt(i);
					}

					System.out.println(result);
				}
				scan.close();
	}

}
