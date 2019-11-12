/*
Hypertext Markup Language (HTML) is the standard markup language for 
creating web pages and web applications. HTML is the language in which 
most websites are written. HTML is used to create pages and make them functional.


Write a program, that will read html variable and output attribute value 
of id attribute (tag) into the console. Input will be provided in a single 
line as outlined below. If html variable doesn't contain <html> attribute, 
print out into the console message: "Invalid input!". 

Example: 
input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
output: myid
 */

package repl_HomeWork;

import java.util.Scanner;

public class R_094_Parse_HTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		if (!html.contains("<html>")) {
			System.out.println("Invalid input!");
		}

		else if (html.contains("<html>")) {

			String[] array = html.split("id=\"");

			int quoteIndex = array[1].indexOf("\"");

			String attributeValue = array[1].substring(0, quoteIndex);

			System.out.println(attributeValue);
		}
		
		scan.close();
	}

}
