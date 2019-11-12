package repl_HomeWork;

import java.util.Scanner;

public class R_076_Build_a_route_withLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String start = scan.next();
		    String end = scan.next();
		    
		   if(start.equalsIgnoreCase(end)) {
					 System.out.println(start + " found");
					 return;
				 }
				 
				
				 
			  a: switch (start) {
				 case "A":
					switch (end) {
					case "B":
						System.out.println("right: " + end + " found");
						break a ;
					case "C":
						System.out.println("right > down: " + end + " found");
						break a;
					case "D":
						System.out.println("right > down > left: " + end + " found");	
						break a;
					default:
						System.out.println();
					}
				 case "B":
					switch (end) {
					case "C":
						System.out.println("down: " + end + " found");
						break a ;
					case "D":
						System.out.println("down > left: " + end + " found");
						break a;
					case "A":
						System.out.println("down > left > up: " + end + " found");	
						break a;
					}
				 case "C":
					switch (end) {
					case "D":
						System.out.println("left: " + end + " found");
						break a ;
					case "A":
						System.out.println("left > up: " + end + " found");
						break a;
					case "B":
						System.out.println("left > up > right: " + end + " found");	
						break a;
					}	
				case "D":
					switch (end) {
					case "A":
						System.out.println("up: " + end + " found");
						break a ;
					case "B":
						System.out.println("up > right: " + end + " found");
						break a;
					case "C":
						System.out.println("up > right > down: " + end + " found");	
						break a;
					}
			  }	
				 
				 scan.close();
	}

}
