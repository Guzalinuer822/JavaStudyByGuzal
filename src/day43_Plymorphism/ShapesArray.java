package day43_Plymorphism;

import java.util.ArrayList;

public class ShapesArray {

	public static void main(String[] args) {
		
		
		int[] numbers= new int[3];   // numbers---- hold 3 integer
		Shape[] shapes= new Shape[3];  //shapes---- hold 3 object
		
		
		shapes[0]= new Triangle();  // assigning first object ---- to index 0
		shapes[1]= new Square();   // assigning second object ---- to index 1
		shapes[2]= new Circle();   // assigning third object ---- to index 2
		
		
		
		for (Shape shape:shapes) {
			shape.draw();
		}
		
		
		
		ArrayList<Shape> shapeList=new ArrayList<>();
		
		shapeList.add(new Triangle());
		shapeList.add(new Square());
		shapeList.add(new Circle());
		
		

	}

}
