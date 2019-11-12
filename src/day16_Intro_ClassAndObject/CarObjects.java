package day16_Intro_ClassAndObject;

public class CarObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1= new Car();
		
		car1.printCarInfo();
		
		
		car1.showCurrentSpeed(70);
		
		car1.drive();
		
		System.out.println("before: " + car1.currentSpeed);
		
		car1.accelerate(20);
		
		System.out.println("after: " + car1.currentSpeed);

	}

}
