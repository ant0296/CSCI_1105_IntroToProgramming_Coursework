package ticTacTwo;

//Anthony Catalano, 6/22. Intro to programming capstone project: Expanding upon my Tic-Tac-Toe board
import java.util.Scanner;
import java.util.Arrays;
/**
 * <h1>Introduction to Programming, Capstone Project</h1>
 * <p>improving upon a previous project, a simple Tic-Tac-Toe board
 * 
 * <p>Created June 22nd, amended June 24th to include JavaDoc comments.</p>
 * 
 * @author Anthony Catalano
 */
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
				gameBoard = playPiece(gameBoard, player, size);
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
			if (yesOrNo.equals("no") || yesOrNo.equals("n")) {				
				System.out.println("Alright, see you around!");
				break;
			}
			else continue;
		}
	}
	/** This method, displayBoard, displays the current state of the board, from its initialization to one last time as a winner is detected.
	 * @param gameBoard An array, the board to be displayed.
	 * @return Will return the game board. 
	 */
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
	/**
	 * playPiece will allow you to place a piece on the board, will prevent a player from overwriting another piece, and return their turn back to them if they try.
	 * @param gameBoard The current board, is returned once updated.
	 * @param player The active player.
	 * @return Returns the board once an acceptable move is recognized.
	 */
	//Places pieces on the board, after ensuring the chosen space is available
	public static String[][] playPiece(String[][]gameBoard, String player, int size) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean playerCheck = false;
		int row = 0;
		int column = 0;
		do {
			playerCheck = false;
			System.out.print("Please input two numbers, in column/row form, to place an " + player + ": ");
			row = (input.nextInt() - 1);
			column = (input.nextInt() - 1);
			if ((row < 0) || (column < 0)) {
				playerCheck = true;
				System.out.println("Those coordinates aren't quite big enough to go on the board, try placing another piece.");
			}
			else if ((row >= size) || (column >= size)) {
				playerCheck = true;
				System.out.println("Those coordinates are a bit too big for this board, try another spot.");
			}
			else if (gameBoard[column][row].contains("x") || gameBoard[column][row].contains("o")) {
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
	/**
	 * The fillCheck method checks to see if the board is filled, that is, does not contain the default value assigned to it at initialization.
	 * @param gameBoard The game board.
	 * @param a int value, used to scan the array with 'b'.
	 * @param b int value, used to scan the array with 'a'.
	 * @return Returns true if there are no blank, or in this case, "-", values detected.
	 */
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
	/**
	 * winCheck passes the game board to 3 different methods to check for a win, either horizontally, vertically, or diagonally.
	 * @param gameBoard The current board.
	 * @param player The currently active player.
	 * @param size The custom size of the board.
	 * @return Will return true if any of the 3 methods detect a win.
	 */
	//Checks if a winning move has been played
	public static boolean winCheck(String[][]gameBoard, String player, int size) {
		return (verticalCheck(gameBoard, player, size)) || (horizontalCheck(gameBoard, player, size)) || (diagonalCheck(gameBoard, player, size));
	}
	/**
	 * the VerticalCheck method checks the columns of the board for a possible win.
	 * @param gameBoard The current board,
	 * @param player The active player.
	 * @param size The custom size of the board.
	 * @param a int value, used to scan the array with 'b'.
	 * @param b int value, used to scan the array with 'a'.
	 * @return Returns true if a vertical win is detected, otherwise returns false.
	 */
	//Vertical check
	public static boolean verticalCheck(String[][]gameBoard, String player, int size) {
		int count = 0;
		for (int a = 0; a < gameBoard.length; a++) {
			for (int b = 0; b < gameBoard[a].length; b++) {
				if (gameBoard[b][a].contains(player)) {
					count++;
				}
			}
			if (count == size) {
				return true;
			}
			count = 0;
		}
		return false;
	}	
	/**
	 * The horizontalCheck method checks the rows of the board for a possible win.
	 * @param gameBoard The current board.
	 * @param player The active player.
	 * @param size The custom size of the board.
	 * @param a int value, used to scan the array with 'b'.
	 * @param b int value, used to scan the array with 'a'.
	 * @return Returns true if a horizontal win is detected, otherwise returns false.
	 */
	//Horizontal check
	public static boolean horizontalCheck(String[][]gameBoard, String player, int size) {
		int count = 0;
		for (int a = 0; a < gameBoard.length; a++) {
			for (int b = 0; b < gameBoard[a].length; b++) {
				if (gameBoard[a][b].contains(player)) {
					count++;
				}
			}
			if (count == size) {
				return true;
			}
			count = 0;
		}
		return false;
	}	
	/**
	 * The diagonalCheck method checks the diagonals of the board for a possible win.
	 * @param gameBoard The current board.
	 * @param player The active player.
	 * @param size The custom size of the board.
	 * @param a int value, used to scan the array with 'b'.
	 * @param b int value, used to scan the array with 'a'.
	 * @return Returns true if a diagonal win is detected, otherwise returns false.
	 */
	//Diagonal check
	public static boolean diagonalCheck(String[][]gameBoard, String player, int size) {
	int count = 0;
	int diag = 0;
	for (int a = 0; a < gameBoard.length; a++) {
			if (gameBoard[a][a].contains(player) || (gameBoard[diag][a].contains(player))) {
				count++;
				if (gameBoard[diag][a].contains(player)) {
					diag++;
				}
			}
		}		
	if (count == size) {
		return true;
	}
	else return false;
	}
	/**
	 * showWins will display a custom message for which player has made the final, winning move, or if a draw is detected, and thanks the user for playing.
	 * @param player The active, possibly winning player.
	 * @param wins The boolean value set to true if a player has won.
	 * @param drawCount The boolean value set to true if a draw was detected.
	 * @return Returns a jolly "Thanks for playing!"
	 */
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