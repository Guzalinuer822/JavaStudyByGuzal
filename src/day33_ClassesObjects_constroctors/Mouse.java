package day33_ClassesObjects_constroctors;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	// 1
	public Mouse (int weight) {
		this(weight,16);
		
		System.out.println("Hello, do you like Java?");
	}
	
	// 2
	public Mouse(int weight,int numTeeth) {
		this(weight,numTeeth,6);
		System.out.println("Hello, who I am?");
	}
	
	// 3
	public Mouse(int weight, int numTeeth, int numWhiskers) {
		
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		
		System.out.println("I love constructors !");
	}
	
	public void print() {
		
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
		
	}
	

}
