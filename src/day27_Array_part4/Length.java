package day27_Array_part4;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers= {
				{1,2,3,4},
				{5,6},
				{9,10,11,23,30,50,60}
		};
		
		
		// Display the numbers of rows
		
		System.out.println(numbers.length);
		
		
		// Display column number ---first go row then.length
		
		for (int i=0; i<numbers.length;i++) {System.out.println("the number of column in row " 
		+ i + " is " + numbers[i].length);}
		
		
		// display every element
		
		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<numbers[i].length;j++) {System.out.println(numbers[i][j]);}
		}
		
		
	}

}
