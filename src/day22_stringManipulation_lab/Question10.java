package day22_stringManipulation_lab;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(frontAgain("edited"));
	}

	public static boolean frontAgain(String a) {

		String b = a.substring(0, 2);
		String c = a.substring(a.length() - 2);

		return b.equals(c);

	}
}
