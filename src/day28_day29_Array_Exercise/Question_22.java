package day28_day29_Array_Exercise;

public class Question_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 4, 1 };
		System.out.println(great1or4(x));

		int[] y = { 1, 4, 1, 4 };
		System.out.println(great1or4(y));

		int[] a = { 1, 1 };
		System.out.println(great1or4(a));

	}

	public static boolean great1or4(int[] x) {

		int count1 = 0;
		int count4 = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 1) {
				count1++;
			} else if (x[i] == 4) {
				count4++;
			}
		}

		if (count1 > count4) {
			return true;
		}
		return false;
	}
}
