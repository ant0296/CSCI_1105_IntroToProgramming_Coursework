//Anthony Catalano, 3/3, Exercise 3-3: Writing a prgram to find the value of x & y through linear equation.
import java.util.Scanner;
//Import the scanner

class Xandy {
	public static void main(String[] args) {
		//Declare the variables used in the calculation
		Scanner input = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		double x = 0;
		double y = 0;
		double topX = 0;
		double topY = 0;
		double adbc = 1;
		System.out.println("What is the value of a? ");
		a = input.nextDouble();
		System.out.println("What is the value of b? ");
		b = input.nextDouble();
		System.out.println("What is the value of c? ");
		c = input.nextDouble();
		System.out.println("What is the value of d? ");
		d = input.nextDouble();
		System.out.println("What is the value of e? ");
		e = input.nextDouble();
		System.out.println("What is the value of f? ");
		f = input.nextDouble();
			adbc = (a * d) - (b * c);
			if (adbc == 0) {
				System.out.println ("I cannot divide by zero, so there is no solution.");
			}
			else {
				topX = (e * d) - (b * f);
				topY = (a * f) - (e * c);
				x = topX / adbc;
				y = topY / adbc;
				System.out.println ("X equals " + x + ", and Y equals " + y + ".");}
		}
}