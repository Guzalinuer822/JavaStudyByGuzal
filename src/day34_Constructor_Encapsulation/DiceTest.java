package day34_Constructor_Encapsulation;

public class DiceTest {

	public static void main(String[] args) {
		
		final int Six_sides=6;
		final int Twenty_sides=20;
		
		Dice sixDice=new Dice(Six_sides);
		
		Dice twentyDice=new Dice(Twenty_sides);
		
		rollDice(sixDice);
		rollDice(twentyDice);
	
			
	}
	
	
	// this method pass object as a parameter ---->d is object, Dice is its reference type 
	public static void rollDice(Dice d){
		
		System.out.println("Rolling a "+ d.getsides()+" sided dice.");
		
		d.roll();
		
		System.out.println("The dice's value: " + d.getValue());
	}
	
}
