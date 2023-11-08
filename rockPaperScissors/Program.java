
/*
 * A program that plays the game rock, paper, scissors with a user and the computer,
 * 3 rounds are played and points are accumulated
 * Written By: Josue
 */
import java.util.Scanner;

public class Program {

	// constants

	// constant for how many rounds
	public static final int ROUNDS = 3;

	// constant for rock, paper, and scissors
	public static final String[] OPTIONS =
	{ "Rock", "Paper", "Scissors" };

	// methods

	// method for printing an aesthetic border
	static void border()
	{
		// length of border
		int size = 30;
		for (int i = 0; i < size; i++) {
			System.out.print("=");
		}
		System.out.println(); // go to next line
	}

	// method for printing the title menu
	static void titleMenu()
	{
		System.out.println("\nRock, Paper, Scissors\n");
		System.out.println("1: Start Game\n2: Rules\n3: Quit\n");
	}

	// method for printing the rules of the game
	static void getRules()
	{
		System.out.println("\nYou will play for " + ROUNDS + " rounds.\n");
		System.out.println("- Rock beats Scissors\n- Paper beats Rock\n- Scissors beats Paper\n");
		// delay for user to read
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// method displayed every round asking the user to pick rock, paper, scissors
	static void selectionMsg()
	{
		System.out.println("Select Rock, Paper, or Scissors:");
		System.out.println("0. Rock\n1. Paper\n2. Scissors");
	}

	// method for converting user input to a String
	static String setUserChoice(int input)
	{
		// bad user input
		if (input < 0 || input > 2) {
			return "Null";
		}
		return OPTIONS[input];
	}

	// method for generating a random number
	static int randomNum()
	{
		/*
		 * (int) needed to type cast to an int Math.floor - rounds down to the nearest
		 * int Math.random - generates a random number Options.length = 3, which makes
		 * the range of the random number 0-2
		 */
		return (int) Math.floor(Math.random() * OPTIONS.length);
	}

	// method for displaying the current score
	static void getScore(int player, int computer)
	{
		System.out.println("You: " + player + "\n" + "Computer: " + computer + "\n");
	}

	// method for calculating who one the round
	static String analyzeRound(String userInput, String compInput)
	{
		// automatic loss for bad user input
		if ("Null".equals(userInput)) {
			return "Loss";
		}
		// draw
		if (userInput == compInput) {
			return "Draw";
		}
		// win
		else if (("Rock".equals(userInput) && "Scissors".equals(compInput))
				|| ("Paper".equals(userInput) && "Rock".equals(compInput))
				|| ("Scissors".equals(userInput) && "Paper".equals(compInput))) {
			return "Win";
		} else {
			return "Loss";
		}
	}

	public static void main(String[] args)
	{
		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// initialize an input variable
		int userInput = 0;

		while (userInput != 1) {
			// title screen
			border();
			titleMenu();
			border();

			// get user input
			userInput = sc.nextInt();
			sc.nextLine(); // fix-up

			if (userInput == 2) {
				getRules();
			}

			if (userInput == 3) {
				System.out.println("Goodbye");
				System.exit(0);
			}
		}

		// start game
		boolean quit = false;

		while (!quit) {

			// initialize points variables
			int userPoints = 0;
			int compPoints = 0;

			// declare a variable for the computer's choice
			int compChoice;

			System.out.println(); // styling

			for (int i = 0; i < ROUNDS; i++) {
				// display round
				System.out.println("ROUND " + (i + 1) + "\n");
				// display the choices the user has
				selectionMsg();

				// get user input
				userInput = sc.nextInt();
				sc.nextLine(); // fix-up
				// set user input to a String
				String userStr = setUserChoice(userInput);

				// generate computer's choice
				compChoice = randomNum();
				// set computer's choice to a String
				String compStr = OPTIONS[compChoice];

				// analyze the round
				String outcome = analyzeRound(userStr, compStr);

				// display results
				System.out.println("\nRound Outcome: " + outcome);
				System.out.println("You chose: " + userStr);
				System.out.println("The computer chose: " + compStr + "\n");

				// update score
				if ("Win".equals(outcome)) {
					userPoints++;
				}
				if ("Loss".equals(outcome)) {
					compPoints++;
				}

				// display score
				getScore(userPoints, compPoints);
			}

			if (userPoints > compPoints) {
				System.out.println("You Win!!!");
			} else if (userPoints < compPoints) {
				System.out.println("You Lose!!!");
			} else {
				System.out.println("It's a Tie!!!\n");
			}

			// declare a variable to ask if the user want to play again
			int answer;

			do {
				System.out.println("Would you like to play again?");
				System.out.println("1. Yes\n2. No");
				answer = sc.nextInt();
				sc.nextLine(); // fix-up
			} while (answer != 1 && answer != 2);

			if (answer == 2) {
				System.out.println("Goodbye");
				quit = true;
				sc.close();
				System.exit(0);
			}

		}

	}

}
