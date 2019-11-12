/*
Write a program that will calculate laptop price based on the components. 

First ask user for a screen size. If screen size is equals to 13.3, 
add  $200 to the laptop price. If screen size is equals to  15.0 - add  
$300 to the laptop price. If screen size is equals to  17.3 - add  $400 
to the laptop price.  Then ask user for CPU type. If CPU type equals to 
i3, add  $150 to the laptop price. If CPU type equals to i5, add  $250 to 
the laptop price. If CPU type equals to i7, add  $350 to the laptop price. 
Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. 
Then, ask user for storage type. There are 2 options: SSD and HDD. If it's 
HDD - add $50 to the laptop price for every 500gb.  If it's SSD - add $100 
to the laptop price for every 500GB. Then ask user for for screen resolution. 
There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 
if it's 4K screen.

Example:
 
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
Example #2
 
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter memory size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_056_LaptopConfigurator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0;
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE

		System.out.println("Select screen size:");
		double screenSize = scan.nextDouble();

		if (screenSize == 13.3) {
			price += 200;
		} else if (screenSize == 15.0) {
			price += 300;
		} else if (screenSize == 17.3) {
			price += 400;
		}

		System.out.println("Select CPU type:");
		cpu = scan.next();

		if (cpu.equals("i3")) {
			price += 150;
		} else if (cpu.equals("i5")) {
			price += 250;
		} else if (cpu.equals("i7")) {
			price += 350;
		}

		System.out.println("Select RAM size:");
		ram = scan.nextInt();

		if (ram % 4 == 0) {
			int rate = ram / 4;
			price = price + rate * 50;
		}

		System.out.println("Select storage type:");
		storageType = scan.next();

		System.out.println("Enter memory size:");
		int memorySize = scan.nextInt();

		if (storageType.equals("HDD")) {

			int rate1 = memorySize / 500;
			price = price + rate1 * 50;

		}

		if (storageType.equals("SSD")) {

			int rate2 = memorySize / 500;
			price = price + rate2 * 100;

		}

		System.out.println("Enter screen resolution:");
		screenType = scan.next();

		if (screenType.equals("FULLHD")) {
			price += 100;
		} else if (screenType.equals("4K")) {
			price += 200;
		}

		System.out.println("Laptop price is: $" + price);

		scan.close();
	}

}
