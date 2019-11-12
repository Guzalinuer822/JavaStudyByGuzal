package day23_stringManipulation_lab_RandomClass;

import java.util.Random;
import java.util.Scanner;

public class Task83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		Scanner scan = new Scanner(System.in);
		
		String answer ="y";
		while (answer.equalsIgnoreCase("y")) {
			System.out.println("rolling the dice...");

			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;

			System.out.println("Their values are: " + num1 + " " + num2);
			System.out.println("Roll them again (y=yes) ?");
			answer = scan.nextLine();

		}

	}

}
