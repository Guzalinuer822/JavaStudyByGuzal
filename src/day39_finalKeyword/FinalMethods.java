package day39_finalKeyword;

public class FinalMethods {
	
	public void method1() {
		System.out.println("Method 1");
	}

	public static void staticMethod(String word) {
		
		System.out.println("Static Method");
		
	}
}

class Sub extends FinalMethods{
	
	
	@Override
	public void method1() {
		System.out.println("Method 1 in sub class");
	}
	
	//overload
	public void method1(int x) {}
	
	
	/*  this overloading , we don't care return type, 
	 * but this will give error
	 * 
	 * public int method1(int x){
	 * }
	 * 
	 * because i didn't write inside return keyword , i have to return int
	 * 
	 * public int method1(int x){
	 * 
	 * return x;    // have to return, have to write something
	 * }
	 * 
	 */
	
	public static void staticMethod(String word) {
		System.out.println("Static Method in sub class");
	}
}