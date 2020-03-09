//Anthony Catalano, 3/9, Exercise 4-1: Computing the area of a pentagon, given how far one vertex is from the center
import java.util.Scanner;
//Import the scanner

class Areaofpentagon {
	public static void main(String[] args) {
		//Define our variables
		Scanner input = new Scanner(System.in);
		double A = 0.0;
		double S = 0.0;
		double R = 0.0;
		double Pibyfive = 0.0;
		System.out.println("How far is the center from a vertex? ");
		R = input.nextDouble();
		//Performing the math, starting with setting what pi/5 equals
		Pibyfive = Math.PI / 5;
		S = R * 2 *(Math.sin(Pibyfive));
		A = Math.pow (S, 2) * 5 / (4 * (Math.tan(Pibyfive)));
		//Finally, print the output
		System.out.println("The area of this pentagon is: " + A);
	}
}