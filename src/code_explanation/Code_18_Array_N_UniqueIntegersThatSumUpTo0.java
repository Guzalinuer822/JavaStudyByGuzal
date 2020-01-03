package code_explanation;

import java.util.Arrays;


/*
    Array -- N unique integers that sum up to 0
    Write a function:

   that, given an integer N (1 < N < 100), returns an array containing 
   N unique integers that sum up to 0. The function can return any such 
   array. For example, given N = 4, the function could return [1,0, -3,2] 
   or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because 
   value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  
   (but there are many more correct answers).

*/ 



public class Code_18_Array_N_UniqueIntegersThatSumUpTo0 {

	public static void main(String[] args) {
		
      System.out.println(Arrays.toString(Solution(3)));
		
	}

	// Solution: 
	
	// after pass the argument it will decide size of array---Solution(int N)
	// then use for loop to put element to array
	// we want ----N unique integers that sum up to 0
	// former array element will be normal number and we will calculate sum
	// but last one element have to be minus sum ----result[N-1] = -sum
	// this make whole sum = 0 ;
	

		 
		public static int[] Solution(int N){

		int[] result = new int[N];

		int sum = 0;

		for(int i=0; i < N-1; i++)  {

		result[i] =i;   // put i to array in corresponding index

		sum += i;      // calculate the sum

		}

		result[N-1] = -sum;    // set number at last index as ---- minus sum
		                      // then it will make total sum ---- become 0

		return result;

		    }

}
