package day08_SwitchCaseStatements;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String weather = "sunny";

		switch (weather) {

		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other weather");

		}
		// task 36 calculator
		// Write a program that creates a calculator by using switch statements

		int num1 = 5;
		int num2 = 7;

		String operator = "+";

		switch (operator) {

		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);

			break;

		default:
			System.out.println("Invalid Operator");
		}

		// task 37
		// Write a program that lets user to endurable,dell,acer, laptop models
		// If it is apple show “Apple-no virus”
		// If it is dell show “Tough one”
		// If it is acer show“Not recommended”
		// Else “do not buy that one!”

		String laptop_model = "asus";

		switch (laptop_model) {

		case "apple":
			System.out.println("Apple-no virus");
			break;
		case "dell":
			System.out.println("Tough one");
			break;
		case "acer":
			System.out.println("not recommended");
			break;
		default:
			System.out.println("Do not buy that one!");

		}

		// task 38

		// Write a program to display days:
		// 1-Monday
		// 2-Tuesday
		// 3-Wednesday
		// 4-Thursday
		// 5-Friday
		// 6-Saturday

		int day = 5;

		switch (day) {

		case 1:
			System.out.println("1-Monday");
			break;
		case 2:
			System.out.println("2-Tuesday");
			break;
		case 3:
			System.out.println("3-Wednesday");
			break;
		case 4:
			System.out.println("4-Thursday");
			break;
		case 5:
			System.out.println("5-Friday");
			break;
		case 6:
			System.out.println("6-Saturday");
			break;
		default:
			System.out.println("Sunday, not a working day");

		}

		// task 39
		// Write a program to display traffic light colors using following logic:
		// if code (R/r)-->"Red"
		// if code (O/o)-->"Orange"
		// if code (G/g)-->"Green"

		char light = 'g';

		switch (light) {

		case 'R':
		case 'r':
			System.out.println("Red");
			break;

		case 'O':
		case 'o':
			System.out.println("Orange");
			break;
		case 'G':
		case 'g':
			System.out.println("Green");
			break;
		default:
			System.out.println("Error");
		}

	}

}
