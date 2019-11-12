package day10_forLoop_TerrenaryOperator;

public class task45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		num1 = 5;
		num2 = 4;

		for (int i=1; i<=10; i++)if (num1 > num2) {
			System.out.println("num1 is largest");
		} else if(num1<num2) {
			System.out.println("num2 is largest");
		}
	 
	else {System.out.println("num1 = num2");}

		
		
		// task 46
		
		
		int k=5;
		System.out.println("Multiplication tabel for "+ k);
		System.out.println("--------------------------");
		
		for (int i=1; i<=10; i++) {System.out.println(k +"*" +i + "="+ k*i);}
}
}