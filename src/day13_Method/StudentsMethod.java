package day13_Method;

public class StudentsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayHello();
		code();
		study();
		System.out.println("hello from main method.");
		displayMessage();
		System.out.println("hello from main meethod again");
	}

	public static void sayHello() {
		System.out.println("Hello");

	}

	public static void code() {
		System.out.println("Student is studying.");
	}

	public static void study() {
		System.out.println("Student is studying Java.");
	}
	
	public static void displayMessage() {System.out.println("Hello from the other side");}

}