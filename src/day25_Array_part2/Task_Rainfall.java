/*
Question:
Write a program that stores the name of each month in an array of Strings, 
and the rainfall for each month of the year into an array of doubles. The 
program should determine the total rainfall for the year, the average monthly 
rainfall, and the months with the most and least amount of rain. You will 
need: Two one-dimensional arrays - one to store the names of each month and 
another to store the rainfall for each month. 

(What would be the size of these arrays?)


Use an initialization list to store the names of each month into the String 
array. A for loop to receive the values of rainfall. You should refer to 
your string array to get the names for the appropriate month. The rainfall 
values should be stored in the doubles array. Make sure the user does not 
enter a negative value for rainfall. (Use a while loop for this part)


A for loop to compute the running sum A variable to store the average A 
for loop (with a nested if statement) to determine the largest amount of 
rainfall in the doubles array You need to refer to the String array to 
indicate the month with the largest rainfall.


A for loop (with a nested if statement) to determine the smallest amount 
of rainfall You need to refer to the String array to indicate the month 
with the largest rainfall.

 */


package day25_Array_part2;

import java.util.Scanner;

public class Task_Rainfall {

	public static void main(String[] args) {
		
		
		// Declare constant --- to store size of both arrays

		final int num_month = 12;

		Scanner scan = new Scanner(System.in);

		// Declare array --- to store the rainfall data

		double[] rainfall = new double[num_month];

		// Declare array --- to store the name of each month;
		// Use an initialization list here

		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		// Get the rainfall for each month

		for (int i = 0; i < num_month; i++) {
			System.out.println("Enter the rainfall (in inches) for " + month[i] + ": ");
			rainfall[i] = scan.nextDouble(); // User will enter rainfall data and storing in array of double

			// Validate the user input, because:should not accept negative number;
			if (rainfall[i] < 0) {
				System.out.println("Erroe: Please enter positive value, Negative value are not acceptable!");

				// then should accept user input another time
				System.out.println("Enter the rainfall (in inches) for " + month[i] + ": ");
				rainfall[i] = scan.nextDouble();
			}
		}

		// Calculate the total rainfall for the year

		double totalRainfall = 0;

		for (int i = 0; i < num_month; i++) {

			totalRainfall = totalRainfall + rainfall[i];

		}

		// Display the the total rainfall for the year
		System.out.println("Total rain fall for the year: " + totalRainfall);

		// Display the average of monthly rainfall
		System.out.println("The average of monthly rainfall: " + totalRainfall / num_month);

		// Now determine the largest amount of rainfall

		double largest = rainfall[0]; // assume --- rainfall[0] holds the largest value

		int index = 0;  
		
		// for loop has to start with 1 , because 0 position we assume it is the largest value
		
		for (int i = 1; i < num_month; i++) {

			if (rainfall[i] > largest) {

				// need to update largest value
				
				largest = rainfall[i];
				index = i;
			}

		}

		// Display the largest amount of rainfall

		System.out.println("The month with the most rain is : " + month[index] + " amount is " + largest);
		
		
		

		// Now determine the smallest amount of rainfall

		double smallest = rainfall[0]; // assume --- rainfall[0] holds the largest value
		
		index=0;  // reset the value
		
		// for loop has to start with 1 , because 0 position we assume it is the smallest value
		
		for(int i=1;i<num_month;i++) {
			
			if(rainfall[i]<smallest) {
				
				// need to update smallest value
				
				smallest=rainfall[i];
				index=i;
			}
		}
		
		// Display the smallest amount of rainfall
		
		System.out.println("The month with the least rain is : " + month[index] + " amount is " + smallest);

		scan.close();
/*
 * 
 
* * * https://study.com/academy/answer/write-a-program-that-stores-the-name-of-each-month-in-an-array-of-strings-and-the-rainfall-for-each-month-of-the-year-into-an-array-of-doubles-the-program-should-determine-the-total-rainfall-for-the.html

Explanation:

The java program Rainfall prompts the user to enter 12-month rainfall 
in an array, rain. Then find the total, average, largest and smallest 
rainfall of the year. The program validates the user input for rainfall 
using while loop. The names of the 12 months are stored in a string array 
called a month. The NUM_MONTH is a constant variable to set the number 
of months in a year. To find the total rainfall amount, iterate over the 
array, rain then finds total rainfall value. The average rain fall is 
calculated by dividing the total by NUM_MONTHS. To find the largest rain 
fall and mont of the largest rain fall is calculated by assuming the 
largest rain fall is the first value in rain array. Later, using the for 
loop, determine the actual largest value by comparing the largest with the 
rain array values. Similarly, to find the smallest rain fall and month of 
the smallest rain fall is calculated by assuming the smallest rain fall 
is the first value in rain array. Later , using the for loop , determine 
the actual smallest value by comparing the smallest with the rain array 
values. Print the total, average, largest and smallest rain fall values 
on the java console output.
 */
	}

}


