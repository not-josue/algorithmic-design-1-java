/*
 * A program that accepts two four-digit binary numbers, converts them to decimal values, adds them together, and prints both the decimal values and the result of the addition.
 * Written By: Josue 
 */
package binaryChanger;

import java.util.Scanner;

public class Program {

	// constants

	// exponents that will be used
	public static final int[] EXPONENTS =
	{ 3, 2, 1, 0 };
	// base value that will be used
	public static final int BASE = 2;

	// methods

	// method for converting user input to an int
	static int[] string2Int(String input)
	{
		// declare an int array that is the length of the parameter
		int[] convertArr = new int[input.length()];

		// iterate over the String array, must use length method since the variable is a
		// String
		for (int i = 0; i < input.length(); i++)
		{
			/*
			 * set the local array's index to an it version of the current char:
			 * Integer.parseInt() converts everything inside to an int String.valueOf() is
			 * needed since parseInt() expects a String not a char input.charAt() is used to
			 * reference the current char of the String
			 */
			convertArr[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
		}

		return convertArr;

	}

	// method for converting a binary digit to a decimal value
	static int[] binary2Decimal(int[] arr)
	{
		// declare an int array that is the length of the parameters length
		int[] convertArr = new int[arr.length];
		// iterate over the parameter array
		for (int i = 0; i < arr.length; i++)
		{
			/*
			 * set the index of the array to: base raised to the power of the index of the
			 * constant EXPONENTS - type casted to int times the index of the input array
			 */
			convertArr[i] = (int) (Math.pow(BASE, EXPONENTS[i])) * arr[i];
		}

		return convertArr;

	}

	// method that outputs the values that were added and the sum of those values
	static int output(int[] arr)
	{
		// initialize a variable that will be used to calculate the sum
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
		{
			// update the sum variable each iteration
			sum += arr[i];
			// output the last index differently than the rest of the indices
			if (i == arr.length - 1)
			{
				System.out.print(arr[i] + " = ");
			} else
			{
				System.out.print(arr[i] + " + ");
			}
		}

		System.out.print(sum);
		System.out.println();

		return sum;

	}

	public static void main(String[] args)
	{

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		// take user input
		System.out.println("Enter the first 4 binary digits:");
		String firstInput = sc.nextLine();
		System.out.println("Enter the second 4 binary digits:");
		String secondInput = sc.nextLine();

		// convert user input into an int array
		int[] firstInputIntArr = string2Int(firstInput);
		int[] secondInputIntArr = string2Int(secondInput);

		// convert the int arrays to a decimal value
		int[] firstInputDecimal = binary2Decimal(firstInputIntArr);
		int[] secondInputDecimal = binary2Decimal(secondInputIntArr);

		// output results to user
		int firstInputSum = output(firstInputDecimal);
		int secondInputSum = output(secondInputDecimal);

		int total = firstInputSum + secondInputSum;

		System.out.println(firstInputSum + " + " + secondInputSum + " = " + total);

		sc.close();

	}

}
