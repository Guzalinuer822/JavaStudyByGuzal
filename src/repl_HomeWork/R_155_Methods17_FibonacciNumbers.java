package repl_HomeWork;

import java.util.Scanner;

/*
Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers 
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... 
The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 21
 */
public class R_155_Methods17_FibonacciNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {
		// WRITE YOUR CODE HERE
		int[] fibonacci = new int[num+1];

		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i < num+1; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		System.out.println(fibonacci[num]);
	}
}