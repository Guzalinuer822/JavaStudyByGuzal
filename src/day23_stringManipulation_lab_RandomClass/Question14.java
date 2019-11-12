package day23_stringManipulation_lab_RandomClass;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "oddly";

		if (str.length() < 2) {
			System.out.println(false);
			return;
		}

		if (str.endsWith("ly")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// Ozzy
		
/*
    String str = "oddsly"; //                  4     6-2
		                       //oddy              2     4-2
		                       //ddd               1     3-2
		
		
		if(str.length()<2) {
			System.out.println(false);
			return;
		}
		
		if(str.substring(str.length()-2).equals("ly")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}


 */
	}

}
