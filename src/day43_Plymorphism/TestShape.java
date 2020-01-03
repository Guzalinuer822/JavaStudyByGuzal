package day43_Plymorphism;

public class TestShape {

	public static void main(String[] args) {
		
		// this will run from Shappe ---parent class
		Shape shape1=new Shape();
		shape1.draw();
		
		
		// this will run from Circle 
		// because it is overriden ---it will called from child ----Circle
		// if it is not overriden ---it will called from parent ---Shape
		Shape shape2=new Circle();
		shape2.draw();
		

	}

}
