package lab2_userInput;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Question-2
 * A bag of cookies holds 40 cookies. The calorie information on the bag claims 
 * that there are 10 serving in the bag and that a serving equals 300 calories. 
 * write a program that lets the user enter the number of cookies he or she 
 * actually ate and then reports the number of total calories consumed.
 */
		
/*  For reference:
* 40 cookies in a bag = 10 servings
* 4 cookies = 1 serving = 300 calories     // ----> serving=40/10
* 2 cookies = 1/2 serving = 150 calories  
* 1 cookie = 1/4 serving = 75 calories
* So, 1 cookie = 75 calories             // -----> cookie_calories=300/serving
*/

		

	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of cookies eaten: ");
		
		int cookies_eaten=scan.nextInt();
		
		int calories_oneCookie=300/(40/10);
		int calories=cookies_eaten*calories_oneCookie;
		
		System.out.println("Total calories consumed: " + calories);
		
		scan.close();
	}

}
