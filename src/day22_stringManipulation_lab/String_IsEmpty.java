package day22_stringManipulation_lab;

public class String_IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String userName="";
String password="";

if(userName.isEmpty()) {System.out.println("username cannot be empty");}
else {System.out.println("username is not empty");}

if(userName.isEmpty() || password.isEmpty()) {System.out.println("username or password cannot be empty");}
else {System.out.println("username or password is not empty");}

	}

}
