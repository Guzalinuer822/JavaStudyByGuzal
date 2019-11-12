/*
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_079_String_No_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String txt = s.next();
		// your code here

		txt = txt.substring(0, txt.length() - 1);

		System.out.println(txt);
		
		s.close();
	}

}
