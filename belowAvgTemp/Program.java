
/*
 * A program that takes the temperature of 10 days, calculates the average, an prints the days which were
 * below the average temperature
 * Written By: Josue
 */
import java.util.Scanner;

public class Program {

	// constants

	public static final int DAYS = 10;

	// methods

	// method that gets user input, and stores it into an array
	static double[] setTemp(int days) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// declare an int array
		double[] temperatures = new double[days];

		// iterate for the set amount of days
		for (int i = 1; i <= days; i++) {
			System.out.println("Please enter the temperature for day " + i);
			double input = sc.nextDouble();
			temperatures[i - 1] = input;
		}

		sc.close();

		return temperatures;

	}

	// method that calculates the average temp
	static double setAvgTemp(double[] arr) {

		// declare a variable to hold the total sum
		double sum = 0;

		// iterate the array, whilst updating the sum variable
		for (double value : arr) {
			sum += value;
		}

		return sum / arr.length;

	}

	// method that prints the days that were below the average temperature
	static void lowerThanAvg(double[] arr, double avg) {

		// iterate over the array and print if the value is below the average given
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg) {
				System.out.println("Day " + (i + 1) + " with " + arr[i]);
			}
		}

	}

	public static void main(String[] args) {

		System.out.println("Welcome to the below average temperature tester program.");
		System.out.println();

		// get user input
		double[] temperatures = setTemp(DAYS);

		// calculate the average
		double avg = setAvgTemp(temperatures);

		// show the average
		System.out.println();
		System.out.println("The average temperature was " + avg);

		// show the days that were below the average temperature
		System.out.println();
		System.out.println("The days that were below average were:");
		lowerThanAvg(temperatures, avg);

	}

}
