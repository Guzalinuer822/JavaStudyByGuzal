package assignment;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1
		/* Write a program to convert gallons into Liters and display it. */
		
		double gallon, liter;
		gallon = 3;
		liter = 3.785 * gallon;
		
		System.out.println( gallon+ " gallon (US) is equal to " + liter + " L ");
		
		// Question 2
		/* Declare a variable MyFruit and assign your favorite fruit into it and display as follows:

         “My Fav Fruit is My Fruit” */
		
		String MyFruit = "Banana";
		
		System.out.println("My Fav Fruit is " + MyFruit + ".");
		
		// Question 3
		/* Write a program - > Declare variables for your name and birth year, and program will display:

         " Hello Ozzy ! Based on your input, your age is 15 :) " */
		
		String name = "Guzal";
		int age,birth_year;
		birth_year = 1987;
		age = 2019 - birth_year;
		
		System.out.println("Hello " + name + "! Based on your input, your age is " + age + " :)");
		
		// Question 4
		/* Write a Java program that displays the area of a rectangle with a width of 4.5 and a height
		 *  of 7.9 using the following formula:
        area = width * height */
		
		double width, height, area;
		width = 4.5;
		height = 7.9;
		area = width * height;
		
		System.out.println(" The area of rectangle with width " + width + " and height " + height + " is " + area + ".");
		
		// Question 5
		/* Declare 2 variables (Num1, Num2)

           Swap values between Num1 and Num2

           Display new values of Num1 and Num2 */
		
		double num1, num2;
		num1 = 5;
		num2 = 7;
		
		System.out.println("Before, num1 is " + num1 + ", num2 is " + num2 + ".");
		
		double a;
		a = num1;
		num1 = num2;
		num2 = a;
		
		System.out.println("After swap, num1 is " + num1 + ", num2 is " + num2 +".");
		
		
	}

}
