/*
Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
Expected Output:  3 6 9 12 15 18
 */

package repl_HomeWork;

public class R_082_div3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1;
		while (number < 20) {
			if (number % 3 == 0) {
				System.out.print(number + " ");
			}

			number++;
		}
	}

}
