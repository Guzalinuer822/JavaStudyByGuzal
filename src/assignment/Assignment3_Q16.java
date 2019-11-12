package assignment;

public class Assignment3_Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 1;
		int end = 11;
		String print="";
				
		while (start <= end) {
		    if(start % 2 != 0){
		        print=print+start;
		        //Logic to add comma
		        if(end % 2 == 0){ //If end is an even number
		            if(start != (end - 1)) { //check to not add , after printing last number
						print=print+", ";
		            }
		        } else { //If end is an odd number
						if(start != end) { //check to not add , after printing last number
						    print=print+", ";
						}
		        }
		    }
		    start++;
		}
		
		System.out.println(print);
	}

}
