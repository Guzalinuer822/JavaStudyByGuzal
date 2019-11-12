/*
Write a program that will print out even numbers from 2 to 100 through the comma. 
 */

package repl_HomeWork;



public class R_081_Evens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {

				System.out.print(i + ",");

			}
		}

	}

}
