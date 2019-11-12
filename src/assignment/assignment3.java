package assignment;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 1

		int month, day, year;
		month = 8;
		day = 10;
		year = 80;

		if (year == month * day) {
			System.out.println("the date " + month + "/" + day + "/" + year + " is magic");
		} else {
			System.out.println("the date " + month + "/" + day + "/" + year + " is not magic");
		}

		// Question 2

		double mass, weight;
		mass = 110;
		weight = mass * 9.8;

		if (weight > 1000) {
			System.out.println("Weight " + weight + " Newtons is too heavy.");
		} else if (weight < 10) {
			System.out.println("Weight " + weight + " Newtons is too light.");
		} else {
			System.out.println("Weight " + weight + " Newtons is normal.");
		}

		// Question 3

		double second;
		second = 86400;

		if (second >= 60) {
			System.out.println("The number of minute: " + (second / 60));
		}

		if (second >= 3600) {
			System.out.println("The number of hour: " + (second / 3600));
		}

		if (second >= 86400) {
			System.out.println("The number of day: " + (second / 86400));
		}

		// Question 4

		int packages, retail, original_price;
		retail = 99;
		packages = 100;

		original_price = retail * packages;

		if (packages >= 10 && packages <= 19) {
			System.out.println("The amount of discount: " + original_price * 0.2);
			System.out
					.println("Total amont of the purchase after discount: " + (original_price - original_price * 0.2));
		} else if (packages >= 20 && packages <= 49) {
			System.out.println("The amount of discount: " + original_price * 0.3);
			System.out
					.println("Total amont of the purchase after discount: " + (original_price - original_price * 0.3));
		} else if (packages >= 50 && packages <= 99) {
			System.out.println("The amount of discount: " + original_price * 0.4);
			System.out
					.println("Total amont of the purchase after discount: " + (original_price - original_price * 0.4));
		} else if (packages >= 100) {
			System.out.println("The amount of discount: " + original_price * 0.5);
			System.out
					.println("Total amont of the purchase after discount: " + (original_price - original_price * 0.5));
		} else {
			System.out.println("There is no discount, sorry.");
			System.out.println("Total amont of the purchase: " + original_price);
		}

		// Question 5
		double weight_packages, miles, distance_ratio;
		weight_packages = 2;
		miles = 550;

		distance_ratio = Math.ceil(miles / 500);

		if (weight_packages <= 2) {
			System.out.println("The shipping charge will be: $ " + (1.10 * distance_ratio));
		} else if (weight_packages > 2 && weight_packages <= 6) {
			System.out.println("The shipping charge will be: $" + (2.20 * distance_ratio));
		} else if (weight_packages > 6 && weight_packages <= 10) {
			System.out.println("The shipping charge will be: $ " + (3.70 * distance_ratio));
		} else if (weight_packages > 10) {
			System.out.println("The shipping charge will be: $ " + (3.80 * distance_ratio));
		}

	

		// Question 6

		double total_calories, fat_grams, calories_from_fat, percentage_of_calories;

		total_calories = 1500;
		fat_grams = 40;
		calories_from_fat = fat_grams * 9;
		percentage_of_calories = (calories_from_fat / total_calories) * 100;

		if (percentage_of_calories < 30) {
			System.out.println("Food is in low fat.");
		} else if (percentage_of_calories < 30 && percentage_of_calories < 100) {
			System.out.println("Food is in nonrmal or high fat.");
		} else if (calories_from_fat > total_calories) {
			System.out.println(
					"Invalid input. Note: The number of calories from fat can not be greater than the total number of calories in the food item.");
		}

		// Question 7

		String medium = "air";
		double distance_sound;
		distance_sound = 120;

		switch (medium) {

		case "air":
			System.out.println("The amount of time it will take sound to travel in air: " + (distance_sound / 1100));
			break;
		case "water":
			System.out.println("The amount of time it will take sound to travel in water: " + (distance_sound / 4900));
			break;
		case "steel":
			System.out.println("The amount of time it will take sound to travel in steel: " + (distance_sound / 16400));
			break;
		default:
			System.out.println("The input is invalid.");

		}

     	// Question 8

		double hour;
		hour = 10;

		String customer_package = "A";

		switch (customer_package) {
		case "A":
			System.out.println("Your total charge will be: $ " + (9.95 + (hour - 10) * 2.00));
			break;
		case "B":
			System.out.println("Your total charge will be: $ " + (13.95 + (hour - 20) * 1.00));
			break;
		case "C":
			System.out.println("Your total charge will be: $ 19.95");
			break;
		default:
			System.out.println("The input is invalid.Doesn't have such a service");
		}

		// Question 9

		int checks, base_fee;
		checks = 60;
		base_fee = 10;

		if (checks < 20) {
			System.out.println("Bank's service fees for the month will be: $ " + (base_fee + checks * 0.10));
		} else if (checks >= 20 && checks <= 39) {
			System.out.println("Bank's service fees for the month will be: $ " + (base_fee + checks * 0.08));
		} else if (checks >= 40 && checks <= 59) {
			System.out.println("Bank's service fees for the month will be: $ " + (base_fee + checks * 0.06));
		} else if (checks >= 60) {
			System.out.println("Bank's service fees for the month will be: $ " + (base_fee + checks * 0.04));
		}

		// Question 10
		int books;
		books = 5;

		if (books == 0) {
			System.out.println("You earn 0 points.");
		} else if (books == 1) {
			System.out.println("You earn 5 points.");
		} else if (books == 2) {
			System.out.println("You earn 15 points.");
		} else if (books == 3) {
			System.out.println("You earn 30 points.");
		} else if (books >= 4) {
			System.out.println("You earn 60 points.");
		}

		// Question 11

		int number;
		number = 3;

		switch (number) {

		case 0:
		case 1:
		case 2:
			System.out.println("Low Number");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Medium Number");
			break;
		default:
			System.out.println("Other Number");

		}

		// Question 12
		int num = 12;

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}

		// Question 13
		int n, n1, n2, n3;
		n = 10;
		n1 = 0;
		n2 = 1;
		System.out.print(n1 + " " + n2 + " ");

		for (int i = 2; i <= n; i++) {
			n3 = n1 + n2;

			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}

		System.out.println();

		// Question 14

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		// Question 15
		int upper_bound = 11;
		int sum_of_number = 0;

		int m = 0;
		while (m <= upper_bound) {
			sum_of_number = sum_of_number + m;
			m++;
		}
		System.out.println("Sum of number = " + sum_of_number);

		// Question 16
		
		int p=1;
		int end=10;
		while (p<=end-1) {
			
			if(p%2 != 0) {
			System.out.print(p+", ");
	
			}
			
		p++;
			
		}
		
       System.out.println();

		// Question 17

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);

			}

			System.out.println("");
		}

		// Question 18 (only can do this,can't do it more -_-)
		
		int roww=4;

		for (int i = 1; i <= roww; i++) {

			for (int j = 1; j <= i ; j++) {
				
				System.out.print(" ");		
			}		
			
			 for (int j = roww; j>=i; j--)
	            {
	                             
	                System.out.print(j+ " ");
	                
	            }
		
	System.out.println();
		}
		
		
		
		// Question 19

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}

			System.out.println();
		}

		// Question 20

		int row=8;
		int column=8;
		
		int t = 1;                                      // for alternative "W" and "B"
		
		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= column; j++) {

				if (t == 1) {                          //  "W" and "B" is changing the position 	                                  
					System.out.print("W ");            
				} else {
					System.out.print("B ");	            // like 1 and -1 is circling ,so i exert t value ;
				} 
				t *= -1;                               // t is changing between 1 and -1;
			}
	
			if (column%2==0) {                         // when column number is even , "W" and "B" is changing the position again.
				t *= -1;                               // so when column==even , t has to change again.
			}
		
		System.out.println();

		}

		
		
		// Question 21

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {

				if (j == 1) {
					System.out.print("#");

				} else {
					System.out.print(" ");
					
				}
			}

			System.out.println("#");
		}

		
	}
}
