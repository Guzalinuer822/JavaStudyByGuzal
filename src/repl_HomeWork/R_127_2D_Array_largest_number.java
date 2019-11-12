/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_127_2D_Array_largest_number {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

		// TODO write your code below

		int biggest = arr[0][0];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {

				if (arr[i][j] > biggest) {
					biggest = arr[i][j];
				}

			}
		}

		System.out.println(biggest);

	}// end main
}
