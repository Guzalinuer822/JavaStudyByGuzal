package repl_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, 
and a String called targetWord

This method should go through every element of wordList and 
remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]

 */
public class R_188_MethodsWithArrayList9_removeAll {

	public static void main(String[] args) {

		// convert array to arraylist and store it to arraylist
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "hey", "hi", "yo"));

		removeAll(wordList, "hi");
		
		//System.out.println(removeAll(wordList, "hi"));

		

	}

	// create your method below

	public static void removeAll(ArrayList<String> wordList, String targetWord) {

		for (int i = 0; i < wordList.size(); i++) {

			if (wordList.get(i).equals(targetWord)) {

				wordList.remove(i);
			}
		}
		
		System.out.println(wordList.toString());
	}

}
