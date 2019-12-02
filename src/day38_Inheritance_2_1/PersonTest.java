package day38_Inheritance_2_1;

public class PersonTest {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.display();
		

	}

}

class Person{
	
	public void message() {
		System.out.println("This is Person class");
	}
}

class Student extends Person{
	
	@Override
	public void message() {
		System.out.println("This is Student class");
	}
	
	public void display() {
		message();
	}
}

