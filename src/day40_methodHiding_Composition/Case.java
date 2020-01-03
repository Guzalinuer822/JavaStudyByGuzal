package day40_methodHiding_Composition;

public class Case {
	
	private String model;
	private String manufacture;
	private String powerSupply;
	private Dimensions dimensions;
	
	public void pressPowerButton() {
		System.out.println("Power button is pressed");
	}

	public Case(String model, String manufacture, String powerSupply, Dimensions dimensions) {
		
		this.model = model;
		this.manufacture = manufacture;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}

	
	public String getModel() {
		return model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

}
