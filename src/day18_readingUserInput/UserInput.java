package day18_readingUserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a value:");
		byte b1=scan.nextByte();
		System.out.println("value is : " + b1);
	scan.close();	
	}

}
