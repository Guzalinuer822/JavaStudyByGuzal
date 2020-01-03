package day43_Plymorphism;

public class TestMethod {

	public static void main(String[] args) {
		
		ChildA chA=new ChildA();
		

		ChildB chB=new ChildB();  // normal object
		
		Parent p1=new ChildA();   // polymorphism
		p1.m1();
		
		MyInterface int1=new ChildA();  // polymorphism
	}

}


class Parent{
	public void m1() {}
}

interface MyInterface{
	public abstract void m2();
}

class ChildA extends Parent implements MyInterface{
	public void m2() {};
	public void m3() {};
}

class ChildB extends Parent implements MyInterface{
	public void m2() {}
	public void m4() {}
}