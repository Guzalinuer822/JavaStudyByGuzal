/*
Given an int array of any length, print a new array of its first 2 elements. 
If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3 
output: [1, 2]

Example:
input 1,
output: [1]
 */

package repl_HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class R_124_Arrays_Front_Piece {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		// WRITE YOUR CODE HERE

		int[] numNew = null;
		if (size >= 2) {
			numNew = new int[2];

			numNew[0] = num[0];
			numNew[1] = num[1];

		}

		if (size == 1) {
			numNew = new int[1];
			numNew[0] = num[0];
		}

		System.out.println(Arrays.toString(numNew));
		
		scan.close();
	}

}
