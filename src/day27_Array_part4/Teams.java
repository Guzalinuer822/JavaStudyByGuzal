package day27_Array_part4;

public class Teams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] teams1=new String[2][4];
		
		String[][] teams= {{"Mike","Tonny","Smith","Evan" },{"David","Emmy","John","Ryan"}};
	
		teams[0][0]="Mike";
		teams[0][1]="Tonny";
		teams[0][2]="Smith";
		teams[0][3]="Evan";
		
		teams[1][0]="David";
		teams[1][1]="Emmy";
		teams[1][2]="John";
		teams[1][3]="Ryan";
		
		System.out.println("First player of first team: " + teams[0][0]);
		
		System.out.println("number of rows: " + teams.length);
		
		System.out.println("# People in first team: " + teams[0].length);
		System.out.println("# People in second team: " + teams[1].length);
		
		int[] []team= {{1,2,3,4},{5,6,7,8}};
	}

}
