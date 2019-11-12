package day14_MethodPractice;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringTimes("Hi", 2);
		stringTimesOzzy("Hi", 3);

		System.out.println("---------------------------");

		love6(1, 5);
		love6Ozzy(12, 6);

		System.out.println("---------------------------");

		specialEleven(45);

		System.out.println("---------------------------");

		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true);

		deerPlayOzzy(70, false);
		deerPlayOzzy(95, false);
		deerPlayOzzy(95, true);

		System.out.println("---------------------------");

		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);

		
		caughtSpeedingOzzy(60, false);
		caughtSpeedingOzzy(65, false);
		caughtSpeedingOzzy(65, true);


		System.out.println("---------------------------");

		cigarPartyOzzy(30, false);
		cigarPartyOzzy(50, false);
		cigarPartyOzzy(70, true);

	}

	// question 1
	public static void stringTimes(String hi, int n) {
		int i = 1;
		while (i <= n) {
			System.out.print(hi);
			i++;
		}
		System.out.println();

	}

	// question 1 Ozzy
	public static void stringTimesOzzy(String string, int number) {
		String str = "";
		for (int i = 0; i < number; i++) {
			str = str + string;
		}
		System.out.println(str);
	}

	// Question 2
	public static void love6(int num1, int num2) {

		if (num1 == 6 || num2 == 6) {
			System.out.println("True");
		} else if ((num1 + num2) == 6 || (num1 - num2) == 6) {
			{
				System.out.println("True");
			}
		} else {
			System.out.println("false");
		}

	}

	// Question 2 Ozzy
	public static void love6Ozzy(int num1, int num2) {

		if (num1 == 6 || num2 == 6 || num1 + num2 == 6 || num1 - num2 == 6 || num2 - num1 == 6) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	// question 3

	public static void specialEleven(int num) {
		if ((num % 11 == 0) || ((num - 1) % 11 == 0)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// question 4
	public static void deerPlay(int temp, boolean isSummer) {

		if (temp >= 60 && temp <= 90) {
			System.out.println("True");
		} else if ((temp >= 60 && temp <= 100) && (isSummer == true)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	// question 4 Ozzy

	public static void deerPlayOzzy(int temp, boolean isSummer) {

		if (isSummer) {
			if (temp > 60 && temp < 100) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if (temp > 60 && temp < 90) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}

		}

	}

	// Question 5

	public static void caughtSpeeding(int speed, boolean birthday) {

		int ticket;
		ticket = 0;

		if (birthday == false) {
			if (speed <= 60) {
				ticket = 0;
				System.out.println(ticket);
			}
			if (speed >= 61 && speed < 80) {
				ticket = 1;
				System.out.println(ticket);
			} else if (speed >= 81) {
				ticket = 2;
				System.out.println(ticket);
			}

		}

		if (birthday == true) {
			if (speed <= 65) {
				ticket = 0;
				System.out.println(ticket);
			}
			if (speed >= 66 && speed < 85) {
				ticket = 1;
				System.out.println(ticket);
			} else if (speed >= 86) {
				ticket = 2;
				System.out.println(ticket);
			}

		}

	}
	
	
	// Question 5 Ozzy
	
	public static void caughtSpeedingOzzy(int speed, boolean isBirthday) {
		
		
		if(isBirthday) {
			if(speed<=65) {
				System.out.println(0);
			}else if(speed>=66 && speed <=85) {
				System.out.println(1);
			}else if(speed>=86) {
				System.out.println(2);
			}
		}else {
			if(speed<=60) {
				System.out.println(0);
			}else if(speed>=61 && speed <=80) {
				System.out.println(1);
			}else if(speed>=81) {
				System.out.println(2);
			}
		}
		
	}






	// Question 6 kalbi


	
	
	// Question 6 Ozzy 
	
	
	public static void cigarPartyOzzy(int numberCigar, boolean isWekeend) {

		if(isWekeend) {
			if(numberCigar>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(numberCigar>=40 && numberCigar<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}
		
	}
		
	
}
