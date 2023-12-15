/*
 * Written By: Josue
 */
public class Dresser {

	// instance variables

	private Clothing[][] clothes;

	public static final int DRAWERS = 5;
	public static final int MAX_ITEMS = 2;

	// constructors

	public Dresser() {

		this.clothes = new Clothing[DRAWERS][MAX_ITEMS];

	}

	// other methods

	// method to add clothes if the dresser is not full
	/*
	 * Drawer organization: 1. Undergarment 2. Socks & Stockings 3. Top 4. Bottom
	 * 5. Cape
	 */
	public void add(Clothing c) {

		if (c == null) return;

		// check for full array
		if (isFull(clothes, c))
		{
			System.out.println("That dresser is full!!!");
			return;
		}
		else addToDresser(clothes, c);

	}

	// method to remove an item from the dresser
	public void remove(Clothing c) {

		if (c == null) return;

		// iterate and check
		for (Clothing[] drawer : clothes)
		{
			for (int i = 0; i < drawer.length; i++)
			{
				Clothing garment = drawer[i];
				if (garment != null && garment.equals(c))
				{
					drawer[i] = null;
					System.out.println(
							"\n" + c.getType() + " " + c.getColor() + " has been removed!!!");
					return;
				}
			}
		}

		// clothing not found
		System.out.println(
				"\n" + c.getType() + " " + c.getColor() + " is not in the dresser!!!");

	}

	// method to print a 2D array if index is not null
	public void print() {

		for (int i = 0; i < clothes.length; i++)
		{
			// drawer header
			printDrawer(i);
			for (int j = 0; j < clothes[i].length; j++)
			{
				if (clothes[i][j] != null)
					System.out.println(
							clothes[i][j].getType() + " " + clothes[i][j].getColor());
			}
			System.out.println(); // aesthetics
		}

	}

	// method to check if a 2D array is full
	private boolean isFull(Clothing[][] arr, Clothing c) {

		String clothingType = c.getType();

		// undergarments
		if (clothingType.equalsIgnoreCase("Undergarment"))
		{
			if (arr[0][0] != null && arr[0][1] != null) return true;
			else return false;
		}
		// socks, stockings
		else
			if (clothingType.equalsIgnoreCase("Socks")
					|| clothingType.equalsIgnoreCase("Stockings"))
		{
			if (arr[1][0] != null && arr[1][1] != null) return true;
			else return false;
		}
			// top
			else if (clothingType.equalsIgnoreCase("Top"))
		{
			if (arr[2][0] != null && arr[2][1] != null) return true;
			else return false;
		}
			// bottom
			else if (clothingType.equalsIgnoreCase("Bottom"))
		{
			if (arr[3][0] != null && arr[3][1] != null) return true;
			else return false;
		}
			// cape
			else if (clothingType.equalsIgnoreCase("Cape"))
		{
			if (arr[4][0] != null && arr[4][1] != null) return true;
			else return false;
		}

			else return true;

	}

	// method to add to a specific dresser
	private void addToDresser(Clothing[][] arr, Clothing c) {

		String clothingType = c.getType();

		// undergarments
		if (clothingType.equalsIgnoreCase("Undergarment"))
		{
			if (arr[0][0] == null) arr[0][0] = c;
			else arr[0][1] = c;
		}
		// socks, stockings
		else
			if (clothingType.equalsIgnoreCase("Socks")
					|| clothingType.equalsIgnoreCase("Stockings"))
		{
			if (arr[1][0] == null) arr[1][0] = c;
			else arr[1][1] = c;
		}
			// top
			else if (clothingType.equalsIgnoreCase("Top"))
		{
			if (arr[2][0] == null) arr[2][0] = c;
			else arr[2][1] = c;
		}
			// bottom
			else if (clothingType.equalsIgnoreCase("Bottom"))
		{
			if (arr[3][0] == null) arr[3][0] = c;
			else arr[3][1] = c;
		}
			// cape
			else if (clothingType.equalsIgnoreCase("Cape"))
		{
			if (arr[4][0] == null) arr[4][0] = c;
			else arr[4][1] = c;
		}

	}

	// method to print drawer name
	private void printDrawer(int index) {

		switch (index) {
			case 0 :
				System.out.println("[Undergarment Drawer]");
				break;
			case 1 :
				System.out.println("[Socks and Stockings Drawer]");
				break;
			case 2 :
				System.out.println("[Top Drawer]");
				break;
			case 3 :
				System.out.println("[Bottom Drawer]");
				break;
			case 4 :
				System.out.println("[Cape Drawer]");

		}

	}

}
