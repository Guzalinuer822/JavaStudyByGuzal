package day19_stringManipulation_part1;

public class Task77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emoji = ":)";

		if (emoji.length() != 2) // check if it does not equal to 2 chars
		{
			System.out.println("Invalid Emoji");
			return; // stop execution
		}

      // if code reaches this point, then emoji is 2 char
     // get first and second chars and assign to variables

		char first = emoji.charAt(0);
		char second = emoji.charAt(1);

		if (first == ':') {
			if (second == ')') {
				System.out.println("Smile");
			} else if (second == '(') {
				System.out.println("Sad");
			} else if (second == '/') {
				System.out.println("Upset");
			} else {
				System.out.println("Unknown Emoji");
			}

		} else if (first == ';') {
			if (second == ')') {
				System.out.println("Wink");
			} else if (second == '0') {
				System.out.println("Suprised");
			} else {
				System.out.println("Unknown Emoji");
			}

		}

	}

}
