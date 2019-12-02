/*
An array inhabitants represents cities and their respective populations. 
For example, the following arrays shows 8 cities and their respective 
populations:
[3, 6, 0, 4, 3, 2, 7, 0]
Some cities have a population of 0 due to a pandemic zombie disease 
that is wiping away the human lives.After each day, any city that is 
adjacent to a zombie-ridden city will lose half of its population.

Write a program to loop though each city population and make it lose 
half of its population if it is adjacent(right or left) to a city 
with zero people until all cities have no humans left.

 Make updates to each element in the array And print the array like 
 below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people 
in cities, above was just an example numbers to follow.

Hint: 
Below expression will print array in this format:

[3, 6, 0, 4, 3, 2, 7, 0]

Code:
System.out.println(Arrays.toString(inhabitants)));
 */

package repl_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class R_138_Arrays_Zombie_Attack_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants= new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.

		boolean keepGoing = true;
		int j = 0;
		while (keepGoing) {
			System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
			j++;
			ArrayList<Integer> index = new ArrayList<Integer>();

			for (int i = 0; i < inhabitants.length - 1; i++) {
				if (inhabitants[i] == 0 && inhabitants[i + 1] > 0 && !index.contains(i + 1)) {
					index.add(i + 1);
				}
			}
			for (int i = inhabitants.length - 1; i > 0; i--) {
				if (inhabitants[i] == 0 && inhabitants[i - 1] > 0 && !index.contains(i - 1)) {
					index.add(i - 1);
				}
			}

			//System.out.println(Arrays.toString(index.toArray()) + " -this");
			for (int i = 0; i < index.size(); i++) {
				inhabitants[index.get(i)] /= 2;
			}
			if (index.size() == 0) {
				keepGoing = false;
			}
		}
		System.out.println("---- EXTINCT ----");
	}

}
		
	// this is mine ---it is just partially working , crying.......  @_@ ....  -_-
		/*
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.

		int day = 0;

		label: for (int i = 0; i < inhabitants.length; i++) {

			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

			if (sum(inhabitants) == 0) {
				break label;
			}
			for (int j = 1; j < inhabitants.length-1; j++) {

			
				if (j != 7 && inhabitants[j] == 0) {
					
					
					inhabitants[j - 1] = inhabitants[j - 1] / 2;
					inhabitants[j + 1] = inhabitants[j + 1] / 2;

				}
				
				

				if (j == 7 && inhabitants[j] == 0) {
					inhabitants[j - 1] = inhabitants[j - 1] / 2;
				}

			}
			
			day++;
		}

		System.out.println("---- EXTINCT ----");
	}

	public static int sum(int[] inhabitants) {

		int sum = 0;
		for (int i = 0; i < inhabitants.length; i++) {
			sum = sum + inhabitants[i];
		}
		return sum;
	}

	// 0  20  0  20  20  10  0  10
	
}
*/