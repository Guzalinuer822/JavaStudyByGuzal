package repl_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, 
and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all 
the words (in order) from wordList1, then add all the words 
(in order) from wordList2.  In other words, it is combining 
all the elements from the two parameters.
 */
public class R_187_MethodsWithArrayList8_CombineAll {

	public static void main(String[] args) {

		// convert array to arraylist and store it to arraylist
		ArrayList<String> wordList1 = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

		// second way, 
		// create arraylist and add element
		ArrayList<String> wordList2 = new ArrayList<String>();

		wordList2.add("abc");

		wordList2.add("def");

		// test the method

		System.out.println(combineAL(wordList1, wordList2).toString());

	}
	// create your method below

	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {

		ArrayList<String> wordListAll = new ArrayList<String>();

		for (int i = 0; i < wordList1.size(); i++) {

			wordListAll.add(wordList1.get(i));
		}

		for (int i = 0; i < wordList2.size(); i++) {

			wordListAll.add(wordList2.get(i));
		}
		return wordListAll;

	}
}
