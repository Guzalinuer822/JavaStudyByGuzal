package day19_stringManipulation_part1;

public class Task79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "CybertekSchool";
	
		for (int i=0; i<word.length(); i++) {
			char letter= word.charAt(i);
			
			if(letter== 'a' || letter== 'e' || 
					letter== 'o'||letter== 'u'||letter== 'i')
			{
				
		
			System.out.print(letter);
			
			 if(i != word.length()-2) {    // for comma, it is no more after index [-2], so word.length()-2  
				 
				System.out.print(","); 
			 }
			
		}
			
		
		}
		
		
	}

}
