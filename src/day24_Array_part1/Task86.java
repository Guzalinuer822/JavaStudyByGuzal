package day24_Array_part1;

import java.util.Scanner;

public class Task86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Month: ");
		
		int num=scan.nextInt();
		
		String[] months = new String[12];

		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		System.out.println("The month name is <"+months[num]+">");
		
		
		
		System.out.println("-------------------------------------------------");
		
		
		for (int i=0; i<12;i++) {System.out.println("The month name is <"+months[i]+">");}
		
	}

}
