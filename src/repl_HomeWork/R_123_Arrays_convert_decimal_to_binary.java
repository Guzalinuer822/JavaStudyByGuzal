/*
Binary number is a number expressed in the base-2 numeral system 
or binary numeral system, which uses only two symbols: typically 
0 (zero) and 1 (one). Each digit is referred to as a bit.





Given an int variable decimal,  write java program to calculate 
binary value of the decimal variable and assign it binary array. 
print out value of binary array matching below format. Feel free 
to use additional arrays or formulas.

Example:
decimal -> 3
binary -> [0, 0, 0, 0, 0, 0, 1, 1]

decimal -> 35
binary -> [0, 0, 1, 0, 0, 0, 1, 1]

decimal -> 255
binary -> [1, 1, 1, 1, 1, 1, 1, 1]


Note: Steps to Convert from Decimal to Binary

If you don't have a calculator to hand, you can easily convert a decimal 
number to binary using the remainder method. This involves dividing the 
number by 2 recursively until you're left with 0, while taking note of 
each remainder.

1. Write down the decimal number.
2. Divide the number by 2.
3. Write the result underneath.
4. Write the remainder on the right hand side. This will be 0 or 1.
5. Divide the result of the division by 2 and again write down the remainder.
6. Continue dividing and writing down remainders until the result of the 
division is 0.

7. The most significant bit (MSB) is at the bottom of the column of remainders 
and the least significant bit (LSB) is at the top.

8. Read the series of 1s and 0s on the right from the bottom up. This is the 
binary equivalent of the decimal number.
 */

package repl_HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class R_123_Arrays_convert_decimal_to_binary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.

		for (int i = 0; i < binary.length; i++) {

			binary[i] = decimal % 2;
			decimal = decimal / 2;
		}

		// have to read from last to first. has to change and put in new array

		int[] binaryNew = new int[8];

		int index = 0; // responsible for new array index

		// it has to from last element to first element so decreased for loop
		for (int i = binary.length - 1; i >= 0; i--) {

			binaryNew[index++] = binary[i];
		}

		System.out.println(Arrays.toString(binaryNew));
		
		input.close();

	}

}
