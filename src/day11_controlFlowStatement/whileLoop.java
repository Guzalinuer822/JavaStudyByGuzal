package day11_controlFlowStatement;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
//
		int student_num = 1;
		while (student_num <= 10) {
			System.out.println("student " + student_num);
			student_num++;
		}
		//
		int num = 11;
		while (num >= 1) {
			System.out.println(num + " ");
			num--;
		}

		//

		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k <= 10);

		// task 52

		int g = 25;

		while (g > 10) {
			System.out.println("int the loop");
			g--;
		}

		//
		int number = 0;
		int sumEven = 0;
		while (number <= 100) {
			if (number % 2 == 0) {
				sumEven = sumEven + number;
				number++;
			}
		}
		System.out.println(sumEven);

		
	}
}