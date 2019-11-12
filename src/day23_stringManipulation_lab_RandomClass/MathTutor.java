package day23_stringManipulation_lab_RandomClass;

import java.util.Random;
import java.util.Scanner;

// or just write------  import java.util.*

public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int sum;
		int userAnswer;

		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		num1 = random.nextInt(100);
		num2 = random.nextInt(100);

		System.out.println("What is the answer to following problem?");
		System.out.println(num1 + "+" + num2 + " = ?");

		userAnswer = scan.nextInt();

		sum = num1 + num2;

		if (userAnswer == sum) {
			System.out.println("your are correct!");
		} else {
			System.out.println("Sorry, the correct answer is " + sum);
		}
		
		

}

}
