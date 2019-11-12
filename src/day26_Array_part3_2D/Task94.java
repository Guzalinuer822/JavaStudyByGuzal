package day26_Array_part3_2D;

import java.util.Arrays;

public class Task94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		
		String[] Array1= info1.split("xxx");
		String[] Array2= info2.split("xxx");
		
		String password1=Array1[1];
		String password2=Array2[1];
		
		System.out.println("Password : " + password1+password2);
		
		
		
		//Ozzy's code....so hard way  -_-
		
		String info1Ozzy = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2Ozzy= "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

		
		String[] infoArrayOzzy1 = info1Ozzy.split("password :");
		String[] infoArrayOzzy2 = info2Ozzy.split("password :");
		
		System.out.println(Arrays.toString(infoArrayOzzy1));
		
		
		String pass1 = infoArrayOzzy1[1].split(". Please")[0];
		
		System.out.println(Arrays.toString(infoArrayOzzy1[1].split(". Please")));
		
		
		String pass2 = infoArrayOzzy2[1].split(". Please")[0];
		
		pass1 = pass1.substring(4, 10);
		pass2 = pass2.substring(4, 10);
		
		
		System.out.println(pass1.trim() + pass2.trim());





		



		
		
	
		
	}

}
