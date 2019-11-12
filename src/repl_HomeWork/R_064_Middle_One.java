/*
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi


 */

package repl_HomeWork;

import java.util.Scanner;

public class R_064_Middle_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// YOUR CODE HERE

		

		if (word.length() % 2 == 1) {
			
			int midOdd = (word.length() + 1) / 2;
			if (word.length() >= 3) {
				System.out.println(word.charAt(midOdd - 1));
			} else if (word.length() == 1) {
				System.out.println(word + word + word);
			}
		}

		if (word.length() % 2 == 0) {
			
			int midEven=word.length()/2;

			if (word.length() >= 4) {
				System.out.println(word.substring(midEven-1, midEven + 1));
			}

			else if (word.length() == 2) {
				System.out.println(word + word);
			}
		}
		
		scan.close();
	}

}
