package day20_stringManipulation_part2;

public class String_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));

		System.out.println(word1.indexOf("java"));

		String url = "www.okta.com";
		int i = url.indexOf(".");

		System.out.println("position of . " + i);

		System.out.println(url.charAt(i + 1));

        // find position of "-" and check if 
		String title = "Java - Google Search";

		int dash = title.indexOf("-");

		System.out.println("position of . " + dash);

		System.out.println(title.charAt(dash - 1)); // it will print space, because "-" right and left side is space
		System.out.println(title.charAt(dash + 1)); // it will print space, because "-" right and left side is space

		System.out.println("-------"); // just for showing the space has printed above.

		
		
		
        // //check if c++ is in the word2
		
		String country = "United States of America";

		int states = country.indexOf("States");
		System.out.println(states);

		String word2 = "java, c++, python, tomcat, eclipse";

		boolean hasC = word2.contains("c++");

		int k = word2.indexOf("c++");

		System.out.println(hasC + ", in position " + k);
		
		
		// above question solved in two ways by Ozzy.

		// Ozzy   contains

		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}

       // Ozzy  index

		if (word2.indexOf("c++") > -1) {         // -1 ---cause it is the last index, if it is greater than -1, it mean ---exist.
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
	}

}
