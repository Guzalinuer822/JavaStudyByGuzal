package repl_HomeWork;
/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour 
clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */

import java.util.Arrays;
import java.util.Scanner;

public class R_150_Methods12_TimeConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		/*
		 * Write your code here.
		 */

		

		String result = "";
		if (s.contains("AM")) {

			String[] arr = s.replace("AM", "").split(":");

			int changed = Integer.parseInt(arr[0]);

			if (changed == 12) {
				arr[0] = String.valueOf(0);
				result = arr[0] + "0:" + arr[1] + ":" + arr[2];
				System.out.println(result);
			} else {
				result = arr[0] + ":" + arr[1] + ":" + arr[2];
				System.out.println(result);
			}

		}

		else if (s.contains("PM")) {

			String[] arr = s.replace("PM", "").split(":");

			int changed = Integer.parseInt(arr[0]);

			if (changed == 12) {
				arr[0] = String.valueOf(12);
				result = arr[0] + ":" + arr[1] + ":" + arr[2];
				System.out.println(result);

			} else {

				arr[0] = String.valueOf(changed + 12);

				result = arr[0] + ":" + arr[1] + ":" + arr[2];
				System.out.println(result);

			}
		}
	}

}