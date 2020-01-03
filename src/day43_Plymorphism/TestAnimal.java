package day43_Plymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal a= new Animal();
		
		Animal b= new Dog();
		
		Animal c= new Bird();
		
		Animal d= new Dog();
		Animal d= new Bird();

	}

}


class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}