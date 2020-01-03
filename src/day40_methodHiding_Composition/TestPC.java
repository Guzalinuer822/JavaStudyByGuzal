package day40_methodHiding_Composition;

public class TestPC {

	public static void main(String[] args) {
		
		
		Dimensions dimensions=new Dimensions(20,20,5);
		
		Case theCase=new Case("220B", "Dell","240",dimensions);
		
		
		
		Monitor theMonitor=new Monitor("27 int beast", "Acer",27, new Resolution(2540,1440));
		
		MotherBoard theMotherBoard=new MotherBoard("bj-200", "Asus", 4, 6, "v.2.44");
		
		PC thePC=new PC(theCase,theMonitor,theMotherBoard);
		
		
		// how to access method? drawpixel from Monitor clss
		
		// any chance i can access to monitor object from PC class?
		
		thePC.getMonitor().drawPixel(1500, 1200, "red");
		
		// call loadProgram
		thePC.getMotherBoard().loadProgram("Windows");
		
		// call pressPowerButton
		thePC.getTheCase().pressPowerButton();
		
	}

}
