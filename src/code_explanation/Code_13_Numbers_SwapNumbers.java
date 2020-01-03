package code_explanation;

/*

Numbers -- Swap Numbers
Swap two variable' values without using a third variable

*/

public class Code_13_Numbers_SwapNumbers {

	public static void main(String[] args) {

		// first solution:
		// The idea is to get sum in one of the two given numbers.
		// The numbers can then be swapped using the sum and subtraction from sum.

		// suppose there are two number
		int a = 10;
		int b = 20;

		System.out.println("Before swap: " + "a= " + a + ", b= " + b);

		// code to swap
		a = a + b; // now a = sum of a and b---which is 30
		b = a - b; // now b = subtraction of a and b ---which is 10;
		a = a - b; // now a = subtraction of a and b ---which is 20;

		System.out.println("After swap: " + "a= " + a + ", b= " + b);

		
		/*****************************************************************************************/

		// second solution:
		// The idea is to use----- binary bitwise exclusive OR
		// ^ --- represented by a symbol ^ called cap

		// how it work?
		// This operator compares each bit
		// first operand (number) with corresponding bit of the second operand.

		// if two bits have the same value, the output is 0, otherwise, the output is 1.

		int x = 10; // decimal to binary: 01010
		int y = 20; // decimal to binary: 10100

		System.out.println("Before swap: " + "x= " + x + ", y= " + y);

		x = x ^ y; // x: 01010 x now becomes 30 (11110)
					// y: 10100

		y = x ^ y; // x: 11110 y now becomes 10 (01010)
					// y:10100

		x = x ^ y; // x: 11110 x becomes 20 (10100)
					// y: 01010

		System.out.println("After swap: " + "x= " + x + ", y= " + y);

	}

}

/*
 * Solution 1:
 * 
 * int a = 10; int b = 20;
 * 
 * a = a +b;
 * 
 * b = a - b;
 * 
 * a = a - b;
 * 
 * 
 * 
 * Solution 2:
 * 
 * int a = 10; int b = 20;
 * 
 * a = a^b;
 * 
 * b = a^b;
 * 
 * a = a^b;
 */