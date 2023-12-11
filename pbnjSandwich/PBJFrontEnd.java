/*
 * Written By: Josue
 */
import java.util.Scanner;
public class PBJFrontEnd {

	// constants

	public static final Scanner SC = new Scanner(System.in);
	public static final int SANDWICHES = 2;
	public static final String BORDER_SYMBOL = "=";
	public static final String WELCOME = "Welcome to the PB&J Sandwich Maker!!!";

	public static void main(String[] args) {

		welcomeMsg();

		boolean quit = false;

		while (!quit)
		{

			// initialize an array to hold sandwich objects
			PBJSandwich[] plate = new PBJSandwich[SANDWICHES];

			// iterate and update array
			for (int i = 0; i < plate.length; i++)
			{
				plate[i] = createSandwich(i + 1);
				System.out.println();
			}

			// print output
			printArray(plate);
			boolean areEqual = areEqual(plate[0], plate[1]);
			System.out.println("Are they the same sandwich? " + areEqual);

			// quit or restart program?
			quit = userQuits();

			if (quit)
			{
				System.out.println("\nEnjoy your sandwiches!!!");
				SC.close();
			}
			else System.out.println();

		}

	}

	// methods

	// method for generating an aesthetic border
	static void createBorder() {

		// initialize a variable for the border size
		int size = WELCOME.length();

		// iterate and print
		for (int i = 0; i < size; i++)
			System.out.print(BORDER_SYMBOL);

		System.out.println();

	}

	// method for generating a welcome message
	static void welcomeMsg() {

		createBorder();
		System.out.println(WELCOME);
		createBorder();
		System.out.println();

	}

	// method for creating sandwiches
	static PBJSandwich createSandwich(int count) {

		// aesthetic message
		System.out.println("*****Sandwich " + count + "*****");

		// get input

		// top slice
		System.out.println("\nTop Slice of Bread Information");
		Bread topSlice = createBread();

		// peanut butter
		System.out.println("\nPeanut Butter Information");
		PeanutButter pb = createPB();

		// jelly
		System.out.println("\nJelly Information");
		Jelly jelly = createJelly();

		// bottom slice
		System.out.println("\nBottom Slice of Bread Information");
		Bread bottomSlice = createBread();

		PBJSandwich sandwich = new PBJSandwich(topSlice, pb, jelly, bottomSlice);

		return sandwich;

	}

	// method for creating a Bread object
	static Bread createBread() {

		System.out.println("Enter the name of the bread:");
		String name = SC.nextLine();

		System.out.println("Enter the number of calories:");
		int calories = SC.nextInt();
		SC.nextLine(); // fix-up

		System.out.println(
				"Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		String type = SC.nextLine();

		Bread b = new Bread(name, calories, type);

		return b;

	}

	// method for creating a Peanut Butter object
	static PeanutButter createPB() {

		System.out.println("Enter the name of the peanut butter:");
		String name = SC.nextLine();

		System.out.println("Enter the number of calories:");
		int calories = SC.nextInt();
		SC.nextLine(); // fix-up

		System.out.println("Is it crunchy? Enter \"true\", or \"false\"");
		boolean isCrunchy = SC.nextBoolean();
		SC.nextLine(); // fix-up

		PeanutButter pb = new PeanutButter(name, calories, isCrunchy);

		return pb;

	}

	// method for creating a Jelly object
	static Jelly createJelly() {

		System.out.println("Enter the name of the jelly:");
		String name = SC.nextLine();

		System.out.println("Enter the number of calories:");
		int calories = SC.nextInt();
		SC.nextLine(); // fix-up

		System.out.println(
				"Enter the type of jelly. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
		String type = SC.nextLine();

		Jelly j = new Jelly(name, calories, type);

		return j;

	}

	// method for printing an array
	static void printArray(PBJSandwich[] plate) {

		// iterate and print
		for (int i = 0; i < plate.length; i++)
		{
			System.out.println("*****Sandwich " + (i + 1) + "*****");
			System.out.println(plate[i] + "\n");
		}

		System.out.println();

	}

	// method for comparing 2 objects in an array
	static boolean areEqual(PBJSandwich one, PBJSandwich two) {
		return one.equals(two);
	}

	// method for restarting or quitting the program
	static boolean userQuits() {

		System.out.println("\nWould you like to quit the program? Enter \"quit\"");
		String input = SC.nextLine();

		boolean result = (input.equalsIgnoreCase("quit")) ? true : false;

		return result;

	}

}
