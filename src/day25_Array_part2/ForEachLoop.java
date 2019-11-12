package day25_Array_part2;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] products= {"Timberland","Shirt","Watch","Bag","Shoes"};
		
		double[] prices= {120.0,56.0,330,25,45.56};
		
		for (String prod: products) {System.out.println(prod);}
		
		for(double x:prices) {System.out.println(x);}
		
		// print products in reverse order
		
		for(int i=products.length-1; i>=0;i--) {System.out.println(products[i]);}
	}

}
