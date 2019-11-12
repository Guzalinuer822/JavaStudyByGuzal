/*
An array inhabitants represents cities and their respective 
populations. For example, the following arrays shows 8 cities 
and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 1]

Some cities have a population of 0 due to a pandemic zombie 
disease that is wiping away the human lives. After each day, 
every city will lose half of its population.

write a program to loop though each city population and make 
it lose half of its population until all cities have no humans 
left. Make updates to each element in the array And print the 
array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of 
people in cities, above was just an example numbers to follow.

Hint: 
Below expression will print array in this format:

[3, 6, 0, 4, 3, 2, 7, 1]

Code:
System.out.println(Arrays.toString(inhabitants)));
 */

package repl_HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class R_122_Arrays_Zombie_Attack_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.

		int day = 0;

		label: for (int i = 0; i < inhabitants.length; i++) {

			// it is printing everyday report
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

			// the report should be stop when all element in Array is 0;
			// if sum of all element is 0 it means , all people is dead because of zombie
			// so if sum is 0 ,it should break outer for loop and stop
			if (sum(inhabitants) == 0) {
				break label;
			}

			for (int j = 0; j < inhabitants.length; j++) {

				// After each day, every city will lose half of its population.
				inhabitants[j] = inhabitants[j] / 2;

			}

			day++;

		}

		System.out.println("---- EXTINCT ----");

	}

	// I write a method to calculate sum of all element
	// when all element is 0 , sum will be 0 then I can check my condition
	public static int sum(int[] inhabitants) {
		int sum = 0;
		for (int i = 0; i < inhabitants.length; i++) {
			sum = sum + inhabitants[i];

		}
		return sum;
	}
}