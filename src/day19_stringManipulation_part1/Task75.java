package day19_stringManipulation_part1;

import java.util.Scanner;

public class Task75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your first name:");
		String first_name=scan.next();
		System.out.print("Enter your last name: ");
		String last_name=scan.next();
		
				
		System.out.println("first name length: " + first_name.length());
		System.out.println("last name length: " + last_name.length());
		scan.close();

	}

}
