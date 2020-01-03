package repl_HomeWork;

import java.util.Arrays;

/*
Method addElements accepts 2 int arrays and adds each element 
value of two arrays and returns a new array. You can assume 
that each array has 5 elements

addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]

 */
public class R_198_MethodsWithArrays2_addElements {
	
	public static void main(String[] args) {
		   
		int[]arr1= new int[]{10, 40, 50, 3, 1};
		 int[]arr2= new int[]{11, 0, 500, 44, 1101};
		 
		
		 
		 System.out.println(Arrays.toString(addElements(arr1,arr2)));
	}

	 public static int[] addElements(int[] ints1, int[] ints2) {
		    
		    int[] newArray=new int[ints1.length];
		    
		    for(int i=0; i<ints1.length;i++) {
		    	
		    	newArray[i]=(ints1[i]+ints2[i]);
		    }
		  return newArray;  
	  }
	  
	  
	}
