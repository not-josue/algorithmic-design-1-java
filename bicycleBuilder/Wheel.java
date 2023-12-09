/*
 * Written By: Josue
 */
public class Wheel {

	// instance variables

	private double diameter;
	private double width;

	// constructors

	public Wheel() {

		this.diameter = 16;
		this.width = 1.0;

	}

	public Wheel(double aD, double aW) {

		this.setDiameter(aD);
		this.setWidth(aW);

	}

	// accessors / getters

	public double getDiameter() {
		return this.diameter;
	}

	public double getWidth() {
		return this.width;
	}

	// mutators / setters

	public void setDiameter(double aD) {

		if (aD >= 16 && aD <= 55) this.diameter = aD;
		else this.diameter = 16;

	}

	public void setWidth(double aW) {

		if (aW >= 1.0 && aW <= 2.5) this.width = aW;
		else this.width = 1.0;

	}

	// other methods

	public String toString() {

		return "[Wheel] Diameter: " + this.diameter + " Width: " + this.width;

	}

	public boolean equals(Wheel w) {

		return w != null && this.diameter == w.getDiameter()
				&& this.width == w.getWidth();

	}

}
