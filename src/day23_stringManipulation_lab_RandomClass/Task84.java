package day23_stringManipulation_lab_RandomClass;

import java.util.Random;

public class Task84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		for (int i = 0; i < 10; i++) {

			int num = random.nextInt(2);
			if (num == 0) {
				System.out.println("Tails");
			} else {
				System.out.println("Heads");
			}
		}
	}

}
