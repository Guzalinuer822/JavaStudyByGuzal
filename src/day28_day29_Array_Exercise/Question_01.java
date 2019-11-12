package day28_day29_Array_Exercise;

public class Question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 6 };
		int[] y = { 6, 1, 2, 3 };
		int[] z = { 13, 6, 1, 2, 3 };

		System.out.println(check(x));
		System.out.println(check(y));
		System.out.println(check(z));
	}

	public static boolean check(int[] array) {

		if (array.length < 1) {
			return false;
		}

		if (array[0] == 6 || array[array.length - 1] == 6) {
			return true;
		} else {
			return false;
		}

	}

}
