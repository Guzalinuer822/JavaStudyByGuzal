/*
The Utopian Tree grows exactly 1 cm for the first three years, 
and after that it grows by 2 cm every year, this is a simple 
implementation of the algorithm. You will need to use loops 
to create it.

Show 10 years of growth of the Utopian Tree.

Output:
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10
 */

package repl_HomeWork;

public class R_116_UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] year = new int[10];

		int growth = 1;
		int treeSize = 1;

		for (int i = 0; i < 10; i++) {
			year[i] = i + 1;

			if (i < 3) {

				treeSize = year[i] * growth;

				System.out.println("year " + year[i] + " - growth 1 cm");
				System.out.println("tree size: " + treeSize+" cm");
			}

			if (i >= 3) {
				growth = 2;
				treeSize += 2;

				System.out.println("year " + year[i] + " - growth 2 cm");
				System.out.println("tree size: " + treeSize+" cm");
			}
		}
	}

}
