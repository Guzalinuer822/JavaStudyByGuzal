package day14_MethodPractice;

public class ValueReturn {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		double d = distanceOzzy(40, 5);

		System.out.println(d);

		if (d > 500) {
			System.out.println("you spent too much gas");
		} else {
			System.out.println("you spent ok gas");
		}
	}

	public static double distanceOzzy(double speed, int time) {

		double distanceTraveled = speed * time;

		return distanceTraveled;
	}

	public static double distance(double speed, double time) {
		double distance = speed * time;
		return distance;
	}

	public static void sum(int num1, int num2) {
		int result;
		result = num1 + num2;
		System.out.println(result);
	}

}
