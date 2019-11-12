package day33_ClassesObjects_constroctors;

public class Student {
	
	String name;
	int age;
	String gender;
	int year;
	String course;
	String university;
	
	
	
	

	public Student (String name,int age,String gender,int year,String course,String university) {
		
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.year=year;
		this.course=course;
		this.university=university;
				
		
		
	}
	
	public void attendLecture() {
		System.out.println(name+" " +age);
		System.out.println(gender+" " + year +" " + course);
		System.out.println(university);
	}
	
	public void submitAssignment() {
		System.out.println(name +" is submitting assignment");
	}
	
	public void attendLab() {
		System.out.println(name+" is attending lab");
	}

}
