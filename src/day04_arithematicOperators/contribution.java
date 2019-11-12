package day04_arithematicOperators;

public class contribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this program calculates the amount of pay that will be 
		// contributed to a retirement plan if 5 %, 8% or 10% of monthly pay is withheld.
		
		double salary = 6000;
		double retirementRate1  = 0.05;
		double monthlyPay;
		
		monthlyPay = salary * retirementRate1;
		
		
		System.out.println(" The monthly pay : " + monthlyPay);
		
		double retirementRate2 = 0.08;
		monthlyPay = salary * retirementRate2;
		System.out.println(" The monthly pay : " + monthlyPay);
		
		double retirementRate3  = 0.1;
		monthlyPay = salary * retirementRate3;
		System.out.println(" The monthly pay : " + monthlyPay);
		
		// mine is tooooooooo much 
		
		
		
		// Ozzy 
		
		double monthly_Pay=6000;
		double contribution;
		
		//Calculate and display 5% contribution
		contribution=monthly_Pay*0.05;
		System.out.println("5 percent is $ " + contribution + " per month.");
		
		//Calculate and display 8% contribution
		contribution=monthly_Pay*0.08;
		System.out.println("8 percent is $ " + contribution + " per month.");
		
		//Calculate and display 10% contribution
		contribution=monthly_Pay*0.10;
		System.out.println("10 percent is $ " + contribution + " per month.");
		
		System.out.println(6-3*2+7-1);
		
		int num1 = 46;
		int num2 = 90;
		int sum;
		
		sum = num1 + num2;
		
		System.out.println(num1 + " + " +  num2 + " = "  + sum);
		
		
		// task 14
		
		double Fahreheit;
		double Celcuis = 70.2;
		
		Fahreheit = 9 * Celcuis / 5 + 32;
				
		System.out.println(Celcuis + " is equal to " + Fahreheit + " Fahreheit ");
		
		// task 15
		
		double mile, km;
		mile = 85;
		
		km = 1.609344 * mile;
				
		System.out.println(mile + " mile is equal to " + km + " km ");
		
		//task 16
		
		final double PI = 3.14;
		
		double radius, perimeter,area;
		radius = 5.5;
		
		
		perimeter = 2 * radius * PI;
		area = radius * radius * PI;
				
		System.out.println(" Area of the circle is " + area);
		System.out.println(" Perimeter of the circle is " + perimeter);
		
		//
		
		double number1, number2, number3, average;
		number1=5;
		number2=5;
		number3=5;
		
		average = (number1 + number2 + number3)/3;
				
		System.out.println( " the average number is:  " + average);
		
		
		
		
		
		
				
		
		
		

	}

}
