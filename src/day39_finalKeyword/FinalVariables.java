package day39_finalKeyword;

public class FinalVariables {
	
	
	public final int ROADSTER_MAX_RANGE=600;
	public final int MODEL_3_MAX_SPEED;   // if you don't initialize here , you have to initialize in constructor
	public final int MAX_X_PASSENGERS;
	
	// public static final String ADMIN_USERNAME;   // have to initialize here or initialize in static block
	                                             // becuase it is static, it will loaded when class loaded, so before 
	                                             // object creation this does not existed.
	
	
	public FinalVariables() {
		MODEL_3_MAX_SPEED=190;   // here have to initialize MODEL_3_MAX_SPEED
	}

	
	
	public FinalVariables(int num) {
		MODEL_3_MAX_SPEED=num;   
		
	}
	
	{
		
		
		MAX_X_PASSENGERS=7;
		
		
	}
	
	public static void main(String[] args) {
		
		final int Max_PASSENGERS_COUNT=5;   // you cannot change it, because it is final;
		
		final  double PI=3.14;  // this is local variable
		
		FinalVariables finalVars=new FinalVariables();
		
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		
		

	}

}
