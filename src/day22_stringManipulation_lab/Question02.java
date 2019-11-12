package day22_stringManipulation_lab;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
makeAbba("Hi", "Bye");

System.out.println(makeAbba("Hi", "Bye"));
	}
public static String makeAbba(String a, String b) {
	
	String add=a+b+b+a;
	return add;
}
}
