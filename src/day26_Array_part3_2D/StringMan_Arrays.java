package day26_Array_part3_2D;

import java.util.Arrays;



public class StringMan_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] mayCars= {"honda", "mercedes", "bmw  ", "toyota", " ford"};
		
		System.out.println(mayCars[0].length());
		System.out.println(mayCars[1].charAt(2));
		
		System.out.println(mayCars[3].trim());
		
		System.out.println(mayCars[2].substring(2,3));
		
		System.out.println(mayCars[1].equals(mayCars[2]));
		
		System.out.println(mayCars[1]==mayCars[2]);
		
		System.out.println("---------------------");
		
		for(int i=0;i<mayCars.length;i++) {
			System.out.println(mayCars[i].length());
		}
		
		System.out.println("-------------------");
		
		String str="it will display the array of the size";
		
		String[] arr=str.split(" ");
		
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("------------------------");
		
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		
		System.out.println("-------------------------");
		
		for(int i=0; i<arr.length;i++ ) {System.out.println(arr[i]);}
	}

}
