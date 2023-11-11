/*
 * A program that creates a triangle based on the size the user inputs
 * Written By: Josue
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Program {
	
	// constants
	
	public static final String SYMBOL = "*";
	
	// methods
	
	// method for printing the desired symbol x amount of times on the same line
	static void printSymbol(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print(SYMBOL);
		}
	}
	
	// method for increasing the count of symbols printed on each line
	static void increase(int size) {
		for (int i = 1; i <= size; i++) {
			printSymbol(i);
			System.out.println();
		}
	}
	
	// method for decreasing the count of symbols printed on each line
	static void decrease(int size) {
		for (int i = size-1; i > 0; i--) {
			printSymbol(i);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		
		// get user input
		System.out.println("Welcome to Triangle Maker!  Enter the size of the triangle.");
		
		try {
			int size = sc.nextInt();
			System.out.println();
			
			sc.close();
			
			if (size > 1) {
				increase(size);
				decrease(size);
			}
			System.out.println();
			System.out.println("DONE!");
		}
		// error handling for bad input
		catch (InputMismatchException e) {
			System.out.println("Wrong Input!!!");
			System.exit(0);
		}
		

	}

}
