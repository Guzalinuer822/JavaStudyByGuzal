package day24_Array_part1;

import java.util.Arrays;

public class Task92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ozzy

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1; // i am putting element inside nums[] array , by i+1 , putting from 1 to 10;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] * 19);
		}

		System.out.println(Arrays.toString(nums));
		
		System.out.println("--------------------------------------------------------");
		// Guzal , mine is right , but not as required -_-

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (numbers[i] * 19);

		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		
		
	}

}
