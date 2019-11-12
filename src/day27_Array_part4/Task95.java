package day27_Array_part4;

public class Task95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grade = {

				{ 68, 75, 54, 80 }, { 100, 64, 20, 50 }, { 10, 35, 40, 90 } };
		int sum = 0;
		for (int i = 0; i < grade.length; i++) {

			for (int j = 0; j < grade[i].length; j++) {
				sum = sum + grade[0][j];
			}
		}
		System.out.println("average: " + sum / grade[0].length);

		int sum2 = 0;
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				sum2 = sum2 + grade[i][0];
			}
		}

		System.out.println("math total :" + sum2);

	}

}
