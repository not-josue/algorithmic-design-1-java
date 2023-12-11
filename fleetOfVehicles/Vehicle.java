/*
 * Written By: Josue
 */
public class Vehicle {

	// instance variables

	private String manufacturersName;
	private int numberOfCylinders;
	private String ownersName;

	// constructors

	public Vehicle() {

		this.manufacturersName = "none";
		this.numberOfCylinders = 6;
		this.ownersName = "none";

	}

	public Vehicle(String mN, int nC, String oN) {

		this.setManufacturersName(mN);
		this.setNumberOfCylinders(nC);
		this.setOwnersName(oN);

	}

	// accessors / getters

	public String getManufacturersName() {
		return this.manufacturersName;
	}

	public int getNumberOfCylinder() {
		return this.numberOfCylinders;
	}

	public String getOwnersName() {
		return this.ownersName;
	}

	// mutators / setters

	public void setManufacturersName(String mN) {

		if (mN != null) this.manufacturersName = mN;
		else this.manufacturersName = "none";

	}

	public void setNumberOfCylinders(int nC) {

		if (nC > 0) this.numberOfCylinders = nC;
		else this.numberOfCylinders = 6;

	}

	public void setOwnersName(String oN) {

		if (oN != null) this.ownersName = oN;
		else this.ownersName = "none";

	}

	// other methods

	public String toString() {

		return "Manufacturer's Name: " + this.manufacturersName
				+ "\nNumber of Cylinders: " + this.numberOfCylinders
				+ "\nOwner's Name: " + this.ownersName;

	}

	public boolean equals(Vehicle v) {

		return v != null && this.manufacturersName.equals(v.getManufacturersName())
				&& this.numberOfCylinders == v.getNumberOfCylinder()
				&& this.ownersName.equals(v.getOwnersName());

	}

}
