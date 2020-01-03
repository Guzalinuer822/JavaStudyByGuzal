package day39_finalKeyword;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> colors=new ArrayList<>();
		
		colors.add("orange");
		colors.add("white");
		colors.add("blue");
		
		
	//	colors=new ArrayList<String>();  //this will give error, because final ArrayList reference 
		                                //variable can not refer to other object
		
		

	}

}
