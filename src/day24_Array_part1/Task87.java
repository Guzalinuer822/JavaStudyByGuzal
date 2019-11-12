package day24_Array_part1;

import java.util.Scanner;

public class Task87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter day number");

		int day = scan.nextInt();

		String[] days = new String[8];

		days[0] = "";
		days[1] = "Monday";
		days[2] = "Tuesday";
		days[3] = "Wednesday";
		days[4] = "Thursday";
		days[5] = "Friday";
		days[6] = "Saturday";
		days[7] = "Sunday";

		System.out.println("Today is " + days[day]);
		
		

	}

}
