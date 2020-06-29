package ticTacTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicTacTwoTest {
	String[][] gameBoard = {
			{"x", "x", "x"}, 
			{"x", "-", "o"}, 
			{"x", "o", "x"}
		};
	String[][] fullBoard = {
			{"x", "x", "x"}, 
			{"x", "x", "o"}, 
			{"x", "o", "x"}
	};
	String[][] emptyBoard = {
			{"-", "-", "-"},
			{"-", "-", "-"},
			{"-", "-", "-"}
	};

	@Test
	public void testdiagonalCheck() {
		assertTrue(TicTacTwo.winCheck(fullBoard, "x", 3));
		assertFalse(TicTacTwo.winCheck(fullBoard, "o", 3));
		
	}
	@Test
	public void testdisplayBoard() {
		assertEquals(TicTacTwo.displayBoard(gameBoard), gameBoard);
		assertEquals(TicTacTwo.displayBoard(emptyBoard), emptyBoard);
		assertEquals(TicTacTwo.displayBoard(fullBoard), fullBoard);
	}
	@Test
	public void testfillCheck() {
		assertTrue(TicTacTwo.fillCheck(fullBoard));
		assertFalse(TicTacTwo.fillCheck(emptyBoard));
	}
	@Test
	public void testhorizontalCheck() {
		assertTrue(TicTacTwo.winCheck(fullBoard, "x", 3));
		assertFalse(TicTacTwo.winCheck(fullBoard, "o", 3));
		
	}
	@Test
	public void testplayPiece() {
		assertEquals(TicTacTwo.playPiece(gameBoard, "x"), gameBoard);
	}
	@Test
	public void testshowWins() {
		assertEquals(TicTacTwo.showWins("o", true, false), "Thanks for playing!");
		assertEquals(TicTacTwo.showWins("o", false, true), "Thanks for playing!");
	}
	@Test
	public void testverticalCheck() {
		assertTrue(TicTacTwo.winCheck(fullBoard, "x", 3));
		assertFalse(TicTacTwo.winCheck(fullBoard, "o", 3));
		
	}
	@Test
	public void testwinCheck() {
		assertTrue(TicTacTwo.winCheck(fullBoard, "x", 3));
		assertFalse(TicTacTwo.winCheck(fullBoard, "o", 3));
	}
}
