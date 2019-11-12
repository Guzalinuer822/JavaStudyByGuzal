package day28_day29_Array_Exercise;

public class Question_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int[] y = { 1, 2, 3, 1 };
		int[] z = { 1, 2, 1 };
		int[] j = { 1 };

		System.out.println(sameFirstLast(x));
		System.out.println(sameFirstLast(y));
		System.out.println(sameFirstLast(z));
		System.out.println(sameFirstLast(j));

	}

	public static String sameFirstLast(int[] arr) {

		if (!(arr.length > 1)) {
			return "not a valid array";
		}

		if (arr[0] == arr[arr.length - 1]) {
			return "true";
		} else {
			return "false";
		}

	}

}
