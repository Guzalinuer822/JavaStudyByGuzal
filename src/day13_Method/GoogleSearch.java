package day13_Method;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		compare();
	}

	public static void convertKM() {
		double km, mile;
		km = 15;
		mile = 1.60934 * km;
		System.out.println(mile + " mile= " + km + " Km");
	}

	public static void sum() {
		int num1, num2, num3, sum;
		num1 = 4;
		num2 = 6;
		num3 = 0;
		sum = num1 + num2 + num3;
		System.out.println(sum);
	}

	public static void compare() {
		int n1, n2;
		n1 = 8;
		n2 = 90;
		if (n1 > n2) {
			System.out.println("n1= " + n1 + " is greater than n2= " + n2);
		} else {
			
				System.out.println("n2= " + n2 + " is greater than n1= " + n1);
			
		}
	}

}
