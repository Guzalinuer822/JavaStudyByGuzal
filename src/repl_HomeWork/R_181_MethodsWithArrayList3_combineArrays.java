package repl_HomeWork;

/*
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */
public class R_181_MethodsWithArrayList3_combineArrays {

	public static String combineRs(String[] r1, String[] r2) {
		
		String result = "";
		for (String each : r1) {
			result = result + each;
		}

		for (String each : r2) {
			result = result + each;
		}

		return result;
	}
}