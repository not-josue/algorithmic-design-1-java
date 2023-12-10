/*
 * Written By: Josue
 */
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// welcome message
		System.out.println("Welcome to Coffee Tester!!!\n");

		// initialize a variable to quit program
		boolean quit = false;

		// iterate until user quits
		while (!quit)
		{

			run(sc);

			// ask user to quit
			System.out
					.println("\nWould you like to end the program (enter \"quit\")");
			String input = sc.nextLine();

			if (input.equals("quit"))
			{
				sc.close();
				System.out.println("\nEnjoy your coffee and have a good day!!!");
				quit = true;
			}
			else
			{
				System.out.println();
			}

		}

	}

	// methods

	static void run(Scanner sc) {

		// get input
		System.out.println("What's the name of the first coffee?");
		String name = sc.nextLine();

		System.out.println("How much caffeine does it have?");
		double caffeine = sc.nextDouble();
		sc.nextLine(); // fix-up

		// create instance of first cup
		Coffee cup01 = new Coffee(name, caffeine);

		// get input
		System.out.println("\nWhat's the name of the second coffee?");
		name = sc.nextLine();

		System.out.println("How much caffeine does it have?");
		caffeine = sc.nextDouble();
		sc.nextLine(); // fix-up

		// create instance of second cup
		Coffee cup02 = new Coffee(name, caffeine);

		// print the properties of each cup
		System.out.println("\nThese are the cups you created:");
		System.out.println(cup01 + "\n" + cup02 + "\n");

		// print risky amount for each cup
		System.out.println("Here are the risky consumption amounts of each cup:");
		System.out.println(cup01.getName() + ": It would take "
				+ cup01.riskyAmount() + " cups before it's dangerous to drink!!!");
		System.out.println(cup02.getName() + ": It would take "
				+ cup02.riskyAmount() + " cups before it's dangerous to drink!!!");

		// display if both cups are equal
		System.out.println("\nLet's check if both cups are the same...");
		System.out.println(cup01.equals(cup02));

	}

}
