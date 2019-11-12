package day25_Array_part2;

public class SameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= {2,3,4,5,9};
		int[] array2=array1;
		
		array1[0]=200;
		array2[4]=10000;
		
		System.out.println("The contents of array1:");
		for (int value:array1) {System.out.println(value);}
		
		System.out.println("----------------------------");
		
		System.out.println("The contents of array2:");
		for (int value:array2) {System.out.println(value);}
		
	}

}
