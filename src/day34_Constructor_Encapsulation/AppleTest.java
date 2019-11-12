package day34_Constructor_Encapsulation;

public class AppleTest {

	public static void main(String[] args) {
		
		
		Apple a1=new Apple();
		System.out.println(a1.color);

	}

	// // this method pass object as a parameter ----> b1 is object, Apple is its reference type 
	public static void change(Apple b1) {
		b1.color="orange";
	}
}
