//Anthony Catalano, 6/16, Exercise 8-9: Making a basic Tic-Tac-Toe game
import java.util.Scanner;
import java.util.Arrays;

class TicTacToe {
	public static void main(String[] args) {
		String[][] gameBoard = {
			{"-", "-", "-"},
			{"-", "-", "-"},
			{"-", "-", "-"}
		};
		boolean isFilled = false;
		String player = "o";
		System.out.println("Let's play a game of Tic-Tac-Toe, shall we? Here is the board to begin.");
		gameBoard = displayBoard(gameBoard);
		System.out.println("\n" + "\n" + "Alright, let's get to it!");
		while (isFilled == false) {
			gameBoard = playPiece(gameBoard, player);
			if (player.equals("x")) {
				player = "o";
			}
			else if (player.equals("o")) {
				player = "x";
			}
			isFilled = fillCheck(gameBoard);
		}
		System.out.print("\n" + "Thanks for playing!");
	}
	public static String[][] displayBoard(String[][]gameBoard) {
		for (int y = 0; y < gameBoard.length; y++) {
			System.out.println(" ");
			for (int x = 0; x < gameBoard[y].length; x++) {
				System.out.print(gameBoard[y][x] + " ");
			}
		}
		return gameBoard;
	}
	public static String[][] playPiece(String[][]gameBoard, String player) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean playerCheck = false;
		int row = 0;
		int column = 0;
		do {
			playerCheck = false;
			System.out.print("Please input two numbers, in row/column form, to place an " + player + ": ");
			row = (input.nextInt() - 1);
			column = (input.nextInt() - 1);
			if (gameBoard[column][row].contains("x") || gameBoard[column][row].contains("o")) {
				playerCheck = true;
				System.out.println("That spot is already taken by an " + gameBoard[column][row] + ", try another spot.");
			}
			else {
			gameBoard[column][row] = player;
			}
			gameBoard = displayBoard(gameBoard);
		} while (playerCheck == true);
		return gameBoard;
	}
	public static boolean fillCheck(String[][]gameBoard) {
		boolean filled = true;
		String key = "-";
		for (int a = 0; a < gameBoard.length; a++) {
			for (int b = 0; b < gameBoard[a].length; b++) {
				if (gameBoard[b][a].contains(key)) {
					filled = false;
				}
			}
		}
		return filled;
	}
}