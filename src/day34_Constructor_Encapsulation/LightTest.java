package day34_Constructor_Encapsulation;

public class LightTest {

	public static void main(String[] args) {
		
		System.out.println("Creating Light object no.1");
		
		Light l1=new Light();
		
		System.out.println("Creating Light object no.2");
		
		Light l2=new Light(250, true);
		
		System.out.println("Creating Light object no.3");
		
		Light l3=new Light(250, true,"X");

	}

}
