package day28_day29_Array_Exercise;

public class Question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int[] y = { 5, 11, 2 };
		int[] z = { 7, 0, 0 };
		int[] a = { 3, -2, 10, 4 };

		System.out.println(sumArray(x));
		System.out.println(sumArray(y));
		System.out.println(sumArray(z));
		System.out.println(sumArray(a));
	}

	public static int sumArray(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}

		return sum;
	}
}
