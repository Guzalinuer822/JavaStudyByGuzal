package day34_Constructor_Encapsulation;

public class CarpetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Floor f1=new Floor(12,10);
		Carpet c1=new Carpet(8);
		
		Calculator cal=new Calculator(f1, c1);
		
		System.out.println(cal.getTotalCost());
		
		Floor f2=new Floor(10,10);
		Carpet c2=new Carpet(10);
		
		Calculator cal2=new Calculator(f2,c2);
		
		System.out.println(cal2.getTotalCost());
		
		
	}

}
