/*
 * Written By: Josue
 */
public class Bicycle {

	// instance variables

	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Frame frame;

	// constructors

	public Bicycle() {

		this.make = "none";
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.frame = new Frame();

	}

	public Bicycle(String aM, Wheel fw, Wheel bW, Frame f) {

		this.setMake(aM);
		this.setFrontWheel(fw);
		this.setBackWheel(bW);
		this.setFrame(f);

	}

	// accessors / getters

	public String getMake() {
		return this.make;
	}

	public Wheel getFrontWheel() {
		return this.frontWheel;
	}

	public Wheel getBackWheel() {
		return this.backWheel;
	}

	public Frame getFrame() {
		return this.frame;
	}

	// mutators / setters

	public void setMake(String aM) {
		if (aM != null) this.make = aM;
		else this.make = "none";
	}

	public void setFrontWheel(Wheel fW) {
		if (fW != null) this.frontWheel = fW;
		else this.frontWheel = new Wheel();
	}

	public void setBackWheel(Wheel bW) {
		if (bW != null) this.backWheel = bW;
		else this.backWheel = new Wheel();
	}

	public void setFrame(Frame f) {
		if (f != null) this.frame = f;
		else this.frame = new Frame();
	}

	// other methods

	public String toString() {

		return "[Bicycle] Make: " + this.make + " Front Wheel: "
				+ this.frontWheel.toString() + " Back Wheel: "
				+ this.backWheel.toString() + " Frame: " + this.frame.toString();

	}

	public boolean equals(Bicycle b) {

		return b != null && this.make.equalsIgnoreCase(b.getMake())
				&& this.frontWheel.equals(b.getFrontWheel())
				&& this.backWheel.equals(b.getBackWheel())
				&& this.frame.equals(b.getFrame());

	}

}
