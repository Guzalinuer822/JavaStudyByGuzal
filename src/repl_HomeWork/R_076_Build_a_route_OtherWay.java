package repl_HomeWork;

import java.util.Scanner;

public class R_076_Build_a_route_OtherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    String move = "";
	
	do {
		
		if(start.equals("A") && start.equals(end)){
	
	    		move = move + end + " found";
	    		
	    		break;
	    		
	    	}else if(start.equals("A") && !start.equals(end)){
	    		
	      move = move + "right > ";
	      
	      start = "B";
	    	}
	    
	    if(start.equals("B") && start.equals(end)){
	    	
	    		move = move + end + " found";
	    		
	    		break;
	    		
	    	}else if(start.equals("B") && !start.equals(end)){
	    		
	      move = move + "down > ";
	      
	      start = "C";
	    	}	
	    	
	    if(start.equals("C") && start.equals(end)){
	    	
	    		move = move + end + " found";
	    		
	    		break;
	    		
	    	}else if(start.equals("C") && !start.equals(end)){
	    		
	      move = move + "left > ";
	      
	      start = "D";
	    	}
	    	
	    if(start.equals("D") && start.equals(end)){
	    	
	    		move = move + end + " found";
	    		
	    		break;
	    		
	    	}else if(start.equals("D") && !start.equals(end)){
	    		
	      move = move + "up > ";
	      
	      start = "A";
	    	
	    }
	   
	}
	 
	while(true);
	
	System.out.println(move);
	
	scan.close();
	
	}

}
