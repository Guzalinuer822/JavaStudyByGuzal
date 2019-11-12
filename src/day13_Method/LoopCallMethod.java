package day13_Method;

public class LoopCallMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from");
		for (int i = 0; i < 5; i++) {
			disPlayMessage();
			System.out.println("Back in the main ");
		}
	}

	public static void disPlayMessage() {
		System.out.println("Hello from disPlayMessage");
	}

}
