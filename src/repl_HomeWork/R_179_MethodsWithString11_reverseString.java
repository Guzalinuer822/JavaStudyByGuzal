package repl_HomeWork;
/*
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"
 */
public class R_179_MethodsWithString11_reverseString {

	public static String reverse(String input)
	{
		
		String reversed="";
		
		String[] array=input.split("");
		
		for(int i=array.length-1;i>=0;i--) {
			
			reversed =reversed+array[i];
		}
	   
		return reversed;
	}
}
