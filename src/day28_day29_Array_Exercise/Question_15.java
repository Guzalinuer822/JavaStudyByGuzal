package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(swapElemnts(x)));
		
		int[] y = { 8,6,7,9,5};

		System.out.println(Arrays.toString(swapElemnts(y)));
	}

	public static int[] swapElemnts(int[] x) {

		int swap = x[0];
		x[0] = x[x.length - 1];
		x[x.length - 1] = swap;

		return x;
	}
}
