package day27_Array_part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// toString()
		
		int[] nums= {43,12,4,1,3,5};
		
		System.out.println(Arrays.toString(nums));
		
		// equals
		
		int[] nums1= {4,5,6,10,100};
		int[] nums2= {4,5,6,10,100};
		
		System.out.println(Arrays.equals(nums1, nums2));
		
		// sort()  : sorts array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages= {"Spanish", "Italian", "English", "Arabic"};
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));  // if there is number or special character $ ... it will sorted frst
		
		
		// binarySearch()   ---- it will search element and give index number
		
		int[] numX= {4,6,7,10,55};
		
		System.out.println(Arrays.binarySearch(numX, 7));
		System.out.println(Arrays.binarySearch(numX, 55));
		
		System.out.println(Arrays.binarySearch(numX, 5));   //-2    because--->   -(insertionpoint)-1)
		System.out.println(Arrays.binarySearch(numX, 15));
		
		
		
		// following is not copy
		
		double[] d1= {2.3,4.5, 12.4};
		
		double[] d2=d1;
		
		// copyof()  ---->  this will copy
		
		double[] d3=Arrays.copyOf(d2, d2.length);  // this will copy d2
		
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 5.2;   // so when i change d2 element
		
		System.out.println(Arrays.toString(d2));  // it will effect d2
		System.out.println(Arrays.toString(d3)); // but will not effect copy version d3
 		
		
		
		
	}

}
