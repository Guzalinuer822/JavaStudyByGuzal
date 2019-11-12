package day30_wrapperClass;

public class Task_98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
	
		System.out.println(decodeTheCode(str1));
		
		String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
		System.out.println(decodeTheCode(str2));
	}

	public static String decodeTheCode(String s) {
		String result1="";
		for(int i=0; i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i)==' ') {
				result1=result1+s.charAt(i);
				
			}
		}
		
		return result1;
			
		}
		
		

	
	
}
