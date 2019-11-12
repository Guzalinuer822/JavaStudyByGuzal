/*
You have 2 words
Print the first word, second word, second word, first word

Input:
one
two
Output: 
onetwotwoone
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_063_Duplicate_It {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		    
		    String result=word1+word2+word2+word1;
		    
		    System.out.println(result);
		    
		    scan.close();
	}

}
