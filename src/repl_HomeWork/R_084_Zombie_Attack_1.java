/*
A variable inhabitants represents a city and its respective populations. 
City might have a population of 0 due to a pandemic zombie disease that 
is wiping away the human lives. After each day, a city will lose half of 
its population.write a program to loop the city population and make it 
lose half of its population until no humans left. Print the each day 
like below for each day:

example1- inhabitants is 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----

example2- inhabitants is 0
---- EXTINCT ----

example3- inhabitants is 20
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_084_Zombie_Attack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();

		int day = 0;
		String report = "";

		while (inhabitants != 0) {

			report = "Day " + day + "[" + inhabitants + "]";

			System.out.println(report);

			inhabitants = inhabitants / 2;

			day++;
		}

		System.out.println("---- EXTINCT ----");
		
		scan.close();

	}

}
