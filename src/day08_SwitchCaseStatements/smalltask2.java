package day08_SwitchCaseStatements;

public class smalltask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y = 10;
		int x = 15;
		if (x > 100) {
			y = 20;
		}

		else {
			y = 0;

		}
		System.out.println("y = " + y);

		//

		int x1 = 5;
		int y1 = 15;

		if (y1 == 100) {
			x1 = 1;
		}

		else {
			x1 = 0;
		}

		System.out.println("x1= " + x1);

		//
		int a, b, c;
		a = 5;
		b = 4;
		c = 9;

		if (a < 10) {
			b = 0;
			c = 1;
		}

		else {
			b = -99;
			c = 0;
		}

		System.out.println("a= " + a + " and b= " + b + " c= " + c);

		//
		int num1 = 15;
		int num2 = 56;

		if (num1 > num2) {
			System.out.println("num1 is greater");
		}

		else {
			System.out.println("num2 is greater");
		}

		//
		int h = 4;
		if (h % 2 == 0) {
			System.out.println("h is even number");
		}

		else {
			System.out.println("h is odd number");
		}

		//

		int k, i, j, sum;

		k = 50;
		i = 60;
		j = 120;

		sum = k + i + j;

		if (sum == 180) {
			System.out.println(" k, i and j is valid triangle angle");
		}

		else {
			System.out.println(" k, i and j is not valid triangle angle");
		}

		//
		int a1 = 65;
		int a2 = 45;
		int a3 = 70;

		if ((a1 + a2 + a3) == 180) {
			System.out.println("this is a triangle");
		} else {
			System.out.println("this not valid");
		}
		//
		

	}

}
