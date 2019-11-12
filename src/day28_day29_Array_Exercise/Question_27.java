package day28_day29_Array_Exercise;

public class Question_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,4,5,6,2};

		System.out.println(threeIncreasing(x));

		int[] y= {1,2,3};

		System.out.println(threeIncreasing(y));

		int[] z= {1,2,4,5,8,9};

		System.out.println(threeIncreasing(z));
	}
public static boolean threeIncreasing(int[] x) {
	
	for(int i=0; i<x.length-2;i++) {
		if(x[i]==x[i+1]-1 && x[i+1]==x[i+2]-1) {
			return true;
		}
	}
	
	return false;
}
}
