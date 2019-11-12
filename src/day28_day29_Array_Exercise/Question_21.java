package day28_day29_Array_Exercise;

public class Question_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 2, 3, 2, 2, 4, 2 };
		System.out.println(sum2and8(x));

		int[] y = { 2, 3, 2, 2, 4, 2, 2 };
		System.out.println(sum2and8(y));

		int[] a = { 1, 2, 3, 4 };
		System.out.println(sum2and8(a));

	}

	public static boolean sum2and8(int[] x) {

		int sumTwo = 0;
		for (int i = 0; i < x.length; i++) {

			if (x[i] == 2) {
				sumTwo = sumTwo + x[i];
			}
		}

		if (sumTwo == 8) {
			return true;
		}

		return false;
	}
}
