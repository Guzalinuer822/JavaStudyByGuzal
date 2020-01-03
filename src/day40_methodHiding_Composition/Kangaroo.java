package day40_methodHiding_Composition;

public class Kangaroo extends Marsupial {
	
	//this is hiding, not overriding
	public boolean isBiped() {
		return true;
	}

	public void getKangarooDiscription() {
		System.out.println("Kangaroo walks on the two leg: " + isBiped());
	}
}
