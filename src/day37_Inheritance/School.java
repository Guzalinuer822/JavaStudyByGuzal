package day37_Inheritance;

public class School {
	
	public static void main(String[] args) {
		
		
		
		Person person=new Person();
		Student student=new Student();
		
		// Person is a super class
		person.name="Mike";
		person.age=35;
		person.gender='M';
		
		// Student is sub-class , is inherited from Person class
		student.name="Smith";
		student.age=30;
		student.gender='M';
		
		person.eat("Steak");
		student.eat("Pizza");
		
		student.code("Java");
		// person.code("Java");  this will give error, because person don't have access to student's method
		
		
		
	}
	
	
	

}
