package day36_StaticClassMembers;

public class Student {
	
	String name;
	int age;
	int idNumber;
	static String school="Cubertek";  // if it is not static, it is instance variable so you can access only through object
// if it is instance not static , when you call ----> s1.school	
// but if it is static, we can call it through class name  ---> Student.school
	
public Student(String name, int age, int idNumber) {
		
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		
	}


public String toString() {
	return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
}


	

}
