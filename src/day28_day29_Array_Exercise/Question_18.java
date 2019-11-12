package day28_day29_Array_Exercise;

public class Question_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this is for ----> when find 13 break;

		int[] x = { 1, 2, 2, 1, 3, 13, 3, 100, 5000 };

		int sum = 0;

		for (int i = 0; i < x.length; i++) {

			if (x[i] != 13) {
				sum = sum + x[i];
			} else {
				break;

			}
		}

		System.out.println(sum);

		
		
		
		// this is for ---->   if it is not include 13 and immediate following number;
		int[] x1= { 1, 2, 2, 1 };

		System.out.println(unLucky13Sum(x1));

		int[] a = { 1, 2, 2, 1, 13 };

		System.out.println(unLucky13Sum(a));

		int[] b = { 1, 2, 2, 1, 13, 3 };

		System.out.println(unLucky13Sum(b));
	}

	// if it is not include 13 and immediate following number;
	public static int unLucky13Sum(int[] x) {

		int sum = 0;
		for (int i = 0; i < x.length; i++) {

			if (x[i] == 13) {
				i = i + 2; // if x[i]=13 , then it will not include x[i] and x[i+1] so it has to started
							// from x[i+2]
			} else {
				sum = sum + x[i];
			}
		}

		return sum;
	}
}
