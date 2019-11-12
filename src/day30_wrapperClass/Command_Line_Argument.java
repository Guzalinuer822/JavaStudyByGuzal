package day30_wrapperClass;

public class Command_Line_Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<args.length;i++) {
			
			System.out.println(args[i]);
		}
	}

}
/*
 *  terminal 
 *  javac Command_Line_Argument.java
 *  
 *  java Command_Line_Argument  Apple 1 2 true
 *  
 *  */
