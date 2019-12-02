package day35_Encapsulation;

public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;

	
	// first constructor with no-argument
	public Employee() {
		this.name="";
		this.idNumber=0;
		this.department="";
		this.position="";
	}
	
	// second constructor with two argument
	public Employee(String name,int idNumber) {
		this.name=name;
		this.idNumber=idNumber;
		this.department="";
		this.position="";
		
	}
	
	// third constructor with all four argument
	public Employee(String name,int idNumber,String department,String position) {
		
		this.name=name;
		this.idNumber=idNumber;
		this.department=department;
		this.position=position;
			
		
	}

	
	// for have access to private variable ,have to create getter and setter method
	// because it is encapsulated
	
	
	
	public void setName(String name) {this.name=name;}
	public String getName() {return name;}

	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	public String getDepartment() {
		return department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
