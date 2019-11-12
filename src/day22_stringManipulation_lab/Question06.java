package day22_stringManipulation_lab;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		withoutEnd("Hello");
		System.out.println(withoutEnd("Hello"));

	}

	public static String withoutEnd(String a) {

		String b = a.substring(1, a.length() - 1);
		return b;

	}

}
