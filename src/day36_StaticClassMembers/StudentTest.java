package day36_StaticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student("Mike",30,1234);
		
		Student s2=new Student("Ozzy",30,1205);
		
		Student s3=new Student("Guzal",30,1285);
		
		s1.school="Cybertek2";
		
		System.out.println(s1.toString());
		
		System.out.println(s2.toString());
		
		System.out.println(s3.toString());
		
		// can call static through class name
		
		System.out.println(s1.school);
		
		// or
		
		System.out.println(Student.school);
		

	}

}
