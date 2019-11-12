/*
Write a program that will print out first character of the word. 
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_059_Print_first_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(word.charAt(0));
	    
	    scan.close();
		
	}

}
