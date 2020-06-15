//Anthony Catalano, 6/10, Exercise 8-5: Adding two matrices together, and displaying the sums as a matrix.
import java.util.Scanner;
import java.util.Arrays;

class AddingMatrices {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[][] matrixOne = new double[3][3];
		double[][] matrixTwo = new double[3][3];
		double[][] matrixThree = new double[3][3];
		System.out.println("Please provide 9 numbers: ");
		for (int y = 0; y < matrixOne.length; y++)
			for (int x = 0; x < matrixOne[y].length; x++)
			matrixOne[y][x] = input.nextDouble();
		System.out.println("Now provide 9 more numbers. Order is important, as each number will be added to the number in the same place as the one provided before: ");
		for (int y = 0; y < matrixTwo.length; y++)
			for (int x = 0; x < matrixTwo[y].length; x++)
			matrixTwo[y][x] = input.nextDouble();
		matrixThree = addMatrix(matrixOne, matrixTwo);
		System.out.println("The sums of your provided numbers are as follows: ");
		for (int b = 0; b < matrixThree.length; b++) {
			System.out.println(" ");
			for (int a = 0; a < matrixThree[b].length; a++) {
				System.out.print(matrixThree[b][a] + " ");
			}
		}
	}
	public static double[][] addMatrix(double[][]matrixOne, double[][]matrixTwo) {
		double[][] matrixFour = new double[3][3];
		for (int j = 0; j < matrixFour.length; j++) {
			for (int i = 0; i < matrixFour[j].length; i++) {
				matrixFour[j][i] = (matrixOne[j][i] + matrixTwo[j][i]);
			}
		}
	return matrixFour;	
	}
}