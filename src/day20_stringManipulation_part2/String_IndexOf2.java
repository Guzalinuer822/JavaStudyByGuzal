package day20_stringManipulation_part2;

public class String_IndexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// index of with 2 value
		
		String list="html-selenium-angular-jenkins-grid";
		
		int firstDash=list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash=list.indexOf("-", 5) ; // will choose indexOf(ch, fromIndex)----is method overloading;
		System.out.println(secondDash);

		
		int thirdDash=list.indexOf("-", secondDash+1);  // secondDash+1 ----in this way i don't need to count the position;
		
		System.out.println(thirdDash);
		
		int lastDash=list.lastIndexOf("-");
		System.out.println(lastDash);
	}

}
