package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(Arrays.toString(fizzArray(4)));
		System.out.println(Arrays.toString(fizzArray(1)));
		System.out.println(Arrays.toString(fizzArray(10)));
	}

	public static int[] fizzArray(int number) {
		
		int[] array=new int[number];
		
		for(int i=0; i<array.length;i++) {
			array[i]=i;
		}
		
		return array;
	}
}
