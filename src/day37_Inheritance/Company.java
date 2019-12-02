package day37_Inheritance;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		emp1.name="Tom";
		emp1.age=27;
		emp1.gender='M';
		emp1.jobTitle="Teacher";
		
		emp1.work();
		System.out.println(emp1.toString());
		
		emp1.eat("Salad");
		// emp1.attendClass("java"); it will give error, emp1 don't have access to attendClass() method
		

	}

}
