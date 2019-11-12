/*
Dr. Kimuta was so happy,  and he has asked you to write one more program. :) 

A slot machine (Links to an external site.) is a gambling device that the user 
inserts money into and then pulls a lever (or presses a button). The slot machine 
then displays a set of random images. If two or more of the images match, the user 
wins an amount of money that the slot machine dispenses back to the user.

Create a program that simulates a slot machine. When the program runs, it should do the following:

* Ask the user to enter the amount of money he or she wants to enter into the slot machine.

* Instead of displaying images, the program will randomly select a word from the following list: Cherries, 
Oranges, Plums, Bells, Melons, Bars

* To select a word, the program can generate a random number in the range of 0 through 5. If the number is 0, 
the selected word is Cherries; if the number is 1, the selected word is Oranges; and so forth. The program should 
randomly select a word from the list three times and display all three of the words.

* If none of the randomly selected words match, the program will inform the user that he or she has won $0.

* If two of the words match, the program will inform the user that he or she was won two times the amount entered.

* If three of the words match, the program will inform the user that he or she has won three times the amount entered.

* The program will ask whether the user wants to play again. If so, these steps are repeated. If not, the program displays 
the total amount of money entered into the slot machine and the total amount won.
 
 */

package assignment;

import java.util.Random;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int bet = 0;
		int reward = 0;
		String str0 = "Cherries";
		String str1 = "Oranges";
		String str2 = "Plums";
		String str3 = "Bells";
		String str4 = "Melons";
		String str5 = "Bars";
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to slot machine, choose 1-start,0-exit;");
		int userChoose = scan.nextInt();

		do {
			System.out.println("enter the amount of money you want to enter:");
			bet = scan.nextInt();

			Random random = new Random();
			for (int i = 1; i <= 3; i++) {
				num1 = random.nextInt(6);
				num2 = random.nextInt(6);
				num3 = random.nextInt(6);

				if (num1 == 0 || num2 == 0 || num3 == 0) {
					System.out.println(str0);
				} else if (num1 == 1 || num2 == 1 || num3 == 1) {
					System.out.println(str1);
				} else if (num1 == 2 || num2 == 2 || num3 == 2) {
					System.out.println(str2);
				} else if (num1 == 3 || num2 == 3 || num3 == 3) {
					System.out.println(str3);
				} else if (num1 == 4 || num2 == 4 || num3 == 4) {
					System.out.println(str4);
				} else if (num1 == 5 || num2 == 5 || num3 == 5) {
					System.out.println(str5);
				}
			}

			if (num1 == num2 || num1 == num3 || num2 == num3) {
				reward = 2 * bet;
				
			}

			else if (num1 == num2 && num2 == num3 && num1 == num3) {

				reward = 3 * bet;
				
			}

			else {

				reward = 0;
				
			}

			System.out.println("You want to play again? choose 1-start,0-exit;");
			userChoose = scan.nextInt();
		} while ((userChoose == 1));

		if (userChoose == 0) {
			System.out.println("the total amount of money entered into the slot machine " + bet);
			System.out.println("the total amount won: " + reward);
		}

		scan.close();
	}

}
