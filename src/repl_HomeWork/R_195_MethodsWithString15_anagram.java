package repl_HomeWork;

import java.util.Arrays;

public class R_195_MethodsWithString15_anagram {
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("listen", "Silent"));
		
		System.out.println(isAnagram("hi", "bye"));
	}
	
 public static boolean isAnagram(String word1, String word2) {
		    
	 char[] word1Arr=word1.toLowerCase().replace(" ", "").toCharArray();
	 char[] word2Arr=word2.toLowerCase().replace(" ", "").toCharArray();
	 
	 Arrays.sort(word1Arr);
	 Arrays.sort(word2Arr);
	
	return Arrays.equals(word1Arr, word2Arr);
	  }
 
	/*   another way
	 public static boolean isAnagram(String word1, String word2) {
		    
		 
		 word1=word1.toLowerCase().replace(" ", "");
		 word2=word2.toLowerCase().replace(" ", "");
		 
		 String[] arr1=word1.split("");
		 
		 String[] arr2=word2.split("");
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		
		 System.out.println(Arrays.toString(arr1));
		 System.out.println(Arrays.toString(arr2));
		 
		
		 int count=0;
		 for(int i=0;i<arr1.length;i++) {
			 
			 if(arr1[i].equals(arr2[i])){
				 count++;
			 }
		 }
		 
		if (arr1.length==count) {
			return true;
		}
		
		return false;
	  }
	  
	  */
	}