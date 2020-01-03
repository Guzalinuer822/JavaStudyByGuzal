package repl_HomeWork;
/*
Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
 */

import java.util.ArrayList;
import java.util.Arrays;


public class R_192_MethodsWithArrayList10_timesTwo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, -6, 3, -8, 0, 4, 3));

		timesTwo(list);
	}

	// create your method below
	public static void timesTwo(ArrayList<Integer> nums) {

		for (int i = 0; i < nums.size(); i++) {

			nums.set(i, (nums.get(i) * 2));
		}

		System.out.println(nums.toString());
	}

}