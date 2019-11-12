/*
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three 
characters of the word. 

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_065_Middle_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// YOUR CODE HERE

		if (word.length() % 2 == 1 && word.length() >= 5) {
			int midOdd = (word.length() + 1) / 2;
			System.out.println(word.substring(midOdd - 2, midOdd + 1));
		} else {
			System.out.println("invalid");
		}
		
		scan.close();
	}

}
