/*
Write a program that will print out information about user based on email. 
Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_073_Email_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    int underscore = email.indexOf("_");
		int at = email.indexOf("@");
		int dot=email.indexOf(".");

		String firstName = email.substring(0, underscore);
		String lastName = email.substring(underscore + 1, at);
		
		String domain=email.substring(at+1,dot);
		String topDomain=email.substring(dot+1);
		
		firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
		lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topDomain);

		
		scan.close();
	}

}
