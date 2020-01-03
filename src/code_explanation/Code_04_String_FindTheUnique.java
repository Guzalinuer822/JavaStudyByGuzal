package code_explanation;

import java.util.Arrays;

import java.util.Collections;

/*
String -- Find the unique
Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

 */

public class Code_04_String_FindTheUnique {

	public static void main(String[] args) {

		System.out.println(unique("AAABBBCCCDEF")); // this method will small u

		System.out.println(Unique("AAABBBCCCDEF")); // this method with capital U

		System.out.println(uniqueExtent("AAABBBCCCDEF"));

	}

	// Solution 1:
	
	// split and store it to array.
	// nested loop to check every letter one by one in array
	// count the frquency, if it find the same letter, it will increase
	// find the only repeatd once, then it will be the unique one

	public static String unique(String str) {

		// it will receive string as a argument

		String[] arr = str.split(""); 

		String unique1 = ""; // to store unique character

		for (int j = 0; j < arr.length; j++) { 

			int num = 0; // it will check the letter how many times appear
							// reset the count for every new letter

			for (int i = 0; i < arr.length; i++) {

				if (arr[i].equals(arr[j]))

					num++; // if it find the same letter, it will increase

			}

			if (num == 1) // if num=1, it means: it is unique

				unique1 += arr[j]; // we assign this letter to unique1
									// then concatenate newly finded unique letter

		}

		return unique1; // return String unique1

	}

	// Solution 2:
	
	// split and store it to array
	// use for each loop to check 
	// use Collections.frequency(list, each):It counts the frequency of the specified
	// element in the list
	// to this we have to convert array to arraylist 
	// for this used Arrays.asList(): getting the list view of Array, it returns list
	// in this method whole code writed in ternary conditional operator
	// (condition) ? expression1 : expression2

	public static String Unique(String str) {

		String result = "";

		for (String each : str.split("")) {

			result += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";

			// so whole idea: is using the conditional operator

			// condition : (Collections.frequency(list, each) ==1
			// if this condition is true ---- assign each to result
			// flas ---- assign "" to result

		}

		return result; // return string result

	}

	
	
	/*******************************************************************************************/
	// this is extend version 
	public static String uniqueExtent(String str) {
		
		String result = "";

		String[] arr = str.split("");

		for (String each : arr) {

			int repeat = (Collections.frequency(Arrays.asList(arr), each));

			// Arrays.asList(): getting the list view of Array, it returns list
			// Collections.frequency(list, each):It counts the frequency of the specified
			// element in the list

			if (repeat == 1) {
				result += each;
			}

		}

		return result;

	}
}
