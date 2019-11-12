package day34_Constructor_Encapsulation;

public class Light {

	int noOfwatts;
	boolean indicator;
	String location;

	public Light() {

		this(0, false);

		System.out.println("Returning from constructor no.1");

	}

	public Light(int noOfwatts, boolean indicator) {
		this(noOfwatts, indicator, "X");

		System.out.println("Returning from construtor no.2");
	}

	public Light(int noOfwatts, boolean indicator, String location) {

		this.noOfwatts = noOfwatts;
		this.indicator = indicator;
		this.location = location;

		System.out.println("Returning from constructor no.3");
	}

}
