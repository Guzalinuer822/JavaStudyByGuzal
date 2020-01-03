package repl_HomeWork;
/*
This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
 */
public class R_169_MethodsWithString4_wordCount {
	
	public static void main(String[] args) {
		
		System.out.println(wordCount("foo bar"));
	}

	
	 public static int wordCount(String words) {
		    
	      String[] arr=words.split(" ");
	      
	      return arr.length;
	  }
	  
	}