package day13_Method;

public class CreditCardMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salary = 50000;
		int creditRating = 5;
		if (salary >= 20000 && creditRating >= 7) {
			qualify();
		} else {
			noQualify();
		}
	}

	public static void qualify() {
		System.out.println("I am sorry, you are not qualified. for the Credit Card.");
	}

	public static void noQualify() {
		System.out.println("Congrats, you are qualified. for the Credit Card.");
	}

}
