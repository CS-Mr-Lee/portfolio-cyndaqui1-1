/**
 * Name: Franklin Zhang
 * Date: Feb 25
 * Description: Human class that contains human like attributes and actions
 */

public class Human {
	private String name; // name of the human
	private double weight; // weight of the human
	private int energyLevel; // energy level of the human
	private String race; // race of the human
	private String sex; // sex of the human

	/**
	 * Human
	 * Creates a human
	 * @param newName the name of the human
	 * @param newWeight the weight of the human
	 * @param newEnergyLevel the energy level of the human
	 * @param newRace the race of the human
	 * @param newsex the sex of the human
	 */

	// Human Constructor

	// Creates a pre-release human
	public Human() {
		this.name = "";
		this.weight = -1;
		this.energyLevel = -1;
	}

	/**
	 * Creates a beta human
	 * @param name String expected new name of human
	 * @param weight double expected new weight of human
	 * @param energyLevel integer expected new energy level of human
	 */
	public Human(String name, double weight, int energyLevel) {
		//fills out attributes corresponding to parameters
		this.name = name;
		this.weight = weight;
		this.energyLevel = energyLevel;
      this.sex = "";

		if (this.weight < 0) { // weight cannot be negative
			this.weight = 50;
		}
		if (!this.sex.equals("male") && this.sex.equals("female")) { // gender can only be male or female
			this.sex = "unknown";
		}
		if (this.energyLevel > 100) { // energy can only be within the range of 0-100
			this.energyLevel = 100;
		}
		if (this.energyLevel < 0) {
			this.energyLevel = 0;
		}
	}

	/**
	 * Creates a full-release human
	 * @param newName String expected new name of human
	 * @param newWeight double expected new weight of human
	 * @param newEnergyLevel integer expected new energy level of human
	 * @param newRace String expected new race of human
	 * @param newSex String expected new sex of human
	 */
	public Human(String newName, double newWeight, int newEnergyLevel, String newRace, String newSex) {
		// initialize attributes of this class corresponding to correct parameter
		this.name = newName;
		this.weight = newWeight;
		this.energyLevel = newEnergyLevel;
		this.race = newRace;
		this.sex = newSex;

		if (this.weight < 0) { // weight cannot be negative
			this.weight = 50;
		}
		if (!this.sex.equals("male") && this.sex.equals("female")) { // gender can only be male or female
			this.sex = "unknown";
		}
		if (this.energyLevel > 100) { // energy can only be within the range of 0-100
			this.energyLevel = 100;
		}
		if (this.energyLevel < 0) {
			this.energyLevel = 0;
		}
	}

	//Methods

	/**
	 * human sleeps and regenerates energy based on hours slept
	 * @param hours hours to sleep
	 */

	public void sleep (int hours) {
		this.energyLevel += hours*10;
		if (this.energyLevel > 100) {
			this.energyLevel = 100;
		}
	}

	/**
	 * Human runs, decreases human's weight and energy level based on distance ran. Aborts command if not sufficient energy level
	 * @param km distance to be ran in kilometres
	 * @return whether the human can commence the operation (if they have enough energy to run the distance)
	 */
	public boolean run (double km) {
		if (this.energyLevel < 5*km) {
			return false;
		}
		this.weight-= km*0.001;
		this.energyLevel -= 3*km;
		return true;
	}
	/**
	 * Human eats, adds food weight to weight, and increases energy level based on food mass. Aldo restricts energy level to 1-100
	 * @param grams the weight of the food in grams
	 */
	public void eat (double grams) {
		this.weight += grams/1000;
		this.energyLevel += grams/50;
		if (this.energyLevel > 100) {
			this.energyLevel = 100;
		}
	}

	/**
	 * Tries to eat a vegetable based on a set portion of weight, increases energy level of human and weight based on portion of meal is partaken in successfully
	 * @param veg Vegetable vegetable to be eaten
	 * @param grams double weight in grams of veg to be eaten
	 */
	public void eat(Vegetable veg, double grams) {
		int eatVeg = veg.eaten(grams);
		if (eatVeg==-1) {
			System.out.println("I don't have that much " + veg.getName());
			return;
		}
		if (eatVeg == -2) {
			System.out.println(veg.getName() + " is poisonous!");
			return;
		}
		this.weight+=grams/1000; //adds weight based on veggie eaten from g to kg
		this.energyLevel += eatVeg/15;
		if (this.energyLevel > 100) {
			this.energyLevel = 100;
		}
	}

