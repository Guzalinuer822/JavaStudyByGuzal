package day11_controlFlowStatement;

public class nestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {

			System.out.println("Outer Loop Iteration " + i);

			for (int j = 1; j <= 2; j++) {

				System.out.println("i = " + i + "; j = " + j);
			}

		}

		//

		for (int i = 0; i < 3; i++) {
			System.out.println("outer loop at states: " + i);
			for (int p = 0; p <= 3; p++) {
				System.out.println("inner loop at state: " + p);
				if (p == 3) {
					System.out.println();
				}
			}
		}

		// task 47

		for (int row = 1; row < 7; row++) {
			for (int column = 1; column < 8; column++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// task 48

		int rows = 7;
		
		for (int i = 1; i<= rows; i++) {
			for (int j = 1; j<= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}
