package day28_day29_Array_Exercise;

import java.util.Arrays;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,3};
		
		int[] y= {2,3,5};
		
		int[] z= {11,2,13,3,2};
		System.out.println(Arrays.toString(set3to0(x)));
		System.out.println(Arrays.toString(set3to0(y)));
		System.out.println(Arrays.toString(set3to0(z)));
	}

	public static int[] set3to0(int[] x) {
		
		for(int i=0; i<x.length-1;i++) {
			
			if(x[i]==2 && x[i+1]==3) {x[i+1]=0;}
		}
		
		return x;
	}
}
