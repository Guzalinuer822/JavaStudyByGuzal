package assignment;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 1

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println("");
		}

		for (int i = 6; i >= 0; i--) { // for decreased column, outer loop should use decrement;
			for (int j = 1; j <= i; j++) {
				System.out.print(j);}
			System.out.println();
		}
		// Question 2

		for (int i = 7; i >= 0; i--) { // for decreased column, outer loop should use decrement;
			for (int j = 1; j <= i; j++) {
				System.out.print(j);}
		if(i==0)	{System.out.print("");}
			else {
		System.out.println();}
		}

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
