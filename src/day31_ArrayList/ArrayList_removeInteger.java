package day31_ArrayList;

import java.util.ArrayList;

public class ArrayList_removeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums=new ArrayList<>();
		
		System.out.println(nums.size());
		
		
		System.out.println(nums.isEmpty());  // it is showing ArrayList is empty or not , return boolean
		
		System.out.println(nums.size()==0);  // it is showing ArrayList is empty or not , return boolean
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		
		// if you pass value, it will remove element in index value position
		nums.remove(5);
		
		System.out.println(nums.toString());
		
		// if you pass object it will remove object
		
		Integer n1=new Integer(5);   // converting primitive to object
		Integer n2=Integer.valueOf(5);
		
		nums.remove(n1);   // passing n1 object to remove method  , it is removing specified element
		                      
		
		System.out.println(nums.toString());
		
		nums.remove(new Integer(4));  //it is removing specified element
		
		System.out.println(nums.toString());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
