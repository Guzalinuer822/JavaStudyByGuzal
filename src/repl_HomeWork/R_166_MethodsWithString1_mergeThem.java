package repl_HomeWork;

/*
When gears merge and work together, one teeth from each one 
goes in order.
Write a method mergeStrings hat will return the strings merged, 
one letter at a time, starting with one.   Please note one and 
two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
public class R_166_MethodsWithString1_mergeThem {

	public static void main(String[] args) {

		System.out.println(mergeStrings("12345", "abcde"));
		System.out.println(mergeStrings("java", "selenium"));
		System.out.println(mergeStrings("wooden", "spoon"));

	}

	public static String mergeStrings(String one, String two) {

		String[] oneArray = one.split("");
		String[] twoArray = two.split("");

		int lengthOne = oneArray.length;
		int lengthTwo = twoArray.length;

		String merge = "";

		int j = 0;
		if (lengthTwo >= lengthOne) {
			for (int i = 0; i < lengthOne; i++) {

				merge = merge + oneArray[i] + twoArray[j++];

				if (i == lengthOne - 1) {
					merge = merge + two.substring(j);
				}

			}
		}

		else if (lengthTwo < lengthOne) {

			for (int i = 0; i < lengthTwo; i++) {

				merge = merge + oneArray[i] + twoArray[j++];

				if (i == lengthTwo - 1) {
					merge = merge + one.substring(j);
				}

			}

		}
		return merge;

	}
}