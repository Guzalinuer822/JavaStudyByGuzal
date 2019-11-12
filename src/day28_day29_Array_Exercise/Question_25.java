package day28_day29_Array_Exercise;

public class Question_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int[] y = { 2, 3, 10 };

		System.out.println(returnCount(x, y));

		int[] a = { 1, 2, 3 };
		int[] b = { 2, 3, 5 };

		System.out.println(returnCount(a, b));
	}

	public static int returnCount(int[] x, int[] y) {

		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y[i]) {
				if (x[i] - y[i] <= 2 && x[i] != y[i]) {
					count++;
				}
			} else {
				if (y[i] - x[i] <= 2 && x[i] != y[i]) {
					count++;
				}
			}

		}

		return count;

	}
}
