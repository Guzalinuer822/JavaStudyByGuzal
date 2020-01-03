package repl_HomeWork;
/*
The method gets a string and returns a string minus the first string.

for example:

removeFirst("aaa")
returns "aa"
 */
public class R_174_MethodsWithString9_removeFirstChar {
	
	public static void main(String[] args) {
		
		System.out.println(removeFirst("aaa"));
	}

	public static String removeFirst(String target) {
	    
	    String result="";
	
	    result=target.substring(1);
	    
	    return result;
	  }
	}

