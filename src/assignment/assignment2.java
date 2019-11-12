package assignment;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 1


		int pound, feet, inches;
		double mass, height, bmi;

		pound = 150;
		feet = 5;
		inches = 5;

		mass = pound / 2.2;

		height = ((feet * 12) + inches) * 0.0254;

		bmi = mass / (height * height);

		System.out.println("Your weight in pounds : " + pound);
		System.out.println("Your height in feet followed by a space then additional inches: " + feet + " " + inches);

		System.out.println("Your BMI is " + bmi);
		if (bmi < 18.50) {
			System.out.println("Your risk factory is: Underweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Your risk factory is: Normal Weight");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Your risk factory is: Overweight");
		} else if (bmi >= 30) {
			System.out.println("Your risk factory is: Obese");
		}

		// Question 2
		double basic_tax, rest;
		int income;
		income = 200_000_000;
		basic_tax = 150_000_000 * 0.25;

		rest = income - 150_000_000;

		System.out.println("Your Income: " + income);

		if (income <= 150_000_000) {
			System.out.println("The tax amount you have to pay : " + (income * 0.25));
		} else if (income <= 300_000_000) {
			System.out.println("The tax amount you have to pay : " + (basic_tax + rest * 0.3));
		} else if (income <= 600_000_000) {
			System.out.println("The tax amount you have to pay : " + (basic_tax + rest * 0.35));
		} else if (income <= 1_200_000_000) {
			System.out.println("The tax amount you have to pay : " + (basic_tax + rest * 0.4));
		} else if (income > 1_200_000_000) {
			System.out.println("The tax amount you have to pay : " + (basic_tax + rest * 0.5));
		}

		// Question 3

		int year;
		year = 1900;

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "   Leap year");
		} else {
			System.out.println(year + "   Not a Leap Year");
		}

		// Question 4
		int call, basic_bill;

		call = 185;

		basic_bill = 200;

		System.out.println("Your number of call is: " + call);
		if (call <= 100) {
			System.out.println("Telephone Bill: " + basic_bill);
		} else if (call > 100 && call <= 150) {
			call = call - 100;
			System.out.println("Telephone Bill: " + (basic_bill + 0.6 * call));
		} else if (call > 150 && call <= 200) {
			call = call - 150;
			System.out.println("Telephone Bill: " + (basic_bill + 0.6 * 50 + 0.5 * call));
		} else if (call > 200) {
			call = call - 200;
			System.out.println("Telephone Bill: " + (basic_bill + 0.6 * 50 + 0.5 * 5 + 0.4 * call));
		}
		
		
	}

}
