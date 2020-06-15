//Anthony Catalano, 6/15, Exercise 8-37: Using a two-dimensional array to create a State/Capital quiz
import java.util.Scanner;
import java.util.Arrays;

class StatesAndCapitals {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		String[][] quiz = {
			{"Alabama", "Alaska", "Arizona", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii"},
			{"montgomery", "juneau", "phoenix", "sacramento", "denver", "hartford", "dover", "tallahassee", "atlanta", "honolulu"}
		};
		int x = 0;
		int y = 1;
		int correct = 0;
		String answer = " ";
		System.out.println("Welcome to an admittedly simple state capital quiz! Let's get started, shall we?");
		while (x != 10) {
			System.out.println("What is " + quiz[0][x] + "'s capital? ");
			answer = input.next().toLowerCase();
			if (answer.equals(quiz[y][x])) {
				System.out.print("Correct!");
				System.out.println(" ");
				correct++;
			}
			else {
				System.out.print("Nope, incorrect. ");
				System.out.println(" ");
			}
			x++;
		}
		System.out.println("And that's the end. Congrats, you got " + correct + " correct!");
	}
}