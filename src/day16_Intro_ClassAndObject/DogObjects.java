package day16_Intro_ClassAndObject;

public class DogObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		

		
		dog1.age=3;
		dog1.color="white";
		dog1.breed="Maltese";
		dog1.name="Pashgul";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.name);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		dog2.age= 2;
		dog2.color= "grey";
		dog2.name= "Pasha";
		
		System.out.println(dog2.name);
		System.out.println(dog2.color);
		
		dog2.hungry();
		dog2.barking();
	}

}
