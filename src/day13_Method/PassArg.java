package day13_Method;

public class PassArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		disPlayValue(5, 10);
		disPlayValue(7, 6);

	}

	public static void disPlayValue(int num, double num2) {
		System.out.println("the value is " + num);
		System.out.println("the value is "+ num2);

	}

	public static void disPlayValue() {
		System.out.println("the value is ");
	}
	
	
}
