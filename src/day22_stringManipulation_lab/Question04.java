package day22_stringManipulation_lab;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		firstTwo("ab");

		System.out.println(firstTwo("ab"));
	}

	public static String firstTwo(String a) {

		if (a.length() < 2) {
			return a;
		}
		
		else if(a.isEmpty()) {return "" ;}
		else {
		String b = a.substring(0, 2);
		return b;}
	}
}