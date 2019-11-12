package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,3};
		int[] y= {};
		
		int[] a= {7,4,6,2};
		int[] b= {};
		
		System.out.println(Arrays.toString(secondCon(x, y)));
		System.out.println(Arrays.toString(secondCon(a, b)));
		
	}
public static int[] secondCon(int[] x, int[] y) {
	
	y=new int[2];
	
	for(int i=0; i<x.length;i++) {y[0]=x[0];
	y[1]=x[x.length-1];}
	
	return y;
	
}
}
