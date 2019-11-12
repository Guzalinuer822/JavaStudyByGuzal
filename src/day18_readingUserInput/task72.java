package day18_readingUserInput;

import java.util.Scanner;

public class task72 { // ask kalbi

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		sum(num1, num2, num3);
		
		sc.close();

	}

	public static int sum(int num1, int num2, int num3) {
		int sum;
		sum = num1 + num2 + num3;
		return sum;
	}
	
	
}
