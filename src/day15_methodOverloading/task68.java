package day15_methodOverloading;

public class task68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		yearsUntilRetirement("Mike",1950);
		
	}
			
			
			public static void yearsUntilRetirement(String name,int year) {  //name=MiKE  year=1950
				
				 //retirement age = 65 - age
				
				int retiremenAge = 65 - calculateAge(year);
				
				System.out.println(name  + " retires in " + retiremenAge + " years");
				
				
				
			}
			
			
			public static int calculateAge(int yearBirth) {
				
				return 2019-yearBirth;
				
			}
			
			
			// task 70   check git hub or kalbi for answer
			
			public static void displayHighScorePositions(String name,int position) {System.out.println(name + " managed to get into position.");
			System.out.println(position + " ont he high score table.");}
			
			public static void calculateHighScorePositions(int player_score) { if(player_score>=1000)return ;}
		
}