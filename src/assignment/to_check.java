package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class to_check {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] array = new int[8];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		// TODO. Write you code below this line.

		boolean keepGoing = true;
		int j = 0;
		while (keepGoing) {
			System.out.println("Day " + j + " " + Arrays.toString(array));
			j++;
			ArrayList<Integer> index = new ArrayList<Integer>();

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] == 0 && array[i + 1] > 0 && !index.contains(i + 1)) {
					index.add(i + 1);
				}
			}
			for (int i = array.length - 1; i > 0; i--) {
				if (array[i] == 0 && array[i - 1] > 0 && !index.contains(i - 1)) {
					index.add(i - 1);
				}
			}

			//System.out.println(Arrays.toString(index.toArray()) + " -this");
			for (int i = 0; i < index.size(); i++) {
				array[index.get(i)] /= 2;
			}
			if (index.size() == 0) {
				keepGoing = false;
			}
		}
		System.out.println("---- EXTINCT ----");
	}

}