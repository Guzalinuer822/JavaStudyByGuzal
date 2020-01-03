package day44_exceptiondAndError;

import day04_arithematicOperators.arthimeticOperators;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println(4/0);
			String str=null;
			System.out.println(str.toUpperCase());
			
			int[] n= {10,4};
			System.out.println(n[2]);
			
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception happened");
		}catch(NullPointerException e) {
			System.out.println("NullPointer Exception happened");
		}catch(RuntimeException e) {
			System.out.println("Runtime Exception haapened" + e.getClass().getSimpleName());
		}

	}

}
