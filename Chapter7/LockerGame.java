//Anthony Catalano, 6/9, Exercise 7-23: Solving a puzzle, "what lockers are open?"
//Disclaimer, I did most of this, Rocky helped a lot. I was using if loops instead of for loops

import java.util.Arrays;

class LockerGame {
	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		int studentShuffler = 0;
		for (int student = 1; student <= lockers.length; student++) {
			for (int l = student - 1; l < lockers.length; l += student) {
				lockers[l] = !lockers[l];
			}
		}
		System.out.println("The open lockers are: ");
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i] == true) {
				System.out.println(i + 1); 
			}
		}
	}
}