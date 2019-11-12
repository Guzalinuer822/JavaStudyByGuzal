package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int[] y = { 11, 5, 9 };
		int[] a = { 110, 5, 98, 0, 1200, 11, -4 };

		System.out.println(Arrays.toString(greatestElement(x)));
		System.out.println(Arrays.toString(greatestElement(y)));
		System.out.println(Arrays.toString(greatestElement(a)));
	}

	public static int[] greatestElement(int[] x) {

		int greatest = x[0];

		for (int i = 1; i < x.length; i++) {
			if (x[i] > greatest) {
				greatest = x[i];
			}
		}

		
		// now assign each array element to greatest value
		
		for (int i = 0; i < x.length; i++) {
			x[i] = greatest;
		}

		return x;
	}
}