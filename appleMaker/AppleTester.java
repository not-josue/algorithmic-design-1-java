/*
 * Written By: Josue
 */
public class AppleTester {

	public static void main(String[] args) {

		// welcome message
		System.out.println("Welcome to the apple tester!!!");

		// first instance

		System.out.println("Creating a default apple");
		Apple a = new Apple();
		System.out.println("Printing the default apple's value");
		System.out.println(a.toString() + "\n");

		// second instance

		System.out.println("Creating another apple");
		Apple b = new Apple();
		System.out.println(
				"Setting the new apple's values to the following, valid values\n\"Granny Smith 0.75 0.99\"");
		b.setType("Granny Smith");
		b.setWeight(0.75);
		b.setPrice(0.99);
		System.out.println("Printing the new apple's values");
		System.out.println(b.toString() + "\n");

		// third instance

		System.out.println("Creating another default apple");
		Apple c = new Apple();
		System.out.println(
				"Then setting the new apple's values to the following, invalid values\n\"iPad 2.5 -200\"");
		c.setType("iPad");
		c.setWeight(2.5);
		c.setPrice(-200);
		System.out.println(
				"Printing the newest apple's values which should not have changed from the default values");
		System.out.println(c.toString() + "\n");

		// final test
		System.out
				.println("Checking if the first and last apples have the same values.");
		System.out.println(a.equals(c));

	}

}
