//Anthony Catalano, 3/3, Exercise 3-19: Writing a prgram to find the perimeter of a triangle
	import java.util.Scanner;
//Import the scanner

class Triangle {
	public static void main(String[] args) {
		//Declare variables like before
		Scanner input = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double perimeter = 0;
		System.out.println("What is the value of a? ");
		a = input.nextDouble();
		System.out.println("What is the value of b? ");
		b = input.nextDouble();
		System.out.println("What is the value of c? ");
		c = input.nextDouble();
		
		if ((a + b > c) && (b + c > a) && (c + a > b)) {
				perimeter = a + b + c;
				System.out.println ("The perimeter of this triangle is: " + perimeter);
				}
		
		else {
			System.out.println ("Something here doesn’t add up… Try again with different numbers.");}
		}
}