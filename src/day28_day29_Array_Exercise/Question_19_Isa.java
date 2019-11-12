package day28_day29_Array_Exercise;

public class Question_19_Isa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 2 };
		int[] y = { 1, 2, 2, 6, 99, 99, 7 };
		int[] a = { 1, 1, 6, 7, 2 };
		int[] b = { 1, 1, 6, 2 };
		int[] c = { 1, 2, 2, 6, 99, 99, 7, 3, 4 };
		System.out.println(ignore(x));
		System.out.println(ignore(y));
		System.out.println(ignore(a));
		System.out.println(ignore(b));
		System.out.println(ignore(c));

	}

	private static int ignore(int[] arr) {

		int sum = 0;
		
label1:   for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 6) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != 7) {

						i++;
					} else if (arr[j] == 7) {
						i++;
						continue label1;
					}
				}
			} else {
				sum = sum + arr[i];

			}

		}

		return sum;

	}

}
