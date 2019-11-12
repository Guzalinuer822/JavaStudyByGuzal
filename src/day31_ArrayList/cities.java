package day31_ArrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cities = new ArrayList<>();

		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");

		System.out.println(cities.toString());

		// print each city by using for-each loop

		for (String city : cities) {
			System.out.println(city);
		}

		System.out.println("------------------------------------------");

		// print each element by using for-iterator loop

		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i));
		}

		System.out.println("---------------------------------------");
		//

		System.out.println("Removing Baku:");
		cities.remove("Baku");

		System.out.println("New York"); // new york not in the list, so it will not remove anything
		                                // and it will not give error too

		System.out.println(cities.toString());
		
		cities.add(0, "Istanbul");  // add element to specified position
		System.out.println(cities.toString());
		
		
		System.out.println("------------------------------------------");
		
		int idx=cities.indexOf("Istanbul");
		System.out.println(idx);
		
		System.out.println(cities.indexOf("Bursa"));  // not in the list , so giving -1 as a result
		
		System.out.println("-----------------------------------------");
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);

	}

}
