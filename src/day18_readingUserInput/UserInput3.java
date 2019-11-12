package day18_readingUserInput;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		System.out.println("Output: " + num1 + ":" + num2 + ":" + str);
		
		sc.close();
	}

}
