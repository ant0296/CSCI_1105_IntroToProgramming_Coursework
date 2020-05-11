//Anthony Catalano, 5/11, assignment 6-37, displaying a string with a given length and number
//Import the scanner before running the main program
import java.util.Scanner;
public class SixdashThirtyseven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Initialize variables, and ask for input
		int number, width;
		System.out.println ("Please input a number, and how long you'd like the new number to be.");
		System.out.println ("Note that if the desired length is less than the length of the first number, the number will be returned with nothing added to it.");	
		number = input.nextInt();
		width = input.nextInt();
		//Send inputs to the method, and assign a variable to receive the result
		String newNumber = format(number, width);
		System.out.println ("Your new number is " + newNumber);
	}
	
	//The first method, to determine how many extra zeros to place on the number.
	public static String format(int number, int width) {		
		int zeroCount = 0;
		String extraZeros = "";
		int length = digit(number);
		zeroCount = (width - length);
		while (zeroCount > 0) {
			extraZeros = ("0" + extraZeros);
			zeroCount--;
		}
		extraZeros = (extraZeros + number);
		return extraZeros;
	}
	
	//The second method, used to determine how many places the first number provided is.)
	public static int digit (int number) {
		int digitCount = 0;
		int temp = number;
		while (temp > 0) {
			temp /= 10;
			digitCount++;
		}
		return digitCount;
	}
}
