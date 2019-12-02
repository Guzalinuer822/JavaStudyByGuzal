package day38_Inheritance_2_1;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog=new Dog("yorkie",1,1,8,20,2,4,1,20,"long Sily");
		
		// dog.eat();  // find Dog class and run the eat method
		              // if eat() does not exist in Dog class---
		             // check if there is any is-a relationship
		             // if yes---go to parent and look for eat();
		
	 //dog.run();   // find Dog class and run the eat method
                   // if run() does not exist in Dog class---
                   // check if there is any is-a relationship
                  // if yes---go to parent and look for run();
		
		
		
		
	dog.move(10);

	}

}
