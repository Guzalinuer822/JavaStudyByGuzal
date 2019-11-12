/*
 * Write a program that will verify if word contains in the sentence. 
 * Print out the result as boolean value. 
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_068_Verify_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(sentence.contains(word));
	    
	    scan.close();
	}

}
