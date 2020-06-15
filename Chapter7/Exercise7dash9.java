//Anthony Catalano, 6/3, Exercise 7-9: Displaying the smallest number of provided inputs using an array.
//Importing the necessary Java utilities
import java.util.Scanner;
import java.util.Arrays;

class Exercise7dash9 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Setting an array, and inserting provided inputs into the array
		double[] array = new double[10];
		System.out.print("Please enter 10 numbers, separated by a space ");
		for (int i = 0; i < array.length; i++)
		array[i] = input.nextDouble();
		System.out.println("The smallest number provided was " + min(array));
		}
	//Create a method to find the smallest number, and return
	public static double min(double[] array) {
		double minimum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimum) minimum = array[i]; 
			}
		return minimum;
	}
}