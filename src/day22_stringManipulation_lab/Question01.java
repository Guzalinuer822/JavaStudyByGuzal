package day22_stringManipulation_lab;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helloName("guzal");
		System.out.println(helloName("guzal"));
		
		
		// Ozzy
		
		 System.out.println(helloNameOzzy("Bob"));
   		System.out.println(helloNameOzzy("Alice"));
			System.out.println(helloNameOzzy("X"));
		
		
		
		
	}

	public static String helloName(String name) {
		String greeting = "hello " + name;
		return greeting;
	}
	

	public static String helloNameOzzy(String str) {
		
		return "Hello ".concat(str).concat("!");
	
	}
	
}



