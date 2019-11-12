package day31_ArrayList;

import java.util.ArrayList;

public class ArrayList_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating ArrayList
		ArrayList<String> names=new ArrayList<>();
		
		ArrayList<Integer> nums=new ArrayList<>();
		
		// Assigning value to ArrayList
		
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		// reading from ArrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		
		System.out.println("names count: " + names.size());
		System.out.println("nums count: " + nums.size());
		
		
		// for show all element in ArrayList
		
		System.out.println(names.toString());
		System.out.println(nums.toString());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
