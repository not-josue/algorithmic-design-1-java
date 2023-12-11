/*
 * Written By: Josue
 */
public class Jelly {

	// instance variables

	private String name;
	private int calories;
	private String fruitType;

	// constructors

	public Jelly() {

		this.name = "none";
		this.calories = 50;
		this.fruitType = "Grape";

	}

	public Jelly(String aN, int aC, String aT) {

		this.setName(aN);
		this.setCalories(aC);
		this.setFruitType(aT);

	}

	// accessors / getters

	public String getName() {
		return this.name;
	}

	public int getCalories() {
		return this.calories;
	}

	public String getFruitType() {
		return this.fruitType;
	}

	// mutators / setters

	public void setName(String aN) {

		if (aN != null) this.name = aN;
		else this.name = "none";

	}

	public void setCalories(int aC) {

		if (aC >= 50 && aC <= 200) this.calories = aC;
		else this.calories = 50;

	}

	public void setFruitType(String aT) {

		if (aT.equalsIgnoreCase("Apple") || aT.equalsIgnoreCase("Blackberry")
				|| aT.equalsIgnoreCase("Grape") || aT.equalsIgnoreCase("Blueberry")
				|| aT.equalsIgnoreCase("Tomato"))
			this.fruitType = aT;
		else
			this.fruitType = "Grape";

	}

	// other methods

	public String toString() {

		return "\nJelly\nName: " + this.name + "\nCalories: " + this.calories
				+ "\nFruit Type: " + this.fruitType;

	}

	public boolean equals(Jelly j) {

		return j != null && this.name.equalsIgnoreCase(j.getName())
				&& this.calories == j.getCalories()
				&& this.fruitType.equalsIgnoreCase(j.getFruitType());

	}

}
