package day22_stringManipulation_lab;

public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=comboString("Hello", "hi");
		System.out.println(s1);
		
		
		
		String s3=comboString("aaa", "b");
		System.out.println(s3);
		
		String s2=comboString("hi", "Hello");
		System.out.println(s2);
		
		
		
	}
	public static String comboString(String a, String b) {

		if (a.length() < b.length()) {

			String c = a + b + a;
			return c;
		}

		else {

			String c = b + a + b;
			return c;
		}
	}

	// oZZY
	
	public static String comboStringOzzy(String str1, String str2) {

		String str;
		if (str1.length() > str2.length()) {
			str = str2.concat(str1).concat(str2);
		} else {
			str = str1.concat(str2).concat(str1);
		}

		return str;
	}
	
	
}
