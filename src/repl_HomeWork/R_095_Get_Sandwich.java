/*
A sandwich is two pieces of bread with something in between. 
Print the string that is between the first and last appearance 
of "bread" in the given string, or return string "nothing" if 
there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_095_Get_Sandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		String between = "";

		int lastBread = 0;
		int firstBreadEnd= 0;

		// it has to check from start to end to find----->start of last bread
		for (int i = 0; i < str.length() - 4; i++) {
			if (str.substring(i, i + 5).equals("bread")) {
				lastBread = i;    // it will stop at last appearance of bread
				                  // so when i use substring, it should before this i;
			}
		}

		// it has to check from last to start to find---> end of first bread 
		for (int j = str.length(); j >= 5; j--) {  

			if (str.substring(j - 5, j).equals("bread")) {
				firstBreadEnd= j;    // it will find end of first bread
				                //  so when i use substring, it should after this j;
			}

		}

		
		if (lastBread>= 5) {    // it indicate this have two bread , so should >=5
			between = str.substring(firstBreadEnd,lastBread);
		} else {   // if only have one bread return nothing
			between = "nothing";
		}
		System.out.println(between);
		
		scan.close();

	}

}
