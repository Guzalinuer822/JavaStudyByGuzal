/*
Write a program that will print out first and last letters together.

input: adobe
output: ae
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_062_PrintFirstAndLastLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(""+word.charAt(0)+(word.charAt(word.length()-1)));
	    
	    scan.close();
	}

}
