/*
 * Written By: Josue
 */
public class Apple {

	// instance variables
	private String type;
	private double weight;
	private double price;

	// constructors
	public Apple() {

		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;

	}

	public Apple(String aN, double aW, double aP) {

		this.setType(aN);
		this.setWeight(aW);
		this.setPrice(aP);

	}

	// getters / accessors

	public String getType() {
		return this.type;
	}

	public double getWeight() {
		return this.weight;
	}

	public double getPrice() {
		return this.price;
	}

	// setters / mutators

	public void setType(String aN) {

		if ((aN != null)
				&& (aN.equals("Red Delicious") || aN.equals("Golden Delicious")
						|| aN.equals("Gala") || aN.equals("Granny Smith")))
			this.type = aN;
		else
			this.type = "Gala";

	}

	public void setWeight(double aW) {

		if (aW >= 0.0 && aW < 2.0) this.weight = aW;
		else this.weight = 0.0;

	}

	public void setPrice(double aP) {

		if (aP > 0.0) this.price = aP;
		else this.price = 0.0;

	}

	// other methods

	public String toString() {

		return "Type: " + this.type + " Weight: " + this.weight + " Price: "
				+ this.price;

	}

	public boolean equals(Apple a) {

		return a != null && this.type.equals(a.getType())
				&& this.weight == a.getWeight() && this.price == a.getPrice();

	}

}
