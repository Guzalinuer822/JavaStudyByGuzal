package day40_methodHiding_Composition;

public class Lamp {

	private String style;
	private boolean battery;
	private int globalRating;
	
	public void turnOn() {
		System.out.println("Lamp --> truned on");
	}

	public Lamp(String style, boolean battery, int globalRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globalRating = globalRating;
	}

	public String getStyle() {
		return style;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getGlobalRating() {
		return globalRating;
	}
	
	
}
