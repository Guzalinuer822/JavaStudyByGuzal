package day20_stringManipulation_part2;

public class String_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Moscow is a capital of Russia";
		str=str.replace("moscow", "Baku").replace("russia", "Azerbaijan");
		
		System.out.println(str);
		
		String email="firstName_LastNane@gmail.com";
		
		String company = "capitalone";
		
		String oneEmail = email.replace("gmail", company);
		
		System.out.println(oneEmail);
	}

}
