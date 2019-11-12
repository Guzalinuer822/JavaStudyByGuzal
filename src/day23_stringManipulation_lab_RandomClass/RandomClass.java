package day23_stringManipulation_lab_RandomClass;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random=new Random();
		System.out.println(random.nextInt());
		
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());
		
		//
		
		System.out.println(random.nextInt(50)); // 0-49, 50 not included
		
		//5-11
		System.out.println(random.nextInt(10)+5);  // second define the range

	}
	

}
