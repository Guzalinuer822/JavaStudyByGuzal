package day36_StaticClassMembers;

public class StaticMethods {
	
	String name="Apple";

	public static void show1() {
		System.out.println("Hi");
		
		show2();  // u can not call instance method from static method
		show4(); // u can call static method from static method.
		
		System.out.println(name); // u can not call instance method or variable from static
		
		// if you change to ---> static String name="Apple";  then System.out.println(name);
		// now it will be ok ;
	}

	public void show2() {  // this is instance method
		System.out.println("Hi");
		show1(); // u can call static method from instance method
	}

	public void show3() {
		System.out.println("Hi");
		show2(); // u can call instance method from instance method
		show1(); // u can call static from instance
	}

	public static void show4() {
		System.out.println("Hi");
	}

}
