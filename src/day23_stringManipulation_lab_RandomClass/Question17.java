package day23_stringManipulation_lab_RandomClass;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Taco cat";  //tac ocaT
		
		String dummy="";
		
		//forwardString.equals(backwarString) =true    
		
		//  m + a + d + a + m
		//  4   3   2   1   0
		
		//  m + o + m
		//  2   1   0
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			dummy = dummy + str.charAt(i);    // "" + m
			                                  // m + a = ma
			                                  // ma + d = mad
		}
		
		if(str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}



		
		/*
		String str = "level";
		String result = "";
		for (int i = str.length(); i >= 1; i--) {

			result = result + str.substring(i - 1, i);

		}

		if (str.equals(result)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		*/
	}

}
