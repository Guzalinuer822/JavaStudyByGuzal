package day10_forLoop_TerrenaryOperator;

public class triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// isa mistanbul
//		  double weight2 = 2;  // in pounds
//		    int distance = 550;  // in miles
//		    int multiplicator=1;
//		    double rate = 1.0;
//		    
//		    if (distance%500 == 0) {
//		        multiplicator = distance/500;
//		    }else {
//		        multiplicator = distance/500 +1;
//		    }
//		    
//		    
//		    if (weight2 <= 2) {
//		        rate = 1.10 * multiplicator;
//		        
//		    }else if (weight2 > 2 && weight2 <= 6) {
//		        
//		        rate = 2.20 * multiplicator;
//		        
//		    }else if (weight2 > 6 && weight2 <= 10) {
//		        
//		        rate = 3.70 * multiplicator;
//		        
//		    }else {
//		        rate = 3.80 * multiplicator;
//		    }
//		    
//		    System.out.println(“shipping charges: �? + rate);
//		

		int rows = 4;
		for (int i = 1; i <= rows; i++) {// do for rows in pyramid
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");// print space
			}
			
			for (int k = i; k <= rows; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		
		
		
		
		
		//
		
		
		int f = 4;
		int roww=4;

		for (int i = 1; i <= roww; i++) {

			for (int j = 1; j < i ; j++) {
				
				System.out.print(" ");		
			}		
			//System.out.println();
	System.out.println(f);

	
	for(int j=f; j>0;--j) {System.out.print(j);}
		f--;
		
		
		
		}
		
		System.out.println("----------------------------------------------------------------");
//		int f = 4;
//		int roww=4;
//
//		for (int i = 1; i <= roww; i++) {
//
//			for (int j = 1; j < i ; j++) {
//				
//				
//				System.out.print(" ");
//				
//			}
//
//			System.out.println(f);
//
//			f--;
//
//		}

		
	
	
	//	for(int t=i; t<=roww;t++) {}
		
		
		
		
		
		
		
		
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);

			}
			System.out.println(" ");
		}

		int line = 5;

		for (int row = 0; row <= line; row++) {
			// 设置缩进
			for (int i = 0; i <= row - 1; i++) {
				System.out.print("\t");
			}
			for (int col = line; col > row; col--) {
				System.out.print("*" + "\t\t");
			}

			System.out.println();

		}

		// Question 18

		int x, z, num8;

		// outer loop to handle number of rows
		// n in this case
		for (x = 0; x < 4; x++) {
			// initialising starting number
			num8 = 1;

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (z = 0; z <= x; z++) {
				// printing num with a space
				System.out.print(num8 + " ");

				// incrementing value of num
				num8++;
			}

			// ending line after each row
			System.out.println();
		}

//		 for (int i = 0; i < 5; i++) {
//	            for (int j = 0; j < 5 - i; j++) {
//	                System.out.print(" ");
//	            }
//	            for (int k = 0; k <= i; k++) {
//	                System.out.print(k + " ");
//	            }
//	            System.out.println();
//	        }
//		

//		 int d;
//		 for( d = 0; d <4; d++)
//		 {
//		 for (int j = 0;j<4-d;j++)
//		 {
//		 System.out.print("9");
//		
//		 }
//		 for(int k = 0; k <=d; k++)
//		 {
//		 System.out.print("");
//		 }
//		 System.out.println();
//		 }

		int y, u, p;
		for (y = 5; y >= 1; y--) {
			for (u = 1; u <= y; u++) {
				System.out.print(" ");
			}
			for (p = 5; p >= y; p--) {
				System.out.print("*");
			}
			System.out.println();
		}

		//
		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= 12; j++) {

				System.out.print("*");

			}

			System.out.println();

			f--;

		}

		// Question 19
		// Question 20

		// Question 21

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {

				if (j == 1) {
					System.out.print("#");

				} else {
					System.out.print(" ");
				}
			}

			System.out.println("#");
		}

	}

}
