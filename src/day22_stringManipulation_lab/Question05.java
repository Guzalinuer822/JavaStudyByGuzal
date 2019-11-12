package day22_stringManipulation_lab;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstHalf("abcdef");
		System.out.println(firstHalf("abcdef"));
	}

	public static String firstHalf(String a) {

		String b = a.substring(0, a.length() / 2);

		return b;
	}
}
