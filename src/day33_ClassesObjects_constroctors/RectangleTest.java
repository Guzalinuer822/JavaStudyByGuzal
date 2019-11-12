package day33_ClassesObjects_constroctors;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle(); 
		//what new keyword does? call the constructor 
		//which constructor?
		//constructor with one parameter which is int
		
		Rectangle R2 = new Rectangle(4.2, 3.7);
		Rectangle R3 = new Rectangle(1, 2);
		Rectangle R4 = new Rectangle(5.7, 1.2);
		
		R2.getArea();
		R3.getArea();
		R4.getArea();

	}
}



