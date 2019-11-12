/*
In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_046_SliceNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //DO NOT CHANGE
	    int num, digit1, digit2, digit3, digit4, digit5;
	    //WRITE YOUR CODE HERE
	    
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("Enter your number:");
	    num=scan.nextInt();
		
	    digit1=num/10000;
	    System.out.println(digit1);
	    
	    num=num%10000;
	    digit2=num/1000;
	    System.out.println(digit2);
	    
	    num=num%1000;
	    digit3=num/100;
	    System.out.println(digit3);
	    
	    num=num%100;
	    digit4=num/10;
	    System.out.println(digit4);
	    
	    num=num%10;
	    digit5=num;
	    System.out.println(digit5);
	    
	    scan.close();
	}
}
