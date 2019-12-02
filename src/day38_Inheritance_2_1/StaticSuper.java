package day38_Inheritance_2_1;

public class StaticSuper {
	
	public static int num;
	
	public static void m1() {
		System.out.println("StaticSuper.m1() is called");
	}
	
	public void m2() {
		System.out.println("StaticSuper.m2() is called");
		
		// this method is not static, so can not call with class name, have to call with object name
	}

}
