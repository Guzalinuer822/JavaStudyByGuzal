package day12_controlFlowStatement;

public class breakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		int number = 0;
		while (number < 15) {
			number++;
			if (number <= 5) {
				System.out.println("Skipping number" + number);
				continue;
			}
			System.out.println("number= " + number);
			if ((number >= 10)) {
				System.out.println("Breaking at " + number);
				break;
			}
		}
	}

}
