package day13_Method;

public class PassMultipleArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age(2019,1999);
	}

	public static void age(int current_year,int birth_year) {
		System.out.println("age: " + (current_year - birth_year));
	}

	public static void calculator(int num1, int num2, String operator) {

		switch (operator) {

		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}
	}

	public static void showSum(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void pay(int hour, int hourly_pay) {

		System.out.println("your pay: " + hour * hourly_pay);
	}

}
