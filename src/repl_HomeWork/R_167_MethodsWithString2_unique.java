package repl_HomeWork;

/*
uniqueChars is a method that you will code now, should be able to 
accept any string in the world and return unique characters from 
the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
 */
public class R_167_MethodsWithString2_unique {

	public static void main(String[] args) {

		// test your code
		System.out.println(uniqueChars("wooden-spoon"));
		System.out.println(uniqueChars("mama"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below

		String nonDuplicate = "";

		for (int i = 0; i < str.length(); i++) {

			if (!nonDuplicate.contains("" + str.charAt(i))) {

				nonDuplicate += "" + str.charAt(i);
			}
		}

		return nonDuplicate;

	}
}
