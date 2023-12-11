/*
 * Written By: Josue
 */
public class Bread {

	// instance variables

	private String name;
	private int calories;
	private String type;

	// constructors

	public Bread() {

		this.name = "none";
		this.calories = 50;
		this.type = "Whole Grain";

	}

	public Bread(String aN, int aC, String aT) {

		this.setName(aN);
		this.setCalories(aC);
		this.setType(aT);

	}

	// accessors / getters

	public String getName() {
		return this.name;
	}

	public int getCalories() {
		return this.calories;
	}

	public String getType() {
		return this.type;
	}

	// mutators / setters

	public void setName(String aN) {

		if (aN != null) this.name = aN;
		else this.name = "none";

	}

	public void setCalories(int aC) {

		if (aC >= 50 && aC <= 250) this.calories = aC;
		else this.calories = 50;

	}

	public void setType(String aT) {

		if (aT.equalsIgnoreCase("Honey Wheat") || aT.equalsIgnoreCase("White")
				|| aT.equalsIgnoreCase("Whole Grain")
				|| aT.equalsIgnoreCase("Whole Wheat"))
			this.type = aT;
		else
			this.type = "Whole Grain";

	}

	// other methods

	public String toString() {

		return "\nBread\nName: " + this.name + "\nCalories: " + this.calories
				+ "\nType: " + this.type;

	}

	public boolean equals(Bread b) {

		return b != null && this.name.equalsIgnoreCase(b.getName())
				&& this.calories == b.getCalories()
				&& this.type.equalsIgnoreCase(b.getType());

	}

}
