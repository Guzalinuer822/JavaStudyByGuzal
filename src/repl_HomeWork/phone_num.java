package repl_HomeWork;

import java.util.Scanner;

public class phone_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program that asks user to input int values: areaCode and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ): 
Calling number (222)-3334444
 */
		
		Scanner scan=new Scanner(System.in);
		
		int areaCode=scan.nextInt();
		int localNumber=scan.nextInt();
		
		String phoneNumber="("+areaCode+")-"+localNumber;
		
		System.out.println("Calling number " + phoneNumber);
		scan.close();

	}

}
