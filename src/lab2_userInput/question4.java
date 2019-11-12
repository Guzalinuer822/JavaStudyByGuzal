package lab2_userInput;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Question-4

* Write a program that asks user for the number of males and 
* the number of females registered in a class. The program should 
* display the percentage of males and females in the class.*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of males: ");
		double males=scan.nextDouble();
		System.out.println("Enter number of femals: ");
		double females=scan.nextDouble();
		
		double Percentage_of_males=((males/(males+females))*100);
		double Percentage_of_females=((females/(males+females))*100);
		System.out.println("Percentage of males in class= " + Percentage_of_males+" %.");
		System.out.println("Percentage of males in class= " + Percentage_of_females+" %.");
		scan.close();

	}

}
