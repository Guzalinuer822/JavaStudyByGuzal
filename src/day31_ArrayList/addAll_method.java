package day31_ArrayList;

import java.util.ArrayList;

public class addAll_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l1=new ArrayList<>();
		
		l1.add("Java");
		l1.add("JS");
		
		ArrayList<String> l2=new ArrayList<String>();
		
		l2.add("C#");
		l2.add("C++");
		
	
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		l2.addAll(l1);    // add two list together and will renew the list
		
		l1.addAll(l2);   // this one will add l1 to renewed l2
		
		System.out.println(l2.toString());    // [C#, C++, Java, JS] ,add two list together and will renew the list
				
		
		System.out.println(l1.toString());  // [Java, JS, C#, C++, Java, JS]  , this one will add l1 to renewed l2
		
		
	}

}
