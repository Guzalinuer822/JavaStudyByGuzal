package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int[] y = { 17, 12, 10, 8 };
		int[] a = { 7, 0, 0 };

		System.out.println(Arrays.toString(rotatedLeft(x)));
		System.out.println(Arrays.toString(rotatedLeft(y)));
		System.out.println(Arrays.toString(rotatedLeft(a)));
		
		
		
	}

	public static int[] rotatedLeft(int[] x) {

		int rotate = x[0];   // retain the first element

		for (int i = 1; i < x.length; i++) {

			x[i - 1] = x[i];  // shifting element to left

		}

		x[x.length - 1] = rotate;  // move the first element to fill in the last position

		return x;
	}
	
	
	/*   Ozzy
	 
	 public static int[] rotateLeft(int[] arr) {
		
		int x = arr[0]; //1
		
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = x;
		
		return arr;
		
	}
	 
	 
	 */
}
