package day30_wrapperClass;


public class Parsing_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numberAsString="2018";     // String
		System.out.println(numberAsString);
		
		
		int number=Integer.parseInt(numberAsString);   // changing to integer
		System.out.println(number);
		
		numberAsString = numberAsString+1;  // Concatenation
		number=number+1;                   // Arithmetic operation
		
		System.out.println(numberAsString);
		System.out.println(number);
		
		
		// change integer to string    // .valueOf()
		
		int i=10;
		String s=String.valueOf(i);
		System.out.println(s);     // it will return string "10"
		
		
		// another way to change integer to string   // .toString()
		String s2=Integer.toString(i);
		System.out.println(s2);   // it will return "10"
		
		
		
		
		
		
		
		
		
	}

}
