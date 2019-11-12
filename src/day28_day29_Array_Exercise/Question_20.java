package day28_day29_Array_Exercise;

public class Question_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[] x = { 1, 2, 2 };

		System.out.println(contain2and2(x));

		int[] y = { 1, 2, 1, 2 };

		System.out.println(contain2and2(y));

		int[] a = { 2, 1, 2 };

		System.out.println(contain2and2(a));

		int[] b = { 2, 2, 1, 2 };

		System.out.println(contain2and2(b));

	}

	public static String contain2and2(int[] x) {

		for (int i = 0; i < x.length-1; i++) {
			if (x[i] == 2 && x[i + 1] == 2) {
				return "true";
			}
		}

		return "false";
	}
}
