package day28_day29_Array_Exercise;

public class Question_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 10, 1, 5, 6 };

		System.out.println(largestAndSmallest(x));

	}

	public static int largestAndSmallest(int[] x) {

		int largest = x[0];
		int smallest = x[0];

		for (int i = 0; i < x.length; i++) {
			if (x[i] > largest) {
				largest = x[i];
			}

			if (x[i] < smallest) {
				smallest = x[i];
			}
		}

		return largest - smallest;

		/*
		 * this one using for each loop for (int value : x) { if (value > largest) {
		 * largest = value; }
		 * 
		 * if (value < smallest) { smallest = value; } }
		 */
	}
}
