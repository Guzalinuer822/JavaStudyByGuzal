package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.println("How many questions are on the final exam?");
		questions=scan.nextInt();
		
		System.out.println("How many questions did student miss?");
		missed=scan.nextInt();
		
		//the grade is C
		
		FinalExam studentA=new FinalExam(questions, missed);
		
		
		
		System.out.println("The grade is: " + studentA.getGrade());

	}

}
