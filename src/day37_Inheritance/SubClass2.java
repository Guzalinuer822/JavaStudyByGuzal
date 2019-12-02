package day37_Inheritance;

public class SubClass2 extends SuperClass2{
	
public SubClass2() {
		super(10);  // go to parent and call one argument constructor
		
		// super() ----means it want to invoke constructor from parent class
		
		
		// if you don't put super();--- with no-argument / one or more argument 
		//Java will put invisible super(), or you can put your specific constructor
		// normally if you don't put , Java will put it for you by default, it is putting for you ----super();
		
		
		System.out.println("This is subclass constructor");
	}

}
