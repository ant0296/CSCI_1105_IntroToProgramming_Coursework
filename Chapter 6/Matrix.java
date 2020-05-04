//Anthony Catalano, 5/4, assignment 6-17, displaying a matrix given a variable size
import java.util.Scanner;
//Import the scanner
		class Matrix {
			public static void main(String[] args) {
//Set up the scanner, define and setting variables used, asking for input
			Scanner input = new Scanner(System.in);
				int a = 0;
				int n = 0;
				int matrixLength = 0;
				System.out.println ("Please provide a number to build the matrix: ");
				n = input.nextInt();
//Set up a loop for displaying the length of matrix, calling the method 
				do {
					 printMatrix (a, n);
					 matrixLength++;
					 System.out.print("\n");
					} while (matrixLength < n);

	}
//Defining the method used
			private static void printMatrix(int a, int n) {
			int matrixWidth = 0;
				do {
				double b = Math.random();
				if (b >= .5) {
					a = 0;
					System.out.print(a);
					 matrixWidth++;
					}
				else {a = 1;
					System.out.print(a);
					matrixWidth++;
					}
				} 
			while (matrixWidth != n);
			}

}
