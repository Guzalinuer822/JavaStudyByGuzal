package day38_Inheritance_2_2;

import day38_Inheritance_2_1.B;   // when inherit from B , have to import the package too

public class BTest extends B {

	public static void main(String[] args) {
		
		BTest obj=new BTest();  // from this BTest class creat an object
		
		obj.display();

	}

}
