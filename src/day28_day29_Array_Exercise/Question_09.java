package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 4, 5, 6 };

		System.out.println(Arrays.toString(doubleLength(x)));
	}

	public static int[] doubleLength(int[] x) {
		int[] y = new int[x.length * 2];

		for (int i = 0; i < y.length; i++) {
			y[y.length - 1] = x[x.length - 1];
		}

		return y;

	}
}
