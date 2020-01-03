package day40_methodHiding_Composition;

public class Marsupial {
	
	/*
	public static boolean isBiped() {
		return false;
	}
*/
	
	public boolean isBiped() {
		return false;
	}
	
	
	public void getMarsupialDiscription() {
		System.out.println("Marsupial walks on the two leg: " + isBiped());
	}
}
