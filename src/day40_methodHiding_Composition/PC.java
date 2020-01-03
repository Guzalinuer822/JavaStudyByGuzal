package day40_methodHiding_Composition;


/*
 * 
 * 
 *             MotherBoard
 * 
 * 
 * 
 * PC         Monitor            Resolution
 * 
 * 
 * 
 *            Case               Dimensions
 *            
 *            
 * 
 */
public class PC {
	
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherBoard;
	
	
	public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
		
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}


	public Case getTheCase() {
		return theCase;
	}


	public Monitor getMonitor() {
		return monitor;
	}


	public MotherBoard getMotherBoard() {
		return motherBoard;
	}
	
	
	
	
	

}
