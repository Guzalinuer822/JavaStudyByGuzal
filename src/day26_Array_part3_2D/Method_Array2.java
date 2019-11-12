package day26_Array_part3_2D;

import java.util.Scanner;

public class Method_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findCar(4, "honda")); // true
	}

	// createArray method --- will accept one parameter which is arraySize
	// user will enter some cars

	public static String[] createArray(int arraySize) {

		

		Scanner scan = new Scanner(System.in);

		String[] myArray = new String[arraySize];

		for (int i = 0; i < myArray.length; i++) {
			
			System.out.println("Enter some cars #"+(i+1));
			myArray[i] = scan.next();
		}

		return myArray;

	}

	// findCar method ---- will accept 2 parameters which 1st---int varaiable, 2nd--
	// toFindCar
	// if car is found----return true
	// if not found---- return false

	public static boolean findCar(int value, String toFindCar) {

		for (String car: createArray(value)) {

			if (car.equalsIgnoreCase(toFindCar)) {
				return true;
			}

		}

		return false;

	}

}
