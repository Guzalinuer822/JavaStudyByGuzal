package day30_wrapperClass;

public class wrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer wrapper class
		int n1 = 10;
		Integer n2 = new Integer(10);   // new version changed to ---> Integer n2=Integer.valueOf(1234);

		System.out.println(n1);
		System.out.println(n2);

		// Double wrapper class
		double d1 = 44.5;
		Double d2 = new Double(44.5);
		Double d3 = new Double("44.5");

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		System.out.println(d1 + d2 + d3);

        // Character wrapper class
		char ch1 = 'a';
		Character ch2 = new Character('a');

		System.out.println(ch1);
		System.out.println(ch2);

        // Byte wrapper class

		byte b1 = 100;
		Byte b2 = new Byte((byte) 100);

		System.out.println(b1);
		System.out.println(b2);
		
		
		// in new version of JAVA should write in this way:
		
		 Integer num2=Integer.valueOf(1234);
		 
		 // Boolean wrapper class
		 
		 Boolean boo1=Boolean.valueOf(true);
		 Boolean boo2=Boolean.valueOf("false");
		 
		 System.out.println(boo1);
		 System.out.println(boo2);
		 		

	}

}
