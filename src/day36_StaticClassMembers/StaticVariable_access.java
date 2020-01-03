package day36_StaticClassMembers;

public class StaticVariable_access {
	
	/*
	 * static variable first , then static block , then instance block , then constructor 
	 */
	
	
	int a=10;   // this is instance variable
	static int b=30;
	
	
	
	// this is instance method
	void m1() {
		
		System.out.println("we can call instance variable from instance area "
				+ "without any object reference variable");
		
		System.out.println(a);
		
		System.out.println("we  can call the static variable directly from instance area");
		System.out.println(b);
		
	}

	
	static void m2() {
		
		// this is static area
		
		// we  can not call the instance members from static area
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
