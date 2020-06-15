//Anthony Catalano, 6/15, Exercise 7-15: Modifying assignment 7-9 to remove duplicate numbers from the array.
//Importing the necessary Java utilities
import java.util.Scanner;
import java.util.Arrays;

class Exercise7dash15 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Setting an array, and inserting provided inputs into the array
		int[] array = new int[10];
		int uniqueNumber = 0;
		System.out.print("Please enter 10 numbers, separated by a space: ");
		for (int i = 0; i < array.length; i++)
		array[i] = input.nextInt();
		int[] arrayFour = eliminateDuplicates(array);
		System.out.println("The array without duplicates is: ");
		for (int x = 0; x < arrayFour.length; x++) {
			System.out.print(arrayFour[x] + " ");
		}
		System.out.println(" ");
		System.out.println("and the number of unique numbers is " + arrayFour.length);
	}
	//Create a method to mark duplicate numbers as a 0, then return an array
	public static int[] eliminateDuplicates(int[] array) {
		int[] arrayTwo = new int[array.length];
		int tempIndex = 0;
		boolean isUnique = true;
		for (int x = 0; x < array.length; x++) {
			for (int y = (x + 1); y < array.length; y++) {
				if (array[x] == array[y]) {
					isUnique = false;
				}
			}
			if (isUnique) {
				arrayTwo[tempIndex] = array[x];
				tempIndex++;
			}
			isUnique = true;
		}
		//Create third array
		int[] arrayThree = new int[tempIndex];
		for (int i = 0; i < tempIndex; i++) {
			arrayThree[i] = arrayTwo[i];
		}
		return arrayThree;
	}
}