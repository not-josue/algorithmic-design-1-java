/*
 * A class that tests dates and times input by the user
 * Written By: Josue
 */
import java.util.Scanner;
public class DateAndTimeTester {

	// methods

	// the only method that will be called
	static void run() {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		boolean quit = false;

		while (!quit)
		{
			// get input
			System.out.println(
					"Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
			String input = sc.nextLine();

			// check input
			String result = (isValid(input))
					? "The date and time is valid!"
					: "The date and time is not valid";

			// output
			System.out.println(result);

			// replay message
			System.out.println(
					"Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue");
			input = sc.nextLine();
			if (input.equalsIgnoreCase("quit"))
			{
				sc.close();
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else continue;
		}

	}

	// validate methods

	// method to validate correct month, day, hour, and time
	static boolean isValid(String input) {
		return isValidDate(input) && isValidTime(input);
	}

	// method to validate correct month, and day
	static boolean isValidDate(String input) {

		// initialize boolean variables
		boolean validMonth = false;
		boolean validDay = false;

		// initialize variables for month, and day
		int month = getMonth(input);
		int day = getDay(input);

		// check each variable
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12) && (day >= 1 && day <= 31))
		{
			validMonth = true;
			validDay = true;
		}
		else if (month == 2 && day <= 28)
		{
			validMonth = true;
			validDay = true;
		}
		else
			if ((month == 4 || month == 6 || month == 9 || month == 11)
					&& (day >= 1 && day <= 30))
		{
			validMonth = true;
			validDay = true;
		}

		return validMonth && validDay;

	}

	// method to validate correct hour, and minute
	static boolean isValidTime(String input) {

		// initialize boolean variables
		boolean validHour = false;
		boolean validMinute = false;

		// initialize variables for hour, and minute
		int hour = getHour(input);
		int minute = getMinute(input);

		// check each variable
		if (hour >= 1 && hour <= 12) validHour = true;
		if (minute >= 0 && minute <= 59) validMinute = true;

		return validHour && validMinute;

	}

	// getters

	// method to extract the month
	static int getMonth(String input) {

		// split by empty space
		String[] space = input.split(" ");

		// split by backslash
		String[] backslash = space[0].split("/");

		return Integer.valueOf(backslash[0]);
	}

	// method to extract the day
	static int getDay(String input) {

		// split by empty space
		String[] space = input.split(" ");

		// split by backslash
		String[] backslash = space[0].split("/");

		return Integer.valueOf(backslash[1]);
	}

	// method to extract the hour
	static int getHour(String input) {

		// split by empty space
		String[] space = input.split(" ");

		// split by colon
		String[] colon = space[1].split(":");

		return Integer.valueOf(colon[0]);
	}

	// method to extract the minute
	static int getMinute(String input) {

		// split by empty space
		String[] space = input.split(" ");

		// split by colon
		String[] colon = space[1].split(":");

		return Integer.valueOf(colon[1]);

	}

}
