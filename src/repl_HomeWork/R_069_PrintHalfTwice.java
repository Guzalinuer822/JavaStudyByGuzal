/*
Write a program that will print out first half of the word twice. 

Example:

input: java
output: jaja
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_069_PrintHalfTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    String firstHalf=word.substring(0, word.length()/2);
	    
	    String result=firstHalf+firstHalf;
	    
	    System.out.println(result);
	    
	    scan.close();
	}

}
