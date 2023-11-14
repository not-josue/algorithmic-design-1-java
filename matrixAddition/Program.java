/*
 * A program that creates and adds matrices if they are the same length, and width
 * By: Josue
 */
import java.util.Scanner;
public class Program {

	// methods

	// method for creating a multi-dimensional array/matrix
	static int[][] createMatrix(int length, int width, Scanner sc) {
		// initialize a local array
		int[][] matrix = new int[length][width];
		// iterate
		for (int i = 0; i < length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.println("Enter value at index " + i + " " + j);
				matrix[i][j] = sc.nextInt();
				sc.nextLine(); // fix-up
			}
		}
		return matrix;
	}

	// method for checking if the length and width of 2 matrices is the same
	static boolean sameSize(int[][] firstMatrix, int[][] secondMatrix) {
		// initialize variables to hold the first Matrix's length and width
		int firstLength = firstMatrix.length;
		int firstWidth = firstMatrix[0].length;

		// initialize variables to hold the second Matrix's length and width
		int secondLength = secondMatrix.length;
		int secondWidth = secondMatrix[0].length;

		if ((firstLength == secondLength) && (firstWidth == secondWidth))
			return true;

		return false;
	}

	// method for adding 2 multi-dimensional arrays/matrices
	static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
		// initialize a local array
		int[][] sumMatrix = new int[firstMatrix.length][firstMatrix[0].length];
		// iterate
		for (int i = 0; i < sumMatrix.length; i++)
		{
			for (int j = 0; j < sumMatrix[i].length; j++)
			{
				sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		return sumMatrix;
	}

	// method for printing an array/matrix
	static void printMatrix(int[][] matrix) {
		// iterate
		for (int[] i : matrix)
		{
			for (int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// prompt user
		System.out.println("Welcome to the matrix adder program!\n");

		// get user input for first matrix
		System.out.println("Please enter the LENGTH of the first matrix");
		int length = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("Please enter the WIDTH of the first matrix");
		int width = sc.nextInt();
		sc.nextLine(); // fix-up
		int[][] firstMatrix = createMatrix(length, width, sc);
		System.out.println();

		// get user input for second matrix
		System.out.println("Please enter the LENGTH of the second matrix");
		length = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("Please enter the WIDTH of the second matrix");
		width = sc.nextInt();
		sc.nextLine(); // fix-up
		int[][] secondMatrix = createMatrix(length, width, sc);
		System.out.println();

		sc.close();

		// check if matrices are the same length and width
		if (!sameSize(firstMatrix, secondMatrix))
		{
			System.out.println("Invalid Dimensions. These cannot be added.");
			System.exit(0);
		}

		// initialize a matrix with the added values
		int[][] sumMatrix = addMatrices(firstMatrix, secondMatrix);

		// print the matrices that were created
		printMatrix(firstMatrix);
		System.out.println("+");
		printMatrix(secondMatrix);
		System.out.println("=");
		printMatrix(sumMatrix);
	}

}
