package day28_day29_Array_Exercise;

public class Question_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Don't format it ctrl+shift+f , NNNNNooooooTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT

		int[] x = { 1, 2, 2, 6, 99, 99, 7, 3 };

		System.out.println(totalIgnore6and7(x));
	}

	/*	
	 
	 */
	public static int totalIgnore6and7(int[] x) {

		int sum = 0;

		boolean check6or7 = false;

		for (int i = 0; i < x.length; i++) {

			// boolean is true, it has to stop adding until find 7

/* 1 */    if (check6or7) {

				// so it is checking for 7, if it find it, has to change boolean to false, and
				// keep calculating.
				if (x[i] == 7) {
					check6or7 = false;
				}
			}

/* 2 */   else if (x[i] == 6) { // if it find 6 , has to stop adding number, so has to change boolean to true;
				check6or7 = true;
			}

/* 3 */   else { // boolean is false , so it is keep calculating sum
				sum = sum + x[i];
			}
		 }

		return sum;
	}

}
