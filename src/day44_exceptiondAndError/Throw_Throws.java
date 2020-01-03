package day44_exceptiondAndError;

public class Throw_Throws {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
	//	throw new  RuntimeException("this is thrown throw keyword");
		
	//	throw new Exception();   this will give error
		
		String username="user01";
		
		if(username.isEmpty()) {
			throw new RuntimeException("Username cannot be empty");
		}else {
			System.out.println("Valid username");
		}
		

	}
	
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);  // we defclare exception , but did not handle the exception
	}

	public static void sleep3(int seconds) {   // in this we handle the exception
		try {
			sleep2(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
