package day40_methodHiding_Composition;

public class MotherBoard {
	
	private String model;
	private String manufacture;
	private int ramSlots;
	private int carSlots;
	private String bios;
	
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is loading");
	}

	public MotherBoard(String model, String manufacture, int ramSlots, int carSlots, String bios) {
		
		this.model = model;
		this.manufacture = manufacture;
		this.ramSlots = ramSlots;
		this.carSlots = carSlots;
		this.bios = bios;
	}

	public String getModel() {
		return model;
	}



	public String getManufacture() {
		return manufacture;
	}

	

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCarSlots() {
		return carSlots;
	}


	public String getBios() {
		return bios;
	}

	
	
	

}
