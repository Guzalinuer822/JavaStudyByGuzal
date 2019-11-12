package day31_ArrayList;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// languages 
		// print size ArrayList
		// read couple of elements
		
		ArrayList<String> languages=new ArrayList<>();
		
		
		
		languages.add("English");
		languages.add("Italian");
		languages.add("Uyghur");
		languages.add("Turkish");
		languages.add("French");
		
		System.out.println("number of value: "+languages.size());
		
		System.out.println(languages.toString());
		
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(1));
		
		languages.remove(0);
		System.out.println(languages.toString());
		
		
		
		
		
	}

}
