package day36_StaticClassMembers;

import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		System.out.println(sqrt(16)); // because import , don't need to use class name to call method.
		
		method(); // now can call this static method directly , don't need to use class names to call; because we import static 

	}

	public static void method() {
		System.out.println("test");
	}
}
