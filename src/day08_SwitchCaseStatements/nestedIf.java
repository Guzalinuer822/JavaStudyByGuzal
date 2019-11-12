package day08_SwitchCaseStatements;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isRushHour = true;
		int carType = 1;
		double price = 0.0;

		if (carType == 1) {
			if (isRushHour) {
				price = 30.0;
			} else {
				price = 5.0;
			}
		}

		else if (carType == 2) {
			if (isRushHour) {
				price = 55.30;
			} else {
				price = 15.99;
			}
		}
		System.out.println("Total cost: " + price);

		//
		int num1, num2, num3;
		num1 = 1500;
		num2 = 5562;
		num3 = 498625;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("num1 is greatest");
			} else {
				System.out.println("num1 is not greatest");
			}

		}

		if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("num2 is greatest");
			} else {
				System.out.println("num2 is not greatest");
			}

		}

		if (num3 > num1) {
			if (num3 > num1) {
				System.out.println("num3 is greatest");
			} else {
				System.out.println("num3 is not greatest");
			}

		}

		// ozzy

		int h1, h2, h3;
		h1 = 564;
		h2 = 523;
		h3 = 5641;

		if (h1 > h2 && h1 > h3) {
			System.out.println("h1 is greatest");
		} else {
			if (h2 > h3) {
				System.out.println("h2 is greatest");
			} else {
				System.out.println("h3 is greatest");
			}

		}

	}
}