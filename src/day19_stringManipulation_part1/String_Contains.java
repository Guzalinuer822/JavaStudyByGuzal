package day19_stringManipulation_part1;

public class String_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "test@gmail.com";
		System.out.println(email.contains("@"));

		String list = "potatoes, tomatoes, eggs, milk, bread, cereal, meat, apples";

		if (list.contains("apples")) {

			System.out.println("apples are in the list");
		} else {
			System.out.println("apples are not in the list");
		}

		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: " + hasEggs);

		boolean hasCucumbers = list.contains("cucumber");

		System.out.println("Contains cucumbers: " + hasCucumbers);

		email = "name@yahoo.com";

		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		} else if (email.contains("@gmail")) {
			System.out.println("Gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}

		String etsyTitle = "Car | Etsy";
		if (etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		} else {
			System.out.println("Pipe is not detected");
		}

	}
}
