package day40_methodHiding_Composition;

public class Bed {

	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilts;
	
	
	public void make() {
		System.out.println("Bed --> Making");
	}


	public Bed(String style, int pillows, int height, int sheets, int quilts) {
		super();
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilts = quilts;
	}


	public String getStyle() {
		return style;
	}


	public int getPillows() {
		return pillows;
	}


	public int getHeight() {
		return height;
	}


	public int getSheets() {
		return sheets;
	}


	public int getQuilts() {
		return quilts;
	}


	
	
	
}
