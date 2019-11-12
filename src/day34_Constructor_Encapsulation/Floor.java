package day34_Constructor_Encapsulation;

public class Floor {

	double width;
	double length;

	public Floor(double width, double length) {

		if (width < 0) {
			this.width = 0;
		}

		else if (length < 0) {
			this.length = 0;
		}

		this.width = width;
		this.length = length;

	}

	public double getArea() {
		return width * length;
	}

}
