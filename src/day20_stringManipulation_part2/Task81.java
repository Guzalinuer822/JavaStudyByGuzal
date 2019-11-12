package day20_stringManipulation_part2;

public class Task81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// by me
		timeStamp("10/10/2019 14:59:00");

		// by Ozzy
		String timeOzzy = "10/01/2019 15:42:00";

		System.out.println(timeStampOzzy(timeOzzy));

	}

	public static void timeStamp(String date) {

		date = date.replace("/", "").replace(" ", "").replace(":", "");
		System.out.println(date);
	}
	
	// Ozzy's method , should learn in this way

	public static String timeStampOzzy(String timeOzzy) {

		timeOzzy = timeOzzy.replace("/", "").replace(":", "").replace(" ", "");

		return timeOzzy;

	}

}
