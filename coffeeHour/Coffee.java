/*
 * Written By: Josue
 */
public class Coffee {

	// instance variables

	private String name;
	private double caffeineContent;

	// constructors

	public Coffee() {

		this.name = "none";
		this.caffeineContent = 50;

	}

	public Coffee(String aN, double aC) {

		this.setName(aN);
		this.setCaffeineContent(aC);

	}

	// accessors / getters

	public String getName() {
		return this.name;
	}

	public double getCaffeineContent() {
		return this.caffeineContent;
	}

	// mutators / setters

	public void setName(String aN) {

		if (aN != null) this.name = aN;
		else this.name = "none";

	}

	public void setCaffeineContent(double aC) {

		if (aC >= 50 && aC <= 300) this.caffeineContent = aC;
		else this.caffeineContent = 50;

	}

	// other methods

	public String toString() {

		return "Coffee Name: " + this.name + " Caffeine Amount: "
				+ this.caffeineContent;

	}

	public boolean equals(Coffee c) {

		return c != null && this.name.equals(c.getName())
				&& this.caffeineContent == c.getCaffeineContent();

	}

	public double riskyAmount() {

		return Math.ceil(180.0 / ((this.caffeineContent / 100.0) * 6.0));

	}

}
