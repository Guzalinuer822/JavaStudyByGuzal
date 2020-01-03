package day39_finalKeyword;

public class FinalArrays {

	public static void main(String[] args) {
		
		int[] Teams= {1,11};
		System.out.println(Teams[0]);
		System.out.println(Teams[1]);
		
		Teams[0]=10;
		Teams[1]=9;
		
		System.out.println(Teams[0]);
		System.out.println(Teams[1]);
		
		int[] num=new int[] {4,5,45};
		num =new int[] {23,55,3535,42};
		
		final int[] finalnum= {23,56,48};
		finalnum[0]=120;
		finalnum[1]=25;
		
		// finalnum=new int[] {15,48,78};   //this will give error , 
		                                   //because final array reference variable cannot refer to other new object
	}

}
