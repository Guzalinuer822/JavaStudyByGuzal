package day28_day29_Array_Exercise;

public class Question_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,1,3};
		int a=2;
		System.out.println(everyWhereValue(x, a));
		
		int[] y= {1,2,1,3};
		int b=1;
		System.out.println(everyWhereValue(y, b));
	}

	public static boolean everyWhereValue(int[] x, int a) {
		
		for(int i=0; i<x.length;i++) {
			if(x[i] == a) {
				
				if(x[i+1]==a || x[i+2]==a) {return true;}
			}
		}
		
		return false;
	}
}
