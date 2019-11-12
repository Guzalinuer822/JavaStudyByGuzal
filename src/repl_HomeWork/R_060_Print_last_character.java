/*
Write a program that will print out last letter of the word (string).
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_060_Print_last_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(word.charAt(word.length()-1));
	    
	    scan.close();
	}

}
