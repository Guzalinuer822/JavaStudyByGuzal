package day28_day29_Array_Exercise;

public class Question_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {2,5};
		int[] y= {4,3};
		int[] z= {4,5};
		
		System.out.println(contain2Or3(x));
		System.out.println(contain2Or3(y));
		System.out.println(contain2Or3(z));
	}

	public static String contain2Or3(int[] x) {

		for (int i = 0; i < x.length; i++) {

			if (x[i] == 2 || x[i] == 3) {
				return "true";
			} 
		}
		
		return "false";
	}
}
