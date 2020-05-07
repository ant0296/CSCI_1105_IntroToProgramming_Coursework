//Anthony Catalano, 5/5, assignment 6-17, displaying a matrix given a variable size
import java.util.Scanner;
//Import the scanner
		class Matrix {
			public static void main(String[] args) {
//Set up the scanner, define and setting variables used, asking for input
			Scanner input = new Scanner(System.in);
				int n = 0;
				System.out.println ("Please provide a number to build the matrix: ");
				n = input.nextInt();
				printMatrix(n);
			}
//Defining the method, used to print the matrix
			public static void printMatrix(int n) {
				int a = 0;
				while (a < n) {
					int b = 0;
					int d = 0;
					while (b < n) {
					double c = Math.random();
						if (c < .5) {
							d = 0;
							System.out.print(d + " ");
					}
						else {d = 1;
						System.out.print(d + " ");
					}
				b++;
				}
			System.out.print("\n");
				a++;
				}
			}
	}