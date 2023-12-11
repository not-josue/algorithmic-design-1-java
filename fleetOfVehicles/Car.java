/*
 * Written By: Josue
 */
public class Car extends Vehicle {

	// instance variables

	private double gasMileage;
	private int numberOfPassengers;

	// constructors

	public Car() {

		super();
		this.gasMileage = 1.0;
		this.numberOfPassengers = 1;

	}

	public Car(String mN, int nC, String oN, double gM, int nP) {

		super(mN, nC, oN);
		this.setGasMileage(gM);
		this.setNumberOfPassengers(nP);

	}

	// accessors / getters

	public double getGasMileage() {
		return this.gasMileage;
	}

	public int getNumberOfPassengers() {
		return this.numberOfPassengers;
	}

	// mutators / setters

	public void setGasMileage(double gM) {

		if (gM >= 0) this.gasMileage = gM;
		else this.gasMileage = 1.0;

	}

	public void setNumberOfPassengers(int nP) {

		if (nP >= 0) this.numberOfPassengers = nP;
		else this.numberOfPassengers = 1;

	}

	// other methods

	public String toString() {

		return super.toString() + "\nGas Mileage: " + this.gasMileage
				+ "\nNumber of Passengers: " + this.numberOfPassengers;

	}

	public boolean equals(Car c) {

		return c != null && super.equals(c) && this.gasMileage == c.getGasMileage()
				&& this.numberOfPassengers == c.getNumberOfPassengers();

	}

}
