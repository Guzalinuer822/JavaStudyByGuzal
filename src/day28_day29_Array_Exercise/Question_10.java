package day28_day29_Array_Exercise;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 2, 2 };
		int[] y = { 3, 3 };
		int[] a = { 2, 3 };
		int[] b = { 12, 20, 42 };
		int[] c = { 2, 2, 2 };

		System.out.println(contatinTwice(x));
		System.out.println(contatinTwice(y));
		System.out.println(contatinTwice(a));
		System.out.println(contatinTwice(b));
		System.out.println(contatinTwice(c));

	}

	public static String contatinTwice(int[] x) {

		int count2 = 0;
		int count3 = 0;

		for (int i = 0; i < x.length; i++) {

			if (x[i] == 2) {
				count2++;
			} else if (x[i] == 3) {
				count3++;
			}
		}

		if (count2 == 2 || count3 == 2) {
			return "true";
		} else {
			return "false";
		}
	}
}
