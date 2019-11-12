package day23_stringManipulation_lab_RandomClass;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String str = "badxx"; //0 and 1
		
		//String str = "xbadxx";
		
		//String str = "xxbadxx";
		
		boolean flag = true;
				
				
				
		for(int i=0;i<2;i++) {
			
			if(str.substring(i, i+3).equals("bad")) {
				
				flag = true;
				break;
				
			}else {
				
				flag = false;
			}
			
		}
		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}






/*
		String str="xbadxx";
		
		if(str.substring(0, 3).equals("bad") ||str.substring(1,4).equals("bad")) {System.out.println("true");}
		else {System.out.println("false");}
		
*/
	}

}
