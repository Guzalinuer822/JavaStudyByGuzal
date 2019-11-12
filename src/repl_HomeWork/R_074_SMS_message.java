/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving

 */

package repl_HomeWork;

import java.util.Scanner;

public class R_074_SMS_message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	   int  bracket1=message.indexOf("<");
	   int  bracket2=message.indexOf(">");
	   
	   int  bracket3=message.indexOf("[");
	   int  bracket4=message.indexOf("]");
	   
	   int  bracket5=message.indexOf("{");
	   int  bracket6=message.indexOf("}");
	    
	   
	   sender=message.substring(bracket1+1, bracket2);
	   phoneNumber=message.substring(bracket3+1, bracket4);
	   messageBody=message.substring(bracket5+1, bracket6);
	   
	   System.out.println("Sender: " + sender);
	   System.out.println("Phone Number: " + phoneNumber);
	   System.out.println("Message body: " + messageBody);
	   
	   scan.close();
	}

}
