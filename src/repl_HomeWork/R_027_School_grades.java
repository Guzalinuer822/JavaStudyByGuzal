/*
Write the program that will calculate average grade.
Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;

-Create a Scanner object named scan.

Execution flow with example:
-Display prompt :"Welcome to the Grader!"
-Display prompt: "Please enter subject name number 1 and score for this subject"
Math
5.0
-Display prompt: "Please enter subject name number 2 and score for this subject"
Biology
4.2
-Display prompt: "Please enter subject name number 3 and score for this subject"
English
4.4
-Display prompt: "Please enter subject name number 4 and score for this subject"
Chemistry
4.8
-Display prompt: "Please enter subject name number 5 and score for this subject"
Music
3.4

-build summary variable by concatenating subject names and grades
calculate average score and define that value into average variable.

-Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
-Display prompt: "Your average score is: 4.36"
-Display prompt: "Thank you for using Grader!"
-Display prompt: "Goodbye!"

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_027_School_grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Grader!");

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter subject name number 1 and score for this subject");
		String subject1 = scan.nextLine();
		Double grade1 = scan.nextDouble();
		
		scan.nextLine();

		System.out.println("Please enter subject name number 2 and score for this subject");
		String subject2 = scan.nextLine();
		Double grade2 = scan.nextDouble();
		
		scan.nextLine();

		System.out.println("Please enter subject name number 3 and score for this subject");
		String subject3 = scan.nextLine();
		Double grade3 = scan.nextDouble();
		
		scan.nextLine();

		System.out.println("Please enter subject name number 4 and score for this subject");
		String subject4 = scan.nextLine();
		Double grade4 = scan.nextDouble();
		
		scan.nextLine();

		System.out.println("Please enter subject name number 5 and score for this subject");
		String subject5 = scan.nextLine();
		Double grade5 = scan.nextDouble();
		
		scan.nextLine();

		String summary = subject1 + " - " + grade1 + ", " + 
		subject2 + " - " + grade2 + ", " +
		subject3 + " - " + grade3 + ", " +
		subject4 + " - " + grade4 + ", " +
		subject5 + " - " + grade5;

		Double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

		System.out.println("Summary: " + summary);
		System.out.println("Your average score is: " + average);
		System.out.println("Thank you for using Grader!");
		System.out.println("Goodbye!");
		
		scan.close();

	}

}
