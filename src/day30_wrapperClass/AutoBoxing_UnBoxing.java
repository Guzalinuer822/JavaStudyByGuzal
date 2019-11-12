package day30_wrapperClass;

public class AutoBoxing_UnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Auto-boxing ---> primitive to object
		
		Integer num1=1234;
		int n=5;
		Integer num2=n;
		
		// Un-boxing ---> object to primitive
		
		Double d1=new Double(34.2);
		
		double d2=d1;
		System.out.println("d1:" + d1);
		System.out.println("d2:" + d2);
		
		Long l1=new Long(6000000L); // un-boxing
		Long l2=new Long(34567844); // no boxing
		
		long l3=l2;  // un-boxing
		
		// casting not possible with wrapper class
		
		Integer num3=Integer.valueOf(345);
		// Double d3=num3;  //   casting not possible with wrapper class
		
		
		
		// So casting is possible with primitive variable, not with wrapper class
		
		int x=345;
		double y=x;
		
	}

}
