/*
Write a program that will print the shortest word in the given array str. 

input: java, cable, red, vivid, remedy, grace
output: red
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_120_Arrays_Print_shortest_word {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };

		String shortest = str[0]; // set word at str[0] is the shortest ,than compare
		for (int i = 0; i < str.length; i++) {
			if ((str[i].length() != shortest.length()) && str[i].length() < shortest.length()) {

				shortest = str[i];
			}
		}

		System.out.println(shortest);

		scan.close();
	}

}
