package day08_SwitchCaseStatements;

public class ifElseElseifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 9;

		if (day == 1) {
			System.out.println("monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else {
			System.out.println("Domenica");
		}

		//

		int age = 10;

		if (age < 2 || age > 18) {
			System.out.println("ineligible");
		} else if (age == 2) {
			System.out.println("toddler");
		} else if (age >= 3 && age <= 5) {
			System.out.println("early childhood");
		} else if (age == 6 || age == 7) {
			System.out.println("young reader");
		} else if (age >= 8 && age <= 10) {
			System.out.println("elementary");
		} else if (age == 11 || age == 12) {
			System.out.println("middle");
		} else if (age == 13) {
			System.out.println("impoosible");
		} else if (age >= 14 && age <= 16) {
			System.out.println("high school");
		} else if (age == 17 || age == 18) {
			System.out.println("scholar");
		} else {
			System.out.println("not valid");
		}

		//

		int num1, num2, num3;
		num1 = 56;
		num2 = 35;
		num3 = 58;
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is the lrgest one");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is the lrgest one");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("num3 is the largest one");
		}

		else {
			System.out.println("numbers are equal");
		}

		//

		int mark = 95;

		if (mark < 60) {
			System.out.println("Fail");
		} else if (mark >= 60 && mark < 90) {
			System.out.println("Pass");
		} else if (mark >= 90) {
			System.out.println("Passed with Distinction");
		} else {
			System.out.println("not valid");
		}

		//
		int math = 100;
		int chemistry = 95;
		int english = 89;
		double average;

		average = (math + chemistry + english) / 3;

		if (average >= 90 && average <=100) {
			System.out.println("A");
		} else if (average >= 80 && average <= 89) {
			System.out.println("B");
		} else if (average >= 70 && average <= 79) {
			System.out.println("C");
		} else if (average >= 60 && average <= 69) {
			System.out.println("D");
		} else if (average >= 0 && average <= 59) {
			System.out.println("F");
		} else {
			System.out.println("not valid");
		}

	}

}
