/*
Given a square matrix, calculate the absolute difference 
between the sums of its diagonals.
For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  

The left-to-right diagonal = 1+5+9 = 15. The right to left 
diagonal =  3+5+9 = 17. Their absolute difference is |15-17| = 2.
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_136_2D_Arrays_Diagonal_Difference {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
		int result = 0;
		int leftToRightDiagonal = 0;
		int rightToLeftDiagonal = 0;

		for (int i = 0; i < matrix.length - 2; i++) {
			for (int j = 0; j < matrix.length - 2; j++) {

				leftToRightDiagonal = matrix[i][j] + matrix[i + 1][j + 1] + matrix[i + 2][j + 2];
				rightToLeftDiagonal = matrix[i][j + 2] + matrix[i + 1][j + 1] + matrix[i + 2][j];

			}

		}

		result = rightToLeftDiagonal - leftToRightDiagonal;

		// FINAL PRINT
		System.out.println(Math.abs(result));
		scan.close();
	}

}
