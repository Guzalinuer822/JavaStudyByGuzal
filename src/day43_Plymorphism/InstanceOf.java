package day43_Plymorphism;

public class InstanceOf {

	public static void main(String[] args) {
		
		
		Shape shape= new Triangle();
		
		if (shape instanceof Triangle) {
			
			System.out.println("Triangle");
			
		}
		
		else if (shape instanceof Circle) {
			
			System.out.println("Circle");
			
		}

		else if (shape instanceof Square) {
	
	System.out.println("Square");
	
}

	}

}
