/*
Automated tests are the future.

in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
a
a is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
b
b is correct

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
c
c is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
z
z is not a valid answer
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_040_QuizQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("what is the farthest planet in the solar system:");
		System.out.println("a)venus");
		System.out.println("b)pluto");
		System.out.println("c)neptune");

		String a = s.nextLine();

		// your code here
		
		switch (a) {

		case "a":
			System.out.println(a + " is wrong");
			break;
		case "b":
			System.out.println(a + " is correct");
			break;
		case "c":
			System.out.println(a + " is wrong");
			break;

		default:
			System.out.println(a + " is not a valid answer");
		}

		s.close();
	}

}
