package day25_Array_part2;

import java.util.Scanner;

public class Pass_Array {

	public static void main(String[] args) {

		// create an array
		int[] numbers = new int[4];

		// pass the array to the getValues method
		getValue(numbers);

		System.out.println("Here are the numbers that you entered:");

		// pass the array to showArray method
		showArray(numbers);
	}

	public static void getValue(int[] numbers) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a series of " + numbers.length + " numbers");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter number " + (i + 1) + " : ");
			numbers[i] = sc.nextInt();
		}

	}

	public static void showArray(int[] numbers) {
		for (int value : numbers) {
			System.out.println(value);
		}

	}

}
