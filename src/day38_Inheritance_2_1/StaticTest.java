package day38_Inheritance_2_1;

public class StaticTest {

	public static void main(String[] args) {
	
		StaticSub obj=new StaticSub();
		
		obj.num=5;
		obj.print();
		
		StaticSuper.num=10;
		obj.print();
		
		System.out.println(StaticSub.num);
		
		// Staticsub.m2();   this m2() method is not static, so can not call with class name, have to call with object name
		// obj.m2();  this can be called;
		
	}

}
