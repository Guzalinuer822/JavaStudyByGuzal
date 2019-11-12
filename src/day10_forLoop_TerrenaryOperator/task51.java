package day10_forLoop_TerrenaryOperator;

public class task51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		for (int hour = 1; hour <= 12; hour++) {

			for (int minute = 0; minute <= 59; minute++) {

				for (int second = 0; second <= 59; second++) {
					
					System.out.printf("%02d:%02d:%02d\n", hour, minute, second); 
					}

				}
			}
		
	System.out.println();	

	}

}
