package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(startEndArray(5, 10)));
		System.out.println(Arrays.toString(startEndArray(11, 18)));
		System.out.println(Arrays.toString(startEndArray(1, 3)));
	}

	public static int[] startEndArray(int start, int end) {
		
		int[] arr = new int[end - start];

		for (int i = 0; i <arr.length; i++) {

			arr[i] = start;
			start++;
		}

		return arr;
	}
}
