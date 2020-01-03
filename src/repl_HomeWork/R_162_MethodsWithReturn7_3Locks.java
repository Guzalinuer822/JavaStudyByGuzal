package repl_HomeWork;

/*
This one is about truth table logic, threeLocks gets 3 booleans 
and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table

 */

public class R_162_MethodsWithReturn7_3Locks {
	public boolean threeLocks(boolean a, boolean b, boolean c) {
	    
	    if((a && b) || c) {
	    	return true;
	    }
	    return false;
	  }//end threeLocks
	}