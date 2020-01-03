package repl_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by repeating its ArrayList values.  

For example, if the parameter is 
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
 */
public class R_199_MethodsWithArrayList12_repeatAll {

	public static void main(String[] args) {
		ArrayList<Boolean> booleans = new ArrayList<>(Arrays.asList(true, false, false));

		repeatAL(booleans);
	}
	// create your method below

	public static void repeatAL(ArrayList<Boolean> booleans) {

		int newSize = booleans.size();

		for (int i = 0; i < newSize; i++) {

			booleans.add(booleans.get(i));
		}

		System.out.println(booleans.toString());

	}
}
