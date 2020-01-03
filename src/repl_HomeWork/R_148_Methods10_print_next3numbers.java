package repl_HomeWork;

import java.util.Scanner;

/*
Create a method called next3 . This method gets an int argument and 
prints the next 3 numbers after that number. Call the method from 
main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
 */
public class R_148_Methods10_print_next3numbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("enter number");
		int num = inp.nextInt();

		next3(num);
	}

	public static void next3(int num) {

		String result = "";
		for (int i = 0; i < 3; i++) {

			result = result + (++num) + " ";
		}

		System.out.println(result);
	}

}