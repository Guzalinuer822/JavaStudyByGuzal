/*
Given a String array arr with the following elements
["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter "e" in them

You need to know how many element contain "e" and create array accordingly

Values in fewValues array need to be["zero", "one","three"]

Examples:
arr -> ["aa", "be", "lol", "lel", "oreo"] 
fewValues -> ["be",  "lel", "oreo"] 

arr -> ["e", "hey", "bye", "furey", "spoon"] 
fewValues ->["e", "hey", "bye", "furey"] 
 */

package repl_HomeWork;

import java.util.Arrays;

public class R_117_Arrays_Copy_Certain_values {

	public static void main(String[] args) {

		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(Arrays.toString(getWithE(numbers)));

		String[] arr = { "aa", "be", "lol", "lel", "oreo" };
		System.out.println(Arrays.toString(getWithE(arr)));

		String[] str = { "e", "hey", "bye", "furey" };
		System.out.println(Arrays.toString(getWithE(str)));

	}

	public static String[] getWithE(String[] arr) {

		// TODO : YOUR CODE GOES HERE ----------------------
		
		int elementE = 0; // to count how many element has "e"

		// write a loop to check "e" and count
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				elementE++;

			}
		}

		// decide fewValues array size from elementE and create new array
		String[] fewValues = new String[elementE];

		int j = 0; // this will be index of fewValues array

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].contains("e")) {
				fewValues[j++] = arr[i]; // when it has "e" it will assigned to fewVaules array

			}
		}

		// YOUR CODE ENDS HERE -----------------------

		return fewValues;
	}

}