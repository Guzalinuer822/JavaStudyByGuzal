package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2 };
		int[] y = { 3, 4 };

		System.out.println(Arrays.toString(combine(x, y)));

		int[] a = { 1, 2, 5, 6 };
		int[] b = { 3, 4 };

		System.out.println(Arrays.toString(combine(a, b)));
	}

	public static int[] combine(int[] x, int[] y) {

		int[] result = new int[x.length + y.length];

		for (int i = 0; i < x.length; i++) {
			result[i] = x[i];
		}

		for (int i = 0; i < y.length; i++) {
			result[x.length + i] = y[i];
		}

		return result;
	}
}
