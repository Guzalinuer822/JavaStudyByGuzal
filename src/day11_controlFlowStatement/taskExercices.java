package day11_controlFlowStatement;

public class taskExercices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//task 49 
		int rows = 6;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(" ");

			}
			System.out.println("#");
		}

		
		// task 50
		
int num = 5;
		
		for (int i = 1; i<= num; i++) {
			for (int j = 1; j<= i; j++) {

				System.out.print(j + " ");

			}
			System.out.println();
		}

	
//		// task 51 my exercices
//		
//		for (int hour = 0; hour <= 12; hour++) {
//
//			for (int minute = 0; minute <= 59; minute++) {
//
//				for (int second = 0; second <= 59; second++) {
//					if (second < 10) {
//						System.out.println(hour + ":" + minute + ":" +"0"+ second);
//					} else {
//
//						System.out.println(hour + ":" + minute + ":" + second);
//					}
//				}
//			}
//		}

		
	}

}
