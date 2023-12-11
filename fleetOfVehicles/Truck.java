/*
 * Written By: Josue
 */
public class Truck extends Vehicle {

	// instance variables

	private double loadCapacity;
	private double towingCapacity;

	// constructors

	public Truck() {

		super(); // Vehicle's default constructor
		this.loadCapacity = 1.0;
		this.towingCapacity = 1.0;

	}

	public Truck(String mN, int nC, String oN, double lC, double tC) {

		super(mN, nC, oN);
		this.setLoadCapacity(lC);
		this.setTowingCapacity(tC);

	}

	// accessors / getters

	public double getLoadCapacity() {
		return this.loadCapacity;
	}

	public double getTowingCapacity() {
		return this.towingCapacity;
	}

	// mutators / setters

	public void setLoadCapacity(double lC) {

		if (lC >= 0) this.loadCapacity = lC;
		else this.loadCapacity = 1.0;

	}

	public void setTowingCapacity(double tC) {

		if (tC >= 0) this.towingCapacity = tC;
		else this.towingCapacity = 1.0;

	}

	// other methods

	public String toString() {

		return super.toString() + " \nTowing Capacity:  " + this.towingCapacity
				+ "\nLoad Capacity: " + this.loadCapacity;

	}

	public boolean equals(Truck t) {

		return t != null && super.equals(t)
				&& this.towingCapacity == t.getTowingCapacity()
				&& this.loadCapacity == t.getLoadCapacity();

	}

}
