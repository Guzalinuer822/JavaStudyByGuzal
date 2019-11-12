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
		int leftToRightDiagonal=0;
		int rightToLeftDiagonal=0;
	/*	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					leftToRightDiagonal=leftToRightDiagonal+matrix[i][j];
					
				}
			
			}
		}
*/
		
		leftToRightDiagonal=matrix[0][0]+matrix[1][1]+matrix[2][2];
		rightToLeftDiagonal=matrix[0][2]+matrix[1][1]+matrix[2][0];
		
		result=rightToLeftDiagonal-leftToRightDiagonal;
		
		System.out.println(leftToRightDiagonal);
		System.out.println(rightToLeftDiagonal);
		// FINAL PRINT
		System.out.println(Math.abs(result));
	}

}
