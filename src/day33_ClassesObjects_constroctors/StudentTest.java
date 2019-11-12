package day33_ClassesObjects_constroctors;

public class StudentTest {

	public static void main(String[] args) {
		
		Student A=new Student("Mike", 17, "M", 2017, "Java", "Cybertek University");
		
		Student B=new Student("kalbi", 17, "F", 2015, "Javascript", "Cybertek University");
		
		A.attendLecture();
		A.attendLab();
		A.submitAssignment();
		
		B.attendLecture();
		B.attendLab();
		B.submitAssignment();

	}

}
