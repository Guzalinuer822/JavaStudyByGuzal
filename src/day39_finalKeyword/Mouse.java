package day39_finalKeyword;

public class Mouse extends Rodent {
	
	
	protected int tailLength=8;
	
	public void getMouseDeails() {
		System.out.println("tail: "+ tailLength+ " parentTail: " + super.tailLength);
	}

}
