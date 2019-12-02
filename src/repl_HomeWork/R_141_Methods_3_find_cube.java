/*
Given method called cube. Write all required code inside this method 
in order  to asks the user for a number and then prints the cubed 
value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_141_Methods_3_find_cube {

	 
	  public static void cube()
	  {
	    //your code here
		 Scanner scan=new Scanner(System.in);
		 
		 int num=scan.nextInt();
		 
		 int result=num*num*num;
		 
		 System.out.println(result);
		  
		 scan.close();
		  
	  }//end cube
	  
	  public static void main(String[] args) {
	    
	    cube();
	   
	  }
	}