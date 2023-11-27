/*
 * A program that simulates a driving game in a 2D environment, the player must move to a location that doesn't have a 
 * pot hole whilst trying to make it home
 * Written By: Josue
 */
import java.util.Random;
import java.util.Scanner;
public class Program {

	// constants

	public static final int BOARD_SIZE = 10;

	public static final int POTHOLE_LOCATIONS = 5;

	public static final char EMPTY = '_';
	public static final char PLAYER = 'X';
	public static final char POTHOLE = '_';
	public static final char HOME = '^';

	public static final int START_X = 0;
	public static final int START_Y = 0;

	public static final int HOME_X = 9;
	public static final int HOME_Y = 9;

	public static void main(String[] args) {

		// create an instance of Scanner, and Random
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// new game
		boolean newGame = true;

		while (newGame)
		{

			// initialize variables for player starting location
			int pX = START_X;
			int pY = START_Y;

			// initialize variables for home location
			int hX = HOME_X;
			int hY = HOME_Y;

			// initialize an array with board size
			char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

			// fill the board with empty values
			for (int i = 0; i < board.length; i++)
			{
				for (int j = 0; j < board[i].length; j++)
				{
					board[i][j] = EMPTY;
				}
			}

			// update array with player starting location
			board[pY][pX] = PLAYER;

			// initialize an array to set potholes
			char[][] potholes = setPotholes(r);

			// update array with home location
			board[hY][hX] = HOME;

			// welcome message
			System.out.println(
					"Welcome to Pothole Driving! Get home while avoiding potholes!");

			// initialize a game end boolean
			boolean gameOver = false;

			while (!gameOver)
			{
				printBoard(board);

				// set x value input
				System.out.println("Enter either a -1, 0, or 1 in the X or 9 to quit");
				int dX = move(sc, "X");

				// set y value input
				System.out.println("Enter either a -1, 0, or 1 in the Y or 9 to quit");
				int dY = move(sc, "Y");

				// update old location
				board[pY][pX] = EMPTY;

				// set new current location
				pX += dX;
				pY += dY;

				// check new locations for out of bounds issues
				if (pX < 0) pX = 0;
				else if (pX > board.length - 1) pX = board.length - 1;

				if (pY < 0) pY = 0;
				else if (pY > board.length - 1) pY = board.length - 1;

				// check new locations for pothole
				if (potholes[pY][pX] == POTHOLE)
				{
					System.out.println("OH NO! POTHOLE!");
					System.out.println("Would you like to play again (yes or no)?");
					boolean correctInput = false;
					while (!correctInput)
					{
						String input = sc.nextLine();
						if (input.equalsIgnoreCase("yes"))
						{
							correctInput = true;
							gameOver = true;
						}
						else if (input.equalsIgnoreCase("no"))
						{
							System.out.println("Goodbye!");
							sc.close();
							System.exit(0);
						}
					}
				}

				// update current location
				board[pY][pX] = PLAYER;

				// check for winning condition
				if (pX == hX && pY == hY)
				{
					System.out
							.println("You've made it home without hitting a pothole!!!");
					System.out.println("Would you like to play again (yes or no)?");
					boolean correctInput = false;
					while (!correctInput)
					{
						String input = sc.nextLine();
						if (input.equalsIgnoreCase("yes"))
						{
							correctInput = true;
							gameOver = true;
						}
						else if (input.equalsIgnoreCase("no"))
						{
							System.out.println("Goodbye!");
							sc.close();
							System.exit(0);
						}
					}
				}

			} // game over

		} // new game

	}

	// methods

	// method for setting pothole locations
	static char[][] setPotholes(Random r) {
		// initialize a counter variable
		int counter = 0;
		// initialize an array
		char[][] potholes = new char[BOARD_SIZE][BOARD_SIZE];

		while (counter < POTHOLE_LOCATIONS)
		{

			// create random pothole locations
			int holeX = r.nextInt(BOARD_SIZE);
			int holeY = r.nextInt(BOARD_SIZE);

			// check that location, exclude player start and home location, and have
			// not already been chosen
			if ((holeX != START_X && holeY != START_Y)
					&& (holeX != HOME_X && holeY != HOME_Y)
					&& (potholes[holeY][holeX] != POTHOLE))
			{
				// update potholes and counter
				potholes[holeY][holeX] = POTHOLE;
				counter++;
			}
		}

		return potholes;
	}

	// method to print board
	static void printBoard(char[][] board) {
		for (char[] column : board)
		{
			for (char row : column)
			{
				System.out.print(row);
			}
			System.out.println();
		}
	}

	// method for setting player movement
	static int move(Scanner sc, String coordinate) {
		// initialize a variable for user input
		int input = sc.nextInt();

		// check input
		if (input < -1 || input > 1)
		{
			System.out
					.println("Invalid input, " + coordinate + " has been set to 0!!!");
			input = 0;
		}
		if (input == 9)
		{
			System.out.println("Game Over!!!");
			sc.close();
			System.exit(0);
		}

		return input;
	}

}
