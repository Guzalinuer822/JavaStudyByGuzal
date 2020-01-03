package day43_Plymorphism;

public class Mac extends AppleDevice{
	
	@Override
	public void use() {System.out.println("MAC | Code | Play");}
	
	
	// this is not overriden
	public void code() {System.out.println("Mac is coding");}

}
