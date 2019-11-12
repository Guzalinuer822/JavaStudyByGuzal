package day23_stringManipulation_lab_RandomClass;

import java.util.Random;

public class Task85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int count1 = 0;
		int count2 = 0;

		int computerDice = 0;
		int userDice = 0;

		for (int i = 1; i <= 11; i++) {

			computerDice = random.nextInt(6) + 1;
			userDice = random.nextInt(6) + 1;
			System.out.println("user dice " + userDice + ", computer dice " + computerDice);
			if (userDice > computerDice) {
				count1++;
			} else if (userDice < computerDice) {
				count2++;
			}
		}

		System.out.println("your point: " + count1);
		System.out.println("computer point: " + count2);

		if (count1 > count2) {
			System.out.println("you win");
		} else if (count1 < count2) {
			System.out.println("computer win");
		} else {
			System.out.println("We are even, there is no winner");
		}
		
		System.out.println("I think, "+ "being a programmer "+"is cool");

		// Ozzy
		/*
		 * Random rn = new Random(); int computerDice; int userDice; int
		 * computerPoints=0; int userPoints=0;
		 * 
		 * for(int i=0;i<10;i++) {
		 * 
		 * computerDice = rn.nextInt(6)+1; userDice = rn.nextInt(6)+1;
		 * 
		 * if(computerDice>userDice) { computerPoints++; }else if(userDice>computerDice)
		 * { userPoints++; } }
		 * 
		 * System.out.println("Computer point is:" + computerPoints);
		 * System.out.println("User point is:" + userPoints);
		 * 
		 * if(computerPoints>userPoints) { System.out.println("Computer wins"); }else
		 * if(userPoints>computerPoints) { System.out.println("User wins"); }else {
		 * System.out.println("There is no winner"); }
		 */
	}

}
