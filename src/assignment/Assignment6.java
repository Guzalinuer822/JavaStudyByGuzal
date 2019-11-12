/*
Question 1:

Write a Java Program to store numbers from 1 to 1000 in One-dimensional array and then print array contents as follows (10 elements per row):
1    2    3    4    5    6    7    8    9    10    
11    12    13    14    15    16    17    18    19    20    
21    22    23    24    25    26    27    28    29    30    
.
.
.
991    992    993    994    995    996    997    998    999    1000    

 

Question 2:
Write a Java program to store numbers 1 to 10 in an array using data instantiation.
Then write a for loop to multiply each member of above array by 19, this way you will get table of 19 stored in the above array.
Finally write another for loop to print all the array elements.
You should get following output:
19
38
57
76
95
114
133
152
171
190

 

Question 3:
Below is One-dimensional array code:
char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};

Write the code to search for particular character in above array.
If I search for 'B', then output should be: "B found!"
If I search for 'E', then output should be: "E Not found!"

 

Question 4:
short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
If score is greater than or equal to 50 but less than 100, it is regarded as half-century.
If score is greater than or equal to 100 but less than 200, it is regarded as a century.
If score is greater than or equal to 200, it is regarded as a double-century.


NOTE: No scenario of triple-century in this case.

Write the code to print the number of half-centuries, centuries and double-centuries scored by the batsman.

 

Question 5:
In mathematics, the Fibonacci series are the numbers in the following integer sequence:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
and each subsequent number is the sum of the previous two.

Write a Java Program to generate above series till n number of times (For example you can try with
n = 10 and n = 15) and store it in One-dimensional array.
For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

Write a for loop to print all the elements of the array.
 */

package assignment;




public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 1

		int[] numbers = new int[1000];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = i + 1;

		}

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");

			if (i >= 9) {

				if ((i + 1) % 10 == 0) {
					System.out.println("");
				}
			}

		}

		// Question 2

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 19;
			System.out.println(nums[i]);
		}

		// Question 3

		char search = 'B';

		boolean flag = true;

		char arr[] = new char[] { 'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C' };
		
		
		for (int i = 0; i < arr.length; i++) {

			if (search == arr[i]) {
				flag = true;
				break;
			} else {
				flag = false;
			}

		}

		if (flag) {
			System.out.println(search + " found!");
		} else {

			System.out.println(search + " Not found!");
		}
		
		// Question 4
		
		int countCentury=0;
		int countHalfCentury=0;
		int countDoubleCentury=0;
		
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		for(int i=0; i<scores.length;i++) {
		
		if(scores[i]>=50 && scores[i]<100 ) {countHalfCentury++;}
		else if(scores[i]>=100 && scores[i]<200) {countCentury++;}
		else if(scores[i]>=200) {countDoubleCentury++;}
			
		
		}
		
		System.out.println("the number of half-centuries: "+countHalfCentury);
		System.out.println("the number of centuries: "+countCentury);
		System.out.println("the number of double-centuries: "+countDoubleCentury);
		
		
		// Question 5
		
		final int arrayN=10;  //  for declare array length
		
		int[] fibonacci=new int[arrayN];
		
		fibonacci[0]=0;
		fibonacci[1]=1;
		
		for (int i=2; i<fibonacci.length;i++) {
			
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
			
		}
		
		for(int i=0; i<fibonacci.length;i++) {
			System.out.println(fibonacci[i]);
		}
		
		
	}

}
