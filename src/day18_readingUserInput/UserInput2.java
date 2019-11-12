package day18_readingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Provide a sentence and I will repeat it: ");

// String str=sc.next();   // this one only print the first word , because of space.

String str2=sc.nextLine();
System.out.println(str2);
sc.close();
	}

}
