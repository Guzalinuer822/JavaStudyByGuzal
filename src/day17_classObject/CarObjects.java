package day17_classObject;

public class CarObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW car1= new BMW();

BMW car2= new BMW();

System.out.println(car1.make);
System.out.println(car2.make);


// if we change make---from BMW to audi

car1.make="audi";

System.out.println(car1.make);


car1.model="m3";

car1.showPrice();

car2.model="x3";

car2.showPrice();

	}

}
