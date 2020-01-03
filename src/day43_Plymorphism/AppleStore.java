package day43_Plymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		AppleDevice mac=new Mac();
		
		mac.use();
	//	mac.code();  // this will give error, because parent decide which method can call
		             // reference type class decide which method can call
		             // if child overrided method it will run 
		            // if parent don't have specific method that child has ,it will give error

	}

}
