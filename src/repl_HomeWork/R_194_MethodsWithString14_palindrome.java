package repl_HomeWork;

/*
Palindrome is a word, phrase, or sequence that reads the same 
backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check 
is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic 
are both palindromes
- make your conditions space insensitive.  Race car is a 
palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true




 */
public class R_194_MethodsWithString14_palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("Noon"));

		System.out.println(isPalindrome("Nurses Run"));
	}

	
	/*
Approach: Take two pointers i pointing to the start of the string and j 
pointing to the end of the string. Keep incrementing i and decrementing 
j while i < j and at every step check whether the characters at these 
pointers are same or not. If not then the string is not a palindrome 
else it is.

Below is the implementation of the above approach:
	 */
	public static boolean isPalindrome(String check) {

		check = check.toLowerCase().replace(" ", "");

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = check.length() - 1;

		// While there are characters toc compare
		while (i < j) {

			// If there is a mismatch
			if (check.charAt(i) != check.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

}
