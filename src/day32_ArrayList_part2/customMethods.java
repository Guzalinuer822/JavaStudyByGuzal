package day32_ArrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creat integer list
		ArrayList<Integer> numslist = new ArrayList<>();

		numslist.add(10);
		numslist.add(10);
		numslist.add(7);
		numslist.add(8);
		numslist.add(8);
		numslist.add(3);
		numslist.add(4);
		numslist.add(8);

		// call method
		printList(numslist);

		System.out.println("--------------------------------");

		// create double list

		ArrayList<Double> doublelist = new ArrayList<>();

		doublelist.add(10.33);
		doublelist.add(1.22);
		doublelist.add(7.34);
		doublelist.add(3.55);
		doublelist.add(4.76);

		// call method then store
		double sum = sumList(doublelist);
		System.out.println(sum);

		// add list element from method, method is accepting number as a list size

		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());

		// add list element from method using random class , method is accepting number
		// as a list size
		ArrayList<Integer> rlist = getRandomList(20);
		System.out.println(rlist.toString());

		//

		ArrayList<String> strNums = new ArrayList<String>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");

		ArrayList<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
	}

	public static void printList(ArrayList<Integer> arrl) {
		for (Integer n : arrl) {
			System.out.print(n + " ");
		}
	}

	public static double sumList(ArrayList<Double> arrl) {

		double sumResult = 0;
		for (Double n : arrl) {
			sumResult = sumResult + n;
		}

		return sumResult;
	}

	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> newList = new ArrayList<>();

		for (int i = 1; i <= size; i++) {
			newList.add(i);
		}

		return newList;
	}

	public static ArrayList<Integer> getRandomList(int size) {

		Random rn = new Random();
		ArrayList<Integer> newList = new ArrayList<>();

		for (int i = 0; i < size; i++) {

			newList.add(rn.nextInt(100));
		}

		return newList;
	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String> arrl) {

		ArrayList<Integer> newList = new ArrayList<>();

		for (String str : arrl) {
			newList.add(Integer.parseInt(str));    // changing string to integer value, then adding to new list
		}
		return newList;
	}
}
