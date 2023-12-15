/*
 * Written By: Josue
 */
public class Clothing {

	// instance variables

	private String type;
	private String color;

	// constructors

	public Clothing() {

		this.type = "Socks";
		this.color = "Black";

	}

	public Clothing(String aT, String aC) {

		this.setType(aT);
		this.setColor(aC);

	}

	// accessors / getters

	public String getType() {
		return this.type;
	}

	public String getColor() {
		return this.color;
	}

	// mutators / setters

	public void setType(String aT) {

		if (aT != null
				&& (aT.equalsIgnoreCase("Undergarment") || aT.equalsIgnoreCase("Socks")
						|| aT.equalsIgnoreCase("Stockings") || aT.equalsIgnoreCase("Top")
						|| aT.equalsIgnoreCase("Bottom") || aT.equalsIgnoreCase("Cape")))
			this.type = aT;
		else
			this.type = "Socks";

	}

	public void setColor(String aC) {

		if (aC != null
				&& (aC.equalsIgnoreCase("Brown") || aC.equalsIgnoreCase("Red")
						|| aC.equalsIgnoreCase("Pink") || aC.equalsIgnoreCase("Black")
						|| aC.equalsIgnoreCase("White") || aC.equalsIgnoreCase("Orange")
						|| aC.equalsIgnoreCase("Green") || aC.equalsIgnoreCase("Blue")
						|| aC.equalsIgnoreCase("Purple") || aC.equalsIgnoreCase("Grey")))
			this.color = aC;
		else
			this.color = "Black";

	}

	// other methods

	public String toString() {

		return "[Clothing] Type: " + this.type + " Color: " + this.color;

	}

	public boolean equals(Clothing c) {

		return c != null && this.type.equalsIgnoreCase(c.getType())
				&& this.color.equalsIgnoreCase(c.getColor());

	}
}
