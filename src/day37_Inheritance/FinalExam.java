package day37_Inheritance;

public class FinalExam extends GradeActivity {
	
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	
	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		
		this.numQuestions=numQuestions;
		this.numMissed=numMissed;
		
		pointsEach=100.0/numQuestions;
		numericScore=100-(numMissed*pointsEach);
		
		setScore(numericScore);  // if you write just this, it will give the error, 
		                         // because setScore() is in another class,so I have to inherited from super class
		                         // so i inherited and write: public class FinalExam extends GradeActivity
		
		
	}

}
