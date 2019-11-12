package day31_ArrayList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> shoppingList=new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		
		// print numbers of items
		
		int count=shoppingList.size();
		System.out.println(count);
		
		// print all item in single line
		System.out.println(shoppingList.toString());
		
		// print first and last item in single line
		
		String first=shoppingList.get(0);
		
		String last=shoppingList.get(shoppingList.size()-1);
		
		System.out.println(first+" , " + last);
		
		
		// remove
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		
		
		// 
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		System.out.println("------------------------------------------");
		// print each element
		for(String item:shoppingList) {
			System.out.println(item);
		}
		
		// remove all clear
		shoppingList.clear();
		
		System.out.println(shoppingList.toString());
		
		
		
		
		
		
	}

}
