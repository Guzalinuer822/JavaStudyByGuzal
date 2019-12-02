package day38_Inheritance_2_1;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car  c1=new Car();
		c1.display();

	}

	
}



class Vehicle{
	
	int maxSpeed=120;
	
	
}

class Car extends Vehicle{
	
	int maxSpeed=180;
	
	void display() {
		System.out.println("Maximum speed: "+ super.maxSpeed);
		// if super.maxSpeed);----it will go parent and print 120 not 180
		
		// System.out.println("Maximum speed: "+ maxSpeed);
		// this will print from child class, so it will print 180
	}
}