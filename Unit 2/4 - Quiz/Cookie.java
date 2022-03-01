public class Cookie {

	// Attributes

	private String name; // String name of cookie

	private double weight; // floating integer weight of cookie

	private int calories; // integer calories of cookie

	private boolean isPackaged; // boolean if cooke is packaged or not

	// Cookie constructors

	/**
	 * Creates a empty cookie object
	 */
	public Cookie() {
		//setting all attributes to a somewhat null value
		this.name = "";
		this.weight = -1;
		this.calories = -1;
		this.isPackaged = false;
	}


	/**
	 * Creates a full release cookie object excluding packaging
	 * @param newName String cookie name
	 * @param newWeight double weight of cookie
	 * @param newCalories integer calories in cookie
	 */
	public Cookie(String newName, double newWeight, int newCalories) {
		//fills out attributes corresponding to parameters
		this.name = newName;
		this.weigtht = newWeight;
		this.calories = newCalories;
		this.isPackaged = false;
	}


	/**
	 * Creates a full release cookie object including packaging details
	 * @param newName String cookie name
	 * @param newWeight double weight of cookie
	 * @param newCalories integer calories in cookie
	 * @param newIsPackaged boolean is the cookie packaged
	 */
	public Cookie(String newName, double newWeight, int newCalories, boolean newIsPackaged) {
		//fills out attribtues corresponding to parameters
		this.name = newName;
		this.weigtht = newWeight;
		this.calories = newCalories;
		this.isPackaged = newIsPackaged;
	}

	// Accessors

	/**
   Gets the name of the cookie
   @return String name of cookie
   */
	public String getName() {
		return this.name;
	}

	/**
   Gets the weight of the cookie
   @return double weight of cookie
   */
	public double getWeight() {
		return this.weight;
	}

	/**
   Gets the amount of calories in the cookie
   @return integer calories of cookie
   */
	public int getCalories() {
		return this.calories;
	}

	/**
   Gets the state of packaging of the cookie
   @return boolean state of packaging of cookie
   */
	public boolean getIsPackaged() {
		return this.isPackaged;
	}

	// Mutators

	/**
   changes the name of the cookie
   @param newName expected new name
   */
	public void changeName(String newName) {
		this.name = newName;
	}

	/**
   changes the weight of the cookie
   @param newWeight expected new weight
   */
	public void changeWeight(double newWeight) {
		this.weight = newWeight;
	}

	/**
   changes the calories of the cookie
   @param newCalories expected new calories
   */
	public void changeCalories(int newCalories) {
		this.calories - newCalories;
	}

	/**
   changes the packaging state of the cookie
   @param newIsPackaged expected new state of packaging of cookie
   */
	public void changePackaging(boolean newIsPackaged) {
		this.isPackaged = newIsPackaged;
	}

	// Other Methods

	/**
	 * The cookie is opened, even if it is already opened
	 * Sets the packaging state to false
	 */
	public void open() {
		this.isPackaged = false;
	}

	/**
	 * The cookie is eaten, unless they cannot abide by the laws of mathematics and give an unreasonable weight amount or the cookie is still packaged as the cookie requires a guillotine to open the packaging as the owner is too weak. returns the amount of calories eaten by a set formula. Also reduces the cookuie based ot amount eaten
	 * @param weight double expected weight of cookie to be eaten
	 * @return amouhnt of calories gained from eating portion given of cookie, or if cookie is eaten or not based on events
	 */
	public int eaten(double weight) {
		if (weight > this.weight) {
			return -1;
		}
		if (!this.isPackaged) {
			return -2;
		}
		int ret_value = this.calories/(this.weight/weight);
		this.weight-=weight;
		return ret_value;
	}

	/**
	 * returns a string of all the important information of the cookie
	 * @return String of attributes of cookies with labels
	 */
	public String toString() {
		return "Name: " + this.name + "\nWeight: " + this.weight + "\nCalories" + this.calories + "Packaged? " + this.isPackaged;
	}
}