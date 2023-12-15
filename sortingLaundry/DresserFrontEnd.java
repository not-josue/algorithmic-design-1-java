/*
 * Written By: Josue
 */
import java.util.Scanner;
public class DresserFrontEnd {

	// constants
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// welcome message
		System.out.println("Welcome to the dresser!\n");

		// initialize an instance of Dresser
		Dresser dresser = new Dresser();

		// initialize a boolean to quit the program
		boolean quit = false;

		while (!quit)
		{
			// menu
			printOptions();

			// get input
			int input = sc.nextInt();
			sc.nextLine(); // fix-up

			// perform operation
			performOp(dresser, input);

		}

	}

	// methods

	// method to print user options
	private static void printOptions() {

		System.out.println(
				"Enter 1: to add an item\nEnter 2: to remove an item\nEnter 3: to print out the dresser contents\nEnter 9: to quit");

	}

	// method to perform an action based on user input
	private static void performOp(Dresser d, int input) {

		switch (input) {
			case 1 :
			{
				System.out.println(
						"\nEnter the type\nIt may be undergarment, socks, stockings, top, bottom, or cape");
				String type = sc.nextLine();
				System.out.println(
						"Enter a color\nIt may be brown, red, pink, black, white, orange, green, blue, purple, or grey");
				String color = sc.nextLine();
				Clothing clothing = new Clothing(type, color);
				d.add(clothing);
				System.out.println(); // aesthetics
				d.print();
				break;
			}
			case 2 :
			{
				System.out.println(
						"\nEnter the type\nIt may be undergarment, socks, stockings, top, bottom, or cape");
				String type = sc.nextLine();
				System.out.println(
						"Enter a color\nIt may be brown, red, pink, black, white, orange, green, blue, purple, or grey");
				String color = sc.nextLine();
				Clothing clothing = new Clothing(type, color);
				d.remove(clothing);
				System.out.println(); // aesthetics
				d.print();
				break;
			}
			case 3 :
			{
				d.print();
				System.out.println(); // aesthetics
				break;
			}
			case 9 :
			{
				sc.close();
				System.out.println("\nGoodbye!!!");
				System.exit(0);
			}
			default :
			{
				System.out.println("\nWrong input!!!\n");
				break;
			}

		} // end switch

	}

}
