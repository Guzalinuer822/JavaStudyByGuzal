package day22_stringManipulation_lab;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(left2("Hello"));

		System.out.println(left2Ozzy("Hello"));
		System.out.println(left2Ozzy("Java"));
		System.out.println(left2Ozzy("Hi"));

	}

	public static String left2(String a) {

		String b = a.substring(0, 2);
		String c = a.substring(2);
		String d = c + b;
		return d;

	}

	public static String left2Ozzy(String str) {

		return str.substring(2).concat(str.substring(0, 2));

	}

}
