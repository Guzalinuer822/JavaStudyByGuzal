package day19_stringManipulation_part1;

public class Task78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="abcabqcabc";
		char myChar = 'a';
		
		int count=0;  // for counting repeated time.
		
		
		for (int i=0; i<word.length();i++) {
			
			if(word.charAt(i)== myChar) {count+=1;}
			
		}
		
		System.out.println("number of a in string is: " + count);
			
	}

}
