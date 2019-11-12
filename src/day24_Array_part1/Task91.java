package day24_Array_part1;

import java.util.Random;

public class Task91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn=new Random();
		
		int[] rnNumbers= new int[10];
		
		for (int i=0; i<rnNumbers.length;i++) {rnNumbers[i]=rn.nextInt(100);
		
		System.out.println(rnNumbers[i]);}
		
		
	}

}
