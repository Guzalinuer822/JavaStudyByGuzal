package day28_day29_Array_Exercise;

public class Question_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 2, 1, 3, 5 };

		System.out.println(evenOrOdd3(x));

		int[] y = { 2, 1, 2, 5 };

		System.out.println(evenOrOdd3(y));

		int[] a = { 2, 4, 2, 5 };

		System.out.println(evenOrOdd3(a));
	}

	public static boolean evenOrOdd3(int[] x) {

		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < x.length; i++) {

			if (x[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}

		if (countEven == 3 || countOdd == 3) {
			return true;
		}
		return false;
	}
}
