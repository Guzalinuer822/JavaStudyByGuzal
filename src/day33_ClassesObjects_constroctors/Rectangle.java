package day33_ClassesObjects_constroctors;

public class Rectangle {
	double length;
	double width;
	
	
	//default constructor
	public Rectangle() {
		System.out.println("Default constructor");
	}
	//creating constructor- i want to initialize my object variables thru constructor
	public Rectangle(double l,double w) {
		length = l;
		width = w;
	} 
	
	
	public void getArea() {
		System.out.println(length*width);
	}
}