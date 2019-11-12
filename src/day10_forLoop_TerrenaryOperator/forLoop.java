package day10_forLoop_TerrenaryOperator;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
		}
//
		for (int i = 5; i <= 10; i++) {
			System.out.println("i= " + i);
		}

		//
		for (int num = 20; num >= 10; num--) {
			System.out.println("num= " + num);
		}
		//
		for (int i = 0; i <= 100; i += 10) {
			System.out.println("i= " + i);
		}

		// task 40

		for (int i = 2; i <= 100; i += 2) {
			System.out.print("i=" + i + " ");
		}

		System.out.println("#########################");

		// or using this;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("############");

		// task 41

		for (int i = 5; i <= 140; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("###########&&&&&&&&&&&&&&&&&&&&&&&&&&");

		// task 42

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				
				sumEven = sumEven + i ;
			} else {
				
				sumOdd = sumOdd + i;
			}
			System.out.println("sum_even= " + sumEven);
			System.out.println("sum_odd= " + sumOdd);
		}

		
		// task 43
		
		System.out.println("Number   Number Squared");
		System.out.println("-----------------------");
		for(int i=1; i<=10;i++ ) {System.out.println(i + "        " + i*i);}
		
		
		// task44
		System.out.println("KPH         MPH");
		System.out.println("-----------------------");
		double mph;
		int kph;
		for (kph= 60; kph<=130; kph +=10){
			mph= Math.round(kph*0.6214);
			System.out.println(kph + "         " + mph);}
		
		// task 44 Ozzy version
		
		//Constants
				final int STARTING_KPH=60;
				final int MAX_KPH=130;
				final int INCREMENT=10;
				
				//VARIABLES
				int kph1;   //to hold the speed in kph
				double mph1; //to hold the speed in mph
				
				//Display the table header
				System.out.println("KPH\t\tMPH");
				System.out.println("---------------------");
				
				for(kph1=STARTING_KPH;kph1<=MAX_KPH;kph1+=INCREMENT) {
					
					//calculate the mph
					mph1=kph1*0.6214;
					
					//Display the speeds in kph and mph
					System.out.println(kph1 + "\t\t" + mph1);
				}

	}

}