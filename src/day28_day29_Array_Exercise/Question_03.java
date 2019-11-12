package day28_day29_Array_Exercise;

public class Question_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int[] y = { 7, 3 };

		System.out.println(commonEnd(x, y));

	}



	public static String commonEnd(int[] x, int[] y) {

		if (!(x.length <= 1)) {
			return "Array1 is not valid";
		}
		if (!(y.length <= 1)) {
			return "Array2 is not valid";
		}

		if (x[0] == y[0] || x[x.length - 1] == y[y.length - 1]) {
			return "true";
		} else {
			return "false";
		}

	}

	
	 public static boolean isSingleDigit (int x) {
		    if (x >= 0 && x < 10) {
		      return true;
		    } else {
		      return false;
		    }
		  }
}
