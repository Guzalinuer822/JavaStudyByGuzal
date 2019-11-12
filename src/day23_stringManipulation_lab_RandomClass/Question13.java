package day23_stringManipulation_lab_RandomClass;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "The";
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			result = result + str.substring(i, i + 1).concat(str.substring(i, i + 1));
		}

		System.out.println(result);
	}

}
