package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 2, 10, 3, 4, 20, 5 };

		System.out.println(Arrays.toString(multiple10(x)));

		int[] y = { 10, 1, 20, 2 };

		System.out.println(Arrays.toString(multiple10(y)));
	}

	public static int[] multiple10(int[] x) {

		for (int i = 0; i < x.length - 1; i++) {

			if (x[i] % 10 == 0) {

				for (int j = i + 1; j < x.length && x[j] % 10 != 0; j++)
					x[j] = x[i];

			}

		}
		return x;
	}
}
