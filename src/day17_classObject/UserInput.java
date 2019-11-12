package day17_classObject;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a byte value: ");
		byte b1=sc.nextByte();
		
		System.out.println("b1: " + b1);
		System.out.println(b1*4);
		System.out.println(b1%3);
		
		System.out.print("Enter a byte value: ");
		byte b2=sc.nextByte();
		System.out.println(b2);
		
		sc.close();
		
	}

}
