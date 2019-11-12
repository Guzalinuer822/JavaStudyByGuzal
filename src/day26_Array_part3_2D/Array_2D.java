package day26_Array_part3_2D;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores=new int[3][4];
		
		System.out.println(scores);
		System.out.println(scores[0]);
		
		
		//print first row
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
		
		// second
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
		
		// third
		System.out.println(scores[2][0]);
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		System.out.println(scores[2][3]);
		
		System.out.println("-------------------------");
		
		// Assign value to 2D Array
		
		// first
		scores[0][0]=10;
		scores[0][1]=20;
		scores[0][2]=30;
		scores[0][3]=40;
		
		//second
		
		scores[1][0]=50;
		scores[1][1]=60;
		scores[1][2]=70;
		scores[1][3]=80;
		
		// third
		
		scores[2][0]=90;
		scores[2][1]=100;
		scores[2][2]=110;
		scores[2][3]=120;
		
		
	}

}
