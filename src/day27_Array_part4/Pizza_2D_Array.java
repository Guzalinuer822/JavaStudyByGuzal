package day27_Array_part4;

import java.util.Arrays;

public class Pizza_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] pizzas = {

				{ "pinneapple", "pepperoni" }, { "anchovies", "mushroom", "olives" }, { "4 cheese" },
				{ "chicken", "tomatoes", "onioons" }, { "green peppers", "zuccini", "brocoli", "spinach", "shrimp" } };

		
		// print with nested for loop
		for (int i = 0; i < pizzas.length; i++) {

			for (int j = 0; j < pizzas[i].length; j++) {
				System.out.println(pizzas[i][j]);
			}
		}
		
		System.out.println("-------------------------------");
		
		// print with toString method

		System.out.println(Arrays.toString(pizzas[0]));
		System.out.println(Arrays.toString(pizzas[1]));
		System.out.println(Arrays.toString(pizzas[2]));
		System.out.println(Arrays.toString(pizzas[3]));
		System.out.println(Arrays.toString(pizzas[4]));
		
		
		System.out.println("----------------------------------");
		// printed with for each loop

		for (String[] pizza : pizzas) {

			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		
		System.out.println("------------------------------------");
		for(String value:pizzas[3]) {System.out.println(value);}
		
		
		int[][] students= {{4,5,6},{12,5,7},{23,56,12,55,3}
		};
		
		
		// usting nested for each loop
		
		for(int[] group:students) {
			for(int studentID:group) {System.out.println(studentID);}
		}
	}

}
