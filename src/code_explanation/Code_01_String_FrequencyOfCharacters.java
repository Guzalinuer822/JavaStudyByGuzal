package code_explanation;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

public class Code_01_String_FrequencyOfCharacters {

	public static void main(String[] args) {

		System.out.println(FrequencyOfChars1("AAABBCDD"));
		
		System.out.println(FrequencyOfChars3("AAABBCDD"));
	}

	// solution 1:
	
	// first find the non-repeated string
	// use nested loop to check repeating times  
	// by comparing original string to non-repeated string

	public static String FrequencyOfChars1(String str) {

		String nonDup = "";

		for (int i = 0; i < str.length(); i++) {

			if (!nonDup.contains("" + str.charAt(i))) {

				nonDup += "" + str.charAt(i);
			}
		}

		String expectedResult = "";

		for (int j = 0; j < nonDup.length(); j++) {

			int count = 0;

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == nonDup.charAt(j)) {

					count++;}

			}

			expectedResult += nonDup.charAt(j) + "" + count;

		}

		return expectedResult;

	}

	
	// solution 2:
	
	// same as solution 1
	// but this time just with original string and use while loop and for loop
	// it will check the character frequency 
	// after checked one character romeve it from string and assin to new string
	// and check it new string ---character frequency

	public static String FrequencyOfChars2(String str) {

		String expectedResult = "";

		int j = 0;

		while (j < str.length()) {

			int count = 0;

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == str.charAt(j)) {

					count++;

				}

			}

			expectedResult += str.charAt(j) + "" + count;

			str = str.replace("" + str.charAt(j), "");   // don't have j++ because 
			                                            //it removes that character from string after counted

		}

		return expectedResult;

	}

	// Solution 3:
	
	// split the string and stored to array 
	// then convert to ArrayList ---then convert to string
	// list.toString() gives you a string representation of a list
	

	public static String FrequencyOfChars3(String str) {

		String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
		
	System.out.println(b);

		b = b.replace(", ", "").replace("[", "").replace("]", "");

		String result = "";
		int times = 0;

		for (int j = 0; j < b.length(); j++) {

			int count = 0;

			
			for (int i = 0; i < str.length(); i++) 

				if (str.substring(i, i + 1).equals("" + str.charAt(j))) 

					times++;
				
				
				result += b.substring(j, j + 1) + count;
				
			
		}

		return result;

	}

	// Solutions 4:

	public static String frequency(String str) {

		String nonDup = "", result = "";

		for (int i = 0; i < str.length(); i++) {

			if (!nonDup.contains("" + str.charAt(i))) {

				nonDup += "" + str.charAt(i);
			}
		}

		for (int i = 0; i < nonDup.length(); i++) {

			int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));

			result += "" + nonDup.charAt(i) + num;

		}

		return result;

	}
}
