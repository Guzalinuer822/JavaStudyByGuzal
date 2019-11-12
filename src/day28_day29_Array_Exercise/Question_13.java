package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2 };
		int[] y = { 3, 4 };

		System.out.println(Arrays.toString(largestSum(x, y)));
		
		int[] a = { 5,6 };
		int[] b = { 3, 8 };

		System.out.println(Arrays.toString(largestSum(a,b)));
		
		int[] c = { 1, 1 };
		int[] d = { 3, 0 };

		System.out.println(Arrays.toString(largestSum(c,d)));
	}

	public static int[] largestSum(int[] x, int[] y) {
		
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < x.length; i++) {
			sum1 = sum1 + x[i];
		}
		for (int i = 0; i < y.length; i++) {
			sum2 = sum2 + y[i];
		}

		if (sum1 > sum2) {
			return x;
		}
		
		else if(sum1==sum2) {System.out.println("equal");}
		return y;
	}
	
	/*   Ozzy
	 
	 public static void biggerTwo(int[] arr1,int[] arr2) {
		
		int sum1=0;
		int sum2=0;
		
		for(int value : arr1) {
			sum1=sum1+value;
		}
		for(int value : arr2) {
			sum2=sum2+value;
		}
		
		if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}else if(sum2>sum1) {
			System.out.println(Arrays.toString(arr2));
		}else{
			System.out.println("Equal");
			
		}
	 
	 
	 */
}
