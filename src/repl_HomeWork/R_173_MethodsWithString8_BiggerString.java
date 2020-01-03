package repl_HomeWork;
/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */
public class R_173_MethodsWithString8_BiggerString {
	public static String biggerS(String a ,String b)
	  {
	   
		if(a.length()>b.length()) {
			return a;
		}
		
		return b;
	  }
	}