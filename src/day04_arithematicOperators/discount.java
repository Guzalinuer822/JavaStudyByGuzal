package day04_arithematicOperators;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this program calculate the sale price of an
		// item that is regularly priced at $59, with a 20 % discount on it.
		
		int regularPrice = 59;
		double discount;
		double salesPrice;
		
		discount = regularPrice * 0.2;
		salesPrice = regularPrice - discount;
		
		System.out.println(" Regular price : $ " + regularPrice);
		System.out.println(" Discount amount : $ " + discount);
		System.out.println( " Sale price : $ " + salesPrice);
		
		

	}

}
