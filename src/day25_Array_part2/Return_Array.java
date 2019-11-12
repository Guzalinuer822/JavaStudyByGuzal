package day25_Array_part2;

public class Return_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] values;
		values=getArray();
		
		for(double number:values) {System.out.print(number + " ");}
		
	}
public static double[] getArray() {
	
	double[] array= {1.2,2.3,3.5,4.5,5.6};
	return array;
}
}
