package day41_Abstraction;

public interface Electric {
	
	boolean flag=false;  // this will be automatically ----public static final

	public abstract void display();
	
	void charge();   // this will be automatically ---public abstract
}
