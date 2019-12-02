package day36_StaticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		double result=Calculator.plus(55, 7); // static way
		System.out.println(result);
		
		Calculator c=new Calculator();
		
		System.out.println(c.plus(55, 7));
		
		int i=Integer.parseInt("33");
		
		System.out.println(Character.isDigit('5'));

	}

}
