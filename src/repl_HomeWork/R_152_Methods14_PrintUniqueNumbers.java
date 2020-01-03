package repl_HomeWork;

import java.util.Scanner;

/*
Complete a void method printUniqueNumbers() that will print all unique numbers 
from an array of ints. Every single unique int should be printed from the new line. 

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */
public class R_152_Methods14_PrintUniqueNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		// WRITE YOUR CODE HERE
		int unique = 0;
		for (int i = 0; i < nums.length; i++) {
			int repeat = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					repeat++;
				}
			}

			if (repeat == 1) {
				unique = nums[i];
				System.out.println(unique);
			}
		}

	}

}