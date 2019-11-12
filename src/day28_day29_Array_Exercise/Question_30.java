package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int n = 2;

		System.out.println(Arrays.toString(notAlone(x, n)));

		int[] y = { 1, 2, 3, 2, 5, 2 };
		int a = 2;

		System.out.println(Arrays.toString(notAlone(y, a)));

	}

	public static int[] notAlone(int[] x, int n) {

		for (int i = 0; i < x.length - 1; i++) {

			// first make sure this element is alone, so it shouldn't be in first and last
			// index position;
			if (x[0] != n || x[x.length - 1] != n) {

				// then check previous and next element this value; ---> i-1 i i+1 positions are
				// checked--- the relationship
				if (x[i] == n) {

					if (x[i] > x[i - 1] && x[i] < x[i + 1]) {
						x[i] = x[i + 1];
					}

					else if (x[i] < x[i - 1] && x[i - 1] < x[i + 1]) {
						x[i] = x[i + 1];
					}

				}

			}

		}

		return x;
	}

}