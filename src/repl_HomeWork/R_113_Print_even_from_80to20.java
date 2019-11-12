/*
Write a for loop that prints all the even integers from 
80 through 20 inclusive, separated by spaces.
 */

package repl_HomeWork;

public class R_113_Print_even_from_80to20 {

	public static void main(String[] args) {
		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = i;

		}

		for (int i = 80; i >=20; i--) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}

	}

}
