/*
 * Written By: Josue
 */
public class PeanutButter {

	// instance variables

	private String name;
	private int calories;
	private boolean isCrunchy;

	// constructors

	public PeanutButter() {

		this.name = "none";
		this.calories = 100;
		this.isCrunchy = false;

	}

	public PeanutButter(String aN, int aC, boolean iC) {

		this.setName(aN);
		this.setCalories(aC);
		this.setIsCrunchy(iC);

	}

	// accessors / getters

	public String getName() {
		return this.name;
	}

	public int getCalories() {
		return this.calories;
	}

	public boolean getIsCrunchy() {
		return this.isCrunchy;
	}

	// mutators / setters

	public void setName(String aN) {

		if (aN != null) this.name = aN;
		else this.name = "none";

	}

	public void setCalories(int aC) {

		if (aC >= 100 && aC <= 300) this.calories = aC;
		else this.calories = 100;

	}

	public void setIsCrunchy(boolean iC) {

		if (iC == true || iC == false) this.isCrunchy = iC;
		else this.isCrunchy = false;

	}

	// other methods

	public String toString() {

		return "\nPeanut Butter\nName: " + this.name + "\nCalories: "
				+ this.calories + "\nIs Crunchy: " + this.isCrunchy;

	}

	public boolean equals(PeanutButter pb) {

		return pb != null && this.name.equalsIgnoreCase(pb.getName())
				&& this.calories == pb.getCalories()
				&& this.isCrunchy == pb.getIsCrunchy();

	}

}
