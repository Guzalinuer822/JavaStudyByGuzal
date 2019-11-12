package day30_wrapperClass;

public class Task_97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";

		System.out.println(filterString(s));
	}

	public static String filterString(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {

			// if the character is letter or character i should keep it
			// so can use .isLetter() or .isAlphabetic() method to check character

			// I want to keep space as well , so when the character is space i should keep
			// it too.
			// so i use s.charAt(i)== ' ' ---> to keep space character

			if (Character.isLetter(s.charAt(i)) || s.charAt(i) == ' ') {
				result = result + s.charAt(i);
			}
		}

		return result;
	}

}
