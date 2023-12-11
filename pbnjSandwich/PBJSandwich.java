/*
 * Written By: Josue
 */
public class PBJSandwich {

	// instance variables

	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;

	// constructors

	public PBJSandwich() {

		this.topSlice = new Bread();
		this.peanutButter = new PeanutButter();
		this.jelly = new Jelly();
		this.bottomSlice = new Bread();

	}

	public PBJSandwich(Bread ts, PeanutButter pb, Jelly j, Bread bs) {

		this.setTopSlice(ts);
		this.setPeanutButter(pb);
		this.setJelly(j);
		this.setBottomSlice(bs);

	}

	// accessors / getters

	public Bread getTopSlice() {
		return this.topSlice;
	}

	public PeanutButter getPeanutButter() {
		return this.peanutButter;
	}

	public Jelly getJelly() {
		return this.jelly;
	}

	public Bread getBottomSlice() {
		return this.bottomSlice;
	}

	// mutators / setters

	public void setTopSlice(Bread tS) {

		if (tS != null) this.topSlice = tS;
		else this.topSlice = new Bread();

	}

	public void setPeanutButter(PeanutButter pB) {

		if (pB != null) this.peanutButter = pB;
		else this.peanutButter = new PeanutButter();

	}

	public void setJelly(Jelly j) {

		if (j != null) this.jelly = j;
		else this.jelly = new Jelly();

	}

	public void setBottomSlice(Bread bS) {

		if (bS != null) this.bottomSlice = bS;
		else this.bottomSlice = new Bread();

	}

	// other methods

	public String toString() {

		return "PB&J Sandwich\nTop Slice:" + this.topSlice + "\nPeanut Butter:"
				+ this.peanutButter + "\nJelly:" + this.jelly + "\nBottom Slice:"
				+ this.bottomSlice;

	}

	public boolean equals(PBJSandwich s) {

		return s != null && this.topSlice.equals(s.getBottomSlice())
				&& this.peanutButter.equals(s.getPeanutButter())
				&& this.jelly.equals(s.getJelly())
				&& this.bottomSlice.equals(s.getBottomSlice());

	}

}
