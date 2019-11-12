/*
Write a program that will find out shortest words in the given string 
str. If there are few words that are evenly short, print them all. 
Use split method in order to split str string variable and create 
an array of strings.  Print array with Arrays.toString() method. 
Sort array before printing. 

Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
 */

package repl_HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class R_121_Arrays_Print_shortest_word_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		// use split method them save in new created strArray.
		String[] strArray = str.split(", ");

		// find out shortest length

		// set word length at strArray[0] is the shortest ,than compare
		int shortestLength = strArray[0].length();

		for (int i = 0; i < strArray.length; i++) {

			if (strArray[i].length() != shortestLength && strArray[i].length() < shortestLength) {

				shortestLength = strArray[i].length(); // when find the shortest length assign to shortestLength

			}

		}

		// we find already the shortest length , but if there any other element length
		// are same we put in Array
		// to determine second array length ,if element length ==shortestLength,
		// countShortest will increase
		int countShortest = 0; // to count element which has same shortest length

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() == shortestLength) {
				countShortest++;
			}
		}

		// after find out how many element has same shortest length
		// create second array and put element
		String[] shortestElement = new String[countShortest];

		int j = 0; // responsible for shortestElement index

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() == shortestLength) {
				shortestElement[j++] = strArray[i]; // when find element has same shortest length put it to new array
			}
		}

		Arrays.sort(shortestElement);
		System.out.println(Arrays.toString(shortestElement));
		
		scan.close();
	}

}
