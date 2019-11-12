package day28_day29_Array_Exercise;

public class Question_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 2, 1, 2, 3, 4 };

		System.out.println(evenNum(x));
		
		System.out.println(countEvensOzzy(x));
	}

	// i used for loop
	
	public static int evenNum(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				count++;
			}
			
		}

		return count;
	}
	
	
	// Ozzy used for each loop
	public static int countEvensOzzy(int[] arr) {
		
		int counter=0;
		
		for (int value:arr) {
			if(value %2 ==0) {
				counter++;
			}
		}
		
		return counter;
	}
}
