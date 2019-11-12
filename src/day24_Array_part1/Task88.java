package day24_Array_part1;

import java.util.Random;
import java.util.Scanner;

public class Task88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		String[] cars = new String[7];

		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrari";

		System.out.println("Enter your number: ");
		int num = scan.nextInt();

		int price = 0;

		switch (num) {
		case 0:
		case 1:
		case 2:
			price = random.nextInt(20000 + 1) + 20000; // ((max-min)+1) + min
			break;

		case 3:
		case 4:
			price = random.nextInt(30000 + 1) + 50000;

			break;

		case 5:
		case 6:

			price = random.nextInt(50000 + 1) + 100000;
			break;

		default:
			System.out.println("invalid");

		}

		System.out.println("Your choosed car is "+ cars[num] + ", price: " + price);

		
		//Ozzy
		/*
		 * Scanner sc = new Scanner(System.in); Random rn = new Random();
		 * 
		 * int price = 0;
		 * 
		 * String[] car = new String[7];
		 * 
		 * car[0]="Honda"; car[1]="Toyota"; car[2]="Nissan"; car[3]="BMW";
		 * car[4]="Mercedes"; car[5]="Porsche"; car[6]="Ferrari";
		 * 
		 * System.out.print("Select your car:"); int indexCar = sc.nextInt(); String
		 * selectedCar = car[indexCar];
		 * 
		 * switch(selectedCar) { case "Honda": case "Toyota": case "Nissan": price =
		 * rn.nextInt((40000-20000)+1)+20000; break; case "BMW": case "Mercedes": price
		 * = rn.nextInt((80000-50000)+1)+50000; break; case "Porsche": case "Ferrari":
		 * price = rn.nextInt((150000-100000)+1)+100000; break; default:
		 * System.out.println("Invalid car");
		 * 
		 * }
		 * 
		 * System.out.println("Price for selected car is " + price);
		 * 
		 */

		
		
	}

}
