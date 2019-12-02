package day35_Encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		p1.name="Mike";
		p1.age=20;
		
		p1.print();
		
Person p2=new Person();
		
		p2.name="Smith";
		p2.age=-25;
		
		p2.print();
	}

}