	/**
	 * Tries to eat a cookie based on a set portion of weight, increases energy level of human and weight based on portion of meal is partaken in successfully
	 * @param food Cookie cookie to be eaten
	 * @param grams double weight in grams of veg to be eaten
	 */
	public void eat(Cookie food, double grams) {
		int eatCookie = food.eaten(grams);
		if (eatCookie==-1) {
			System.out.println("I don't have that much " + food.getName());
			return;
		}
		if (eatCookie==-2) {
			System.out.println("This " + food.getName() + " is harder to get into than Fort Knox!");
			return;
		}
		this.weight+=grams/1000; //adds weight based on cookie eaten from g to kg
		this.energyLevel += eatCookie/15;
		if (this.energyLevel > 100) {
			this.energyLevel = 100;
		}
	}

	/**
	 * Gets all attributes and formats it into a printable string
	 * @return labels + attributes (name, weight, energylevel, sex, race)
	 */
	public String toString() {
		return "Name: " + this.name + "\nWeight: " + this.weight + "\nEnergy Level: " + this.energyLevel + "%\nRace: " + this.race + "\nSex: " + this.sex;
	}

	//Accessors


	/**
	 * Gets the name of the human
	 * @return the name of the human
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Gets the weight of the human
	 * @return the weight of the human
	 */
	public double getWeight() {
		return this.weight;
	}
	/**
	 * Gets the energy level of the human
	 * @return the energy level of the human
	 */
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	/**
	 * Gets the race of the human
	 * @return the race of the human
	 */
	public String getRace() {
		return this.race;
	}
	/**
	 * Gets the sex of the human
	 * @return the sex of the human
	 */
	public String getSex() {
		return this.sex;
	}

	//Mutators

	/**
	 * changes the name of the human
	 * @param newName new name to be inherited
	 */
	public void changeName(String newName) {
		this.name = newName;
	}
	/**
	 * changes the weight of the human, based on an entire new value or a value to append
	 * @param append whether to inherit or append newWeight
	 * @param newWeight new weight to be used
	 */
	public void changeWeight(boolean append, double newWeight) {
		if (append) {
			this.weight+=newWeight;
			return;
		}
		this.weight = newWeight;
	}
	/**
	 * changes the energy level of the human, and restricts energy level to a scale of 1-100
	 * @param append whether to append or inherit newEnergyLevel
	 * @param newEnergyLevel new energy level to be used
	 */
	public void changeEnergyLevel(boolean append, int newEnergyLevel) {
		if (append) {
			this.energyLevel += newEnergyLevel;
			return;
		}
		this.energyLevel = newEnergyLevel;
		if (this.energyLevel > 100) {
			this.energyLevel = 100;
		}
		if (this.energyLevel < 0) {
			this.energyLevel = 0;
		}
	}
	/**
	 * changes the race of the human
	 * @param newRace new race to be inherited
	 */
	public void changeRace(String newRace) {
		this.race = newRace;
	}
	/**
	 * changes the sex of the human
	 * @param newSex new sex to be inherited
	 */
	public void changeSex(String newSex) {
		this.sex = newSex;
	}

	// public static void main(String[] args) {
// 		Human frank = new Human ("frank", 50, 12, "antarctican", "male");
// 		Human jeff = new Human ("Susan", 12, 98, "atlantian", "monkey");
// 		System.out.println(frank.getEnergyLevel());
// 		System.out.println(frank.getWeight());
// 		System.out.println(jeff.getSex());
// 		System.out.println(jeff.getName());
// 		System.out.println(frank.toString());
// 		System.out.println(jeff.toString());
// 		frank.run(10);
// 		frank.run(2);
// 		jeff.changeSex("male");
// 		jeff.changeSex("female");
// 		jeff.eat(700);
// 		frank.sleep(48);
// 		System.out.println(frank.toString());
// 		System.out.println(jeff.toString());
// 	}
}