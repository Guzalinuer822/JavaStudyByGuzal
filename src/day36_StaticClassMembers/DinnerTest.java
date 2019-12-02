package day36_StaticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dinner mom=new Dinner();
		
		Dinner kid=new Dinner();
		
		Dinner dad=new Dinner();
		
		System.out.println("Total slices: " + Dinner.pizzaSlice);
		
		mom.takeAslice();
		dad.takeAslice();
		
		System.out.println("Total slices: " + Dinner.pizzaSlice);
	}

}
