/*
 * Written By: Josue
 */
public class Frame {

	// instance variables

	private double size;
	private String type;

	// constructors

	public Frame() {

		this.size = 18.5;
		this.type = "Diamond";

	}

	public Frame(double aS, String aT) {

		this.setSize(aS);
		this.setType(aT);

	}

	// accessors / getters

	public double getSize() {
		return this.size;
	}

	public String getType() {
		return this.type;
	}

	// mutators / setters

	public void setSize(double aS) {

		if (aS >= 18.5 && aS <= 60.0) this.size = aS;
		else this.size = 18.5;

	}

	public void setType(String aT) {

		if ((aT != null) && (aT.equals("Diamond") || aT.equals("Step-Through")
				|| aT.equals("Truss") || aT.equals("Penny-Farthing")))
			this.type = aT;
		else
			this.type = "Diamond";

	}

	// other methods

	public String toString() {

		return "[Frame] Size: " + this.size + " Type: " + this.type;

	}

	public boolean equals(Frame f) {

		return f != null && this.size == f.getSize()
				&& this.type.equals(f.getType());

	}

}
