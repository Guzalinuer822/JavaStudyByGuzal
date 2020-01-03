package repl_HomeWork;



/*
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd 
char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"

 */
public class R_172_MethodsWithString7_at3rdChar {
	 public static String at3(String target,String word)
	  {
		String result = "";

		result = target.substring(0, 3) + word + target.substring(3);

	    return result;
	  }
	}