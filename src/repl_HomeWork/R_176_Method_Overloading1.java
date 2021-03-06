package repl_HomeWork;

/*
In this task, you need to write 2 methods findMax() that will 
find a maximum number in the array. First method should work 
with array of integers (int[]) and return int, and second method 
should work with an array of doubles (double[]) and return 
double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */
public class R_176_Method_Overloading1 {

	// WRITE YOUR CODE HERE

	public int findMax(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public double findMax(double[] arr) {
		double max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
