//Anthony Catalano, 6/22. Intro to programming capstone project: Expanding upon my Tic-Tac-Toe board
import java.util.Scanner;
import java.util.Arrays;

class TicTacTwo {
	public static void main(String[] args) {
	java.util.Scanner input = new java.util.Scanner(System.in);
		int size = 0;
		int gameCount = 0;
		boolean wins = false;
		boolean playAgain = false;
		boolean isFilled = false;
		boolean drawCount = false;
		String yesOrNo = " ";
		String player = "o";
		String winDisplay = " ";
		System.out.println("Let's play a game of Tic-Tac-Toe, shall we?");
		while (!playAgain) {	
			System.out.println("Would you like to be the X, or the O?");
			player = input.next().toLowerCase();
			System.out.println("Excellent. And how big of a board would you like to play on today?");
			size = input.nextInt();
			String[][] gameBoard = new String[size][size];
			//Fills the custom array with "-"
			for (int y = 0; y < gameBoard.length; y++) {
				for (int x = 0; x < gameBoard.length; x++) {
					gameBoard[y][x] = "-";
				}
			}
			gameBoard = displayBoard(gameBoard);
			System.out.println("\n" + "\n" + "Alright, let's get to it!");
			while (!isFilled) {
				gameBoard = playPiece(gameBoard, player);
				wins = winCheck (gameBoard, player, size);
				if (wins) {
					break;
				}
				
				if (player.equals("x")) {
					player = "o";
				}
				else if (player.equals("o")) {
					player = "x";
				}
				isFilled = fillCheck(gameBoard);
			}
			if (isFilled) {
				drawCount = true;
			}
			//End game text
			gameCount++;
			winDisplay = showWins(player, wins, drawCount);
			System.out.println("\n" + winDisplay + " You've played " + gameCount + " games so far.");
			System.out.println("Would you like to play again? Yes/No ");
			yesOrNo = input.next().toLowerCase();
			if (yesOrNo.equals("no")) {				
				System.out.println("Alright, see you around!");
				break;
			}
			else continue;
		}
	}
	//Prints out the current state of the board
	public static String[][] displayBoard(String[][]gameBoard) {
		for (int y = 0; y < gameBoard.length; y++) {
			System.out.println(" ");
			for (int x = 0; x < gameBoard[y].length; x++) {
				System.out.print(gameBoard[y][x] + " ");
			}
		}
		return gameBoard;
	}
	//Places pieces on the board, after ensuring the chosen space is available
	public static String[][] playPiece(String[][]gameBoard, String player) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean playerCheck = false;
		int row = 0;
		int column = 0;
		do {
			playerCheck = false;
			System.out.print("Please input two numbers, in column/row form, to place an " + player + ": ");
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
		} while (playerCheck);
		return gameBoard;
	}
	//Checks to see if the board is filled, indicating a tie
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
	//Checks if a winning move has been played
	public static boolean winCheck(String[][]gameBoard, String player, int size) {
		return (verticalCheck(gameBoard, player, size)) || (horizontalCheck(gameBoard, player, size)) || (diagonalCheck(gameBoard, player, size));
	}
	//Vertical check
	public static boolean verticalCheck(String[][]gameBoard, String player, int size) {
	int count = 0;
	String key = player;
	for (int a = 0; a < gameBoard[size - 1].length; a++) {
		for (int b = 0; b < gameBoard[a].length; b++) {
			if (gameBoard[b][a].contains(key)) {
				count++;
			}
		}
	}
	if (count == size) {
		return true;
	}
	else return false;
	}
	//Horizontal check
	public static boolean horizontalCheck(String[][]gameBoard, String player, int size) {
		int count = 0;
		String key = player;
		for (int a = 0; a < gameBoard.length; a++) {
			for (int b = 0; b < gameBoard[a].length; b++) {
				if (gameBoard[b][a].contains(key)) {
					count++;
				}
			}
		}
		if (count == size) {
			return true;
		}
		else return false;
	}
	//Diagonal check
	public static boolean diagonalCheck(String[][]gameBoard, String player, int size) {
	int count = 0;
	int diag = 0;
	String key = player;
	for (int a = 0; a < gameBoard.length; a++) {
			if (gameBoard[a][a].contains(key) || (gameBoard[diag][a].contains(key))) {
				count++;
				if (gameBoard[diag][a].contains(key)) {
					diag++;
				}
			}
		}		
	if (count == size) {
		return true;
	}
	else return false;
	}
	//Prints once a winner has been detected, or it's a draw
	public static String showWins(String player, boolean wins, boolean drawCount) {
		if (wins) {
			System.out.println("\nGood game, looks like " + player.toUpperCase() + " wins!");
		}
		if (drawCount) {	
			System.out.print("\nHm, looks like it's a draw. Well done, all.");
		}
		return ("Thanks for playing!");
	}
}
//Holy hell, this was much more difficult than I initially thought.