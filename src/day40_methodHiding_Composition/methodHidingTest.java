package day40_methodHiding_Composition;

public class methodHidingTest {

	public static void main(String[] args) {
		
		Panda.eat();
	}

}

// Bear class
class Bear{
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze(){
		
		System.out.println("Bear is sneezing");
	}
	

	public void hibernate() {
		System.out.println("Bear is hibernating");
	}

}


// this Panda class inherited from Bear class
class Panda extends Bear{
	
	// this is hiding , because static
	public static void eat() {
		System.out.println("Panda is eating");
	}
	
	/*  this will complain , because parent has static , child has to be static as well
	public void sneeze() {
		System.out.println("Panda is sneezing");
	}
	
	*/
	
	// this is overriding
	@Override
	public void hibernate() {
		System.out.println();
	}
}