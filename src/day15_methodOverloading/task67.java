package day15_methodOverloading;

public class task67 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		if (lastDigit(7, 17)) {
			System.out.println("They have the same last digit.");
		} else {
			System.out.println("They don't have the same last digit.");
		}
	}

	public static boolean lastDigit(int num1, int num2) {
		if ((num1 % 10) == (num2 % 10)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
