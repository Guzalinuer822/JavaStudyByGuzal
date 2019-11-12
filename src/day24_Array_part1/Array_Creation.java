package day24_Array_part1;

public class Array_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//option 1
		int[] numbers;
		numbers = new int[3];
		
		// option 2
		
		int[] numbers1=new int[5];
		
		float[] temp=new float[100];
		char[] letters=new char[40];
		long[] inits=new long[50];
		String[] words= new String [5];
		String words1[]=new String[5];
		
		//
		
		int[] scores= new int[5];
		scores[0]=80;
		scores[1]=85;
		scores[2]=85;
		scores[3]=85;
		scores[4]=85;
		
		// 
		int[] myList= {1,2,3,4};
		String[] myArray= {"Apple","Orange","Cherry"};
				
				
		System.out.println(myList.length);	
		System.out.println(myArray.length);
		
		System.out.println("----------------------------------");
		
		for(int i=0; i<myList.length;i++) {System.out.println(myList[i]);}
		
		for(int i=0; i<myArray.length;i++) {System.out.println(myArray[i]);}
		
		
		
		int sum=0;
		int average=0;
		int[] score= {45,99,45,79,15,79,235,79};
		for(int i=0; i<score.length;i++) {
			sum=sum+score[i];
			
			}	
				
		System.out.println(sum/score.length);
	}

}
