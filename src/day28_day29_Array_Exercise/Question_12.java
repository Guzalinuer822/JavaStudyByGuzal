package day28_day29_Array_Exercise;

public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,3};
		int[] y= {1,3};
		
		System.out.println(firstElemnet1(x, y));
		
		int[] a= {7,2,3};
		int[] b= {1,3};
		
		System.out.println(firstElemnet1(a, b));
		
		int[] c= {4,2,3};
		int[] d= {5,3};
		
		System.out.println(firstElemnet1(c, d));
		
	}

	public static int firstElemnet1(int[] x, int[] y) {
		
		int count1=0;
		
		if(x[0]==1) {count1++;}
		if(y[0]==1) {count1++;}
		
		return count1;
	}
}
