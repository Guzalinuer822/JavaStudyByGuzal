package day22_stringManipulation_lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "eclipse";
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));

		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));
		
		// Mr. = > married man
		// Mrs. = > married woman
		// Ms. = > some woman
		// Dr. => Doctor man or woman
		// No title  => Unknown status
		
		String person="Mr. kali";
		
		if(person.startsWith("Mr.")) {System.out.println("married man");}
		
		
		if(person.startsWith("Mrs.")) {System.out.println("married woman");}
		else if(person.startsWith("Ms.")) {System.out.println("some woman");}
		else if(person.startsWith("Dr.")) {System.out.println("Doctor man or woman");}
		else if(person.startsWith(" ")) {System.out.println("Unknown status");}

	}

}
