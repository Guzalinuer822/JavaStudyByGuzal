package day22_stringManipulation_lab;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		extraEnd("I am Java");
		System.out.println(extraEnd("I am Java"));

	}

	public static String extraEnd(String a) {

		if (a.length() < 2) {
			System.out.println("invalid input");
		}

		String b = a.substring(a.length() - 2);
		String out = b + b + b;
		return out;

	}

}
