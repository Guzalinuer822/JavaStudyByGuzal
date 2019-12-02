package day35_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee("Mark Jones",39119);
		Employee e3=new Employee("Tedd Britt", 81775, "Sales", "Sales Person");
		
		System.out.println(e1.getName()+ " / "+e1.getIdNumber() + " / "+ 
		e1.getDepartment()+" / "+e1.getPosition());
		
		System.out.println(e2.getName()+ " / "+e2.getIdNumber() + " / "+ 
				e2.getDepartment()+" / "+e2.getPosition());
		
		System.out.println(e3.getName()+ " / "+e3.getIdNumber() + " / "+ 
				e3.getDepartment()+" / "+e3.getPosition());

		
		e1.setName("Mike Smith");
		e1.setIdNumber(47889);
		e1.setDepartment("Accounting");
		e1.setPosition("vp");
		
		System.out.println(e1.getName()+ " / "+e1.getIdNumber() + " / "+ 
				e1.getDepartment()+" / "+e1.getPosition());
		
		e2.setDepartment("Accounting");
		e2.setPosition("vp");
		
		System.out.println(e2.getName()+ " / "+e2.getIdNumber() + " / "+ 
				e2.getDepartment()+" / "+e2.getPosition());
		
	}
	
	

}
