package day10_forLoop_TerrenaryOperator;

public class terrenaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//

		String result;
		int score = 88;

		if(score>60){result = "pass";}else{result="fail";}
		
		// also described as below

		result = score > 60 ? "pass" : "fail";

		//

		int x = 5;
		System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
		
	// also described as below

		if (x > 2) {
			if (x < 4) {
		System.out.println(10);
			} else {
			System.out.println(8);
			}
		} else {
			System.out.println(7);
		}
		
		System.out.println("n");
	}

}
