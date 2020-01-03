package repl_HomeWork;

/*
extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or conditions



 */
public class R_186_MethodsWithString12_extractNumberFromString {

	public static void main(String[] args) {

		System.out.println(extractNum("aa2aa3"));
		
		System.out.println(extractNum("aa!!%$#.10aa"));
	}

	public static String extractNum(String s) {

		char[] arr = s.toCharArray();

		String result = "";

		for (int i = 0; i < arr.length; i++) {

			if (Character.isDigit(arr[i])) {
				result = result + arr[i];
			}
		}

		return result;

	}
}
