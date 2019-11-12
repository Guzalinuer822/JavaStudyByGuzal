/*
In this task, you need to swap first name with last name in the email. 
If email doesn't contains underscore - do not anything. 

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_072_Email_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		if (!(email.contains("_"))) {
			System.out.println(email);
		} else {
			int underscore = email.indexOf("_");
			int at = email.indexOf("@");

			String firstName = email.substring(0, underscore);
			String lastName = email.substring(underscore + 1, at);

			String output = lastName + "_" + firstName + "@gmail.com";

			System.out.println(output);

		}
		
		scan.close();
	}

}
