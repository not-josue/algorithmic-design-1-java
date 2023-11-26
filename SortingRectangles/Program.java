/*
 * A program that creates a collection of rectangles, sorts them (ascending/descending) based on their area 
 * and provides the average area, minimum area, and maximum area of the collection
 * Written By: Josue
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;
public class Program {

	// constants

	public static final int BORDER_SIZE = 30;
	public static final String BORDER_PATTERN = "=";

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Rectangle Sorter Program!!!");

		/// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// initialize a null array
		double[] collection = null;

		// start menu
		getMenu(sc, collection);

	}

	///// start of utility methods /////

	// method for creating an aesthetic border
	static void createBorder() {
		for (int i = 0; i < BORDER_SIZE; i++)
			System.out.print(BORDER_PATTERN);
		System.out.println("\n");
	}

	// method for printing an array
	static void printArr(double[] collection) {
		System.out.println();
		for (double area : collection)
			System.out.println("Area: " + area);
		System.out.println();
	}

	// method for round to 2 decimal places
	static double round(double value) {
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	// method to calculate the average area of all rectangles
	static double getAvg(double[] collection) {
		// initialize a sum variable
		double sum = 0.0;

		// iterate
		for (double area : collection)
			sum += area;

		return sum / collection.length;
	}

	///// end of utility methods /////

	///// start of rectangle creation methods /////

	// method for creating the size of the collection
	static int setSize(Scanner sc) {
		// initialize a boolean to check user input
		boolean correctInput = false;
		// initialize a variable to use for user input
		int size = -1;

		// iterate until user input is correct
		while (!correctInput)
		{
			System.out.println(
					"What is the size of your collection? (Enter a positive integer)");
			size = sc.nextInt();
			sc.nextLine(); // fix-up
			if (size > 0) correctInput = true;
			else System.out.println(size + " is an invalid size, try again!!!");
		}

		return size;
	}

	// method for setting a value (length, and width)
	static double setValue(String side, int index, Scanner sc) {
		System.out.println(
				"What is the " + side + " of index " + index + " in the collection?");

		double input = sc.nextDouble();
		sc.nextLine(); // fix-up

		return input;
	}

	// method for calculating the area
	static double calculateArea(double length, double width) {
		return length * width;
	}

	// method for creating the values of the collection
	static double[] createCollection(Scanner sc) {
		// intialize size of the array
		int size = setSize(sc);
		// declare and initialize an array to store values
		double[] collection = new double[size];

		// iterate
		for (int i = 0; i < collection.length; i++)
		{
			// set length
			double length = setValue("Length", i, sc);
			// set width
			double width = setValue("Width", i, sc);
			// set area
			collection[i] = calculateArea(length, width);
		}

		return collection;
	}

	///// end of rectangle creation methods /////

	///// start of sorting methods /////

	// method for ascending sort
	static double[] ascend(double[] collection) {
		// initialize local array
		double[] sorted = Arrays.copyOf(collection, collection.length);

		// Selection Sort
		for (int i = 0; i < sorted.length; i++)
		{
			// initialize a pointer variable to the current index
			int smallestIndex = i;
			// compare smallest to the rest of the values
			for (int j = i + 1; j < sorted.length; j++)
			{
				// smaller value found
				if (sorted[j] < sorted[smallestIndex]) smallestIndex = j;
			}
			// check if the pointer has switched
			if (smallestIndex != i)
			{
				// create a temp of the current index value
				double temp = sorted[i];
				// update the current index with the smaller value
				sorted[i] = sorted[smallestIndex];
				// update the moved index with greater value
				sorted[smallestIndex] = temp;
			}
		}

		return sorted;
	}

	// method for descending sort
	static double[] descend(double[] collection) {
		// initialize local array
		double[] sorted = Arrays.copyOf(collection, collection.length);

		for (int i = 0; i < sorted.length; i++)
		{
			// initialize a pointer variable to the current index
			int largestIndex = i;
			// compare to the rest of the values
			for (int j = i + 1; j < sorted.length; j++)
			{
				// larger value found
				if (sorted[j] > sorted[largestIndex]) largestIndex = j;
			}
			// check if the pointer has swapped
			if (largestIndex != i)
			{
				// initialize a temp variable to hold the current index's value
				double temp = sorted[i];
				// update the current index's value with the larger value
				sorted[i] = sorted[largestIndex];
				// update the swapped index's value with the current index's value
				sorted[largestIndex] = temp;
			}
		}

		return sorted;
	}

	///// end of sorting methods /////

	// method for creating a menu
	static void getMenu(Scanner sc, double[] collection) {
		// initialize a boolean to check if user wants to exit program
		boolean quit = false;

		while (!quit)
		{
			createBorder();
			System.out.println(
					"1: Enter Rectangle Data\n2: Ascending Sort\n3: Descending Sort\n4: Avg. Area\n5: Max Area\n6: Min Area\n\n0: Quit\n");
			createBorder();

			// get input
			int input = sc.nextInt();
			sc.nextLine(); // fix-up

			// check input
			switch (input) {
				// quit
				case 0 :
				{
					sc.close();
					System.out.println("\nNow exiting the program!");
					System.exit(0);
				}
				// rectangle data
				case 1 :
				{
					collection = createCollection(sc);
					break;
				}
				// ascending sort
				case 2 :
				{
					if (collection != null)
					{
						System.out.println("\nHere is the area in ascending order:");
						double[] sorted = ascend(collection);
						printArr(sorted);
						break;
					}
					else
					{
						System.out.println("You haven't created a collection yet!!!\n");
						break;
					}
				}
				// descending sort
				case 3 :
				{
					if (collection != null)
					{
						System.out.println("\nHere is the area in descending order:");
						double[] sorted = descend(collection);
						printArr(sorted);
						break;
					}
					else
					{
						System.out.println("You haven't created a collection yet!!!\n");
						break;
					}
				}
				// avg. area
				case 4 :
				{
					if (collection != null)
					{
						System.out
								.println("\nThe rounded average area of your collection is:\n≈ "
										+ round(getAvg(collection)) + "\n");
						break;
					}
					else
					{
						System.out.println("You haven't created a collection yet!!!\n");
						break;
					}
				}
				// max area
				case 5 :
				{
					if (collection != null)
					{
						double[] sorted = descend(collection);
						double max = sorted[0];
						System.out
								.println("\nThe max area in your collection is: " + max + "\n");
						break;
					}
					else
					{
						System.out.println("You haven't created a collection yet!!!\n");
						break;
					}
				}
				// min area
				case 6 :
				{
					if (collection != null)
					{
						double[] sorted = ascend(collection);
						double min = sorted[0];
						System.out
								.println("\nThe min area in your collection is: " + min + "\n");
						break;
					}
					else
					{
						System.out.println("You haven't created a collection yet!!!\n");
						break;
					}
				}
				default :
				{
					System.out.println("\nInvalid input!!!");
				}
			} // end of switch

		} // end of while

	}

}
