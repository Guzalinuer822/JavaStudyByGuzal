package day20_stringManipulation_part2;

import java.util.Scanner;

public class Task82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String Correct_username = "guzal";
		String Correct_password = "hi123";

		System.out.println("Enter your username and password:");

		String username = scan.nextLine();
		String password = scan.nextLine();

		

		if (username.equals("") && password.equals("")) {
			System.out.println("Username and password fields cannot be empty.");
		}

		else if (username.equals("") && !password.equals("")) {
			System.out.println("username cannot be empty.");
		}

		else if (password.equals("") && !username.equals("")) {
			System.out.println("password cannot be empty.");
		}

		else if (!username.equals(Correct_username) || !password.equals(Correct_password)) {
			System.out.println("username or password not valid, please verify.");
		}
		else if (username.equals(Correct_username) && password.equals(Correct_password)) {
			System.out.println("user logged in successfully.");
		}

		// This one is from Ozzy
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("Enter your username:"); String userName = sc.nextLine();
		 * 
		 * System.out.print("Enter your password:"); String password = sc.nextLine();
		 * 
		 * String userNameInSystem = "Mike"; String passwordInSystem = "123";
		 * 
		 * if(userName.equals("") && password.equals("")) {
		 * System.out.println("Username and password fields can not be empty"); }else
		 * if(userName.equals("") && !password.equals("")){
		 * System.out.println("Username can not be empty"); }else
		 * if(!userName.equals("") && password.equals("")) {
		 * System.out.println("Password can not be empty"); }else
		 * if(!userName.equals(userNameInSystem) || ! password.equals(passwordInSystem))
		 * { System.out.println("Username or password not valid,please verify"); }else
		 * if(userName.equals(userNameInSystem) && password.equals(passwordInSystem)) {
		 * System.out.println("User logged in  successfully");
		 * 
		 * }
		 */
		
		scan.close();
	}

}
