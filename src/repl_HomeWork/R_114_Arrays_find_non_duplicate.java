/*
Given an array nums with 7 integers every element is repeated twice - 
except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */

package repl_HomeWork;


import java.util.Scanner;

public class R_114_Arrays_find_non_duplicate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		// TODO: write your code below

		// create boolean, if find no-repeated element change to true
		boolean isUnique = false;

		// use two loops , outer loop pick element one by one
		// inner loop checks if the element is repeated or not
		// (check if it is present more than one or not)
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {

				if (i != j) {  // should i!=j ,because it cannot be the same element
					if (nums[i] != nums[j]) {  // try to find it is repeated/equal or not
						isUnique = true;       // if it is not equal , boolean change to true;
					} else {
						isUnique = false;  // if it is equal ,break, check from next index
						break;
					}

				}
			}

			if (isUnique) {   // if isUnique==true, then print the no=repeated element
				System.out.println(nums[i]);
			}

		}
		input.close();
	}

}
