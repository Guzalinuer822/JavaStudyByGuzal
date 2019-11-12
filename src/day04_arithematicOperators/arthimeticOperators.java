package day04_arithematicOperators;

public class arthimeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// addition  + 
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs + 2);
		
		int moreChairs = chairs +5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		// subtraction  -
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance - transaction);
		balance = balance - transaction;
		System.out.println(balance);
		
		// exercise
		int linesOfCode = 50;
		System.out.println("Lines of code " + linesOfCode);
		
		System.out.println(linesOfCode - 2);
		
		linesOfCode = linesOfCode -2;
		System.out.println("Lines of code " + linesOfCode);
		
		//multiplication *
		System.out.println(22*2);
		
		int classes =5;
		System.out.println(linesOfCode * classes);
		int totallinesOfCode = linesOfCode * classes;
		System.out.println("Total lines of code = " + totallinesOfCode);
		
		// division /
		System.out.println(10/2);

		System.out.println(60/3);
		
		// remainder %
		System.out.println(10%2);
		System.out.println(9%2);
		

	}

}
