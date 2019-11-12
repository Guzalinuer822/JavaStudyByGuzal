package day22_stringManipulation_lab;

public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));

	}

	public static String right2(String a) {
		String b = a.substring(a.length() - 2);
		String c = a.substring(0, a.length() - 2);
		String d = b + c;

		return d;
	}
}
