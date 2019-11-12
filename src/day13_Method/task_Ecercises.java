package day13_Method;

public class task_Ecercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateGreatest(5, 2, 3);
		calculateCelcius(32);
		pattern(5);
		calculateGrade(100, 100, 100);
	}

	// task 62
	public static void calculateGreatest(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater than " + num2 + " and " + num3);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is greater than " + num1 + " and " + num3);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is greater than " + num1 + " and " + num2);
		}

	}

	// task 63
	public static void calculateCelcius(int fehrenheit) {
		System.out.println(fehrenheit + " °F is equal to " + ((fehrenheit - 32) * 5 / 9) + " °C.");
	}
	// task 64

	public static void pattern(int num) {

		for (int i = 0; i <= num; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	// task 65

	public static void calculateGrade(int n1, int n2, int n3) {
		double average;
		average = (n1 + n2 + n3) / 3;

		if (average >= 90 && average <= 100) {
			System.out.println("Your grade is: A");
		} else if (average >= 80 && average <= 89) {
			System.out.println("Your grade is: B");
		} else if (average >= 70 && average <= 79) {
			System.out.println("Your grade is: C");
		} else if (average >= 60 && average <= 69) {
			System.out.println("Your grade is: D");
		} else if (average >= 0 && average <= 59) {
			System.out.println("Your grade is: F");
		}

	}

}
