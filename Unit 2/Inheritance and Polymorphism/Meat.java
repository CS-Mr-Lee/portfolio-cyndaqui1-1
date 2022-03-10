/**
 * Name: Franklin and Mike
 * Date: March 4 2022
 * Description:
 * This is a meat class that contains properties of a meat. It inherits the Food
 * class but has a few attributes specific to itself.
 * 
 * @see Food
 */
public class Meat extends Food {

  // Attributes
  /** organ that the meat comes from */
  private String organ;
  /** animal that the meat comes from */
  private String animal;
  /** if the meat is raw */
  private boolean isRaw;

  /**
   * Initialises a default instance of Meat which inherits the properties of Food
   */
  public Meat() {
    super();
    this.organ = "";
    this.animal = "";
    this.isRaw = false;
  }

  /**
   * Full constructor for meat takes in all attributes that define its super class
   * and also initialises the attributes that belong to Meat only
   *
   * @param name        -> name of the Meat
   * @param weight      -> weight of the Meat
   * @param nutrition   -> nutrition facts of the Meat
   * @param temperature -> temperature of the Meat
   * @param dirty       -> is the Meat dirty
   * @param color       -> color of the meat
   * @param cuisine     -> cuisine the meat comes from
   * @param flavour     -> flavour profile of the meat
   * @param spiciness   -> the spiciness level of the meat
   * @param organ       -> which organ the Meat comes from
   * @param animal      -> the animal the Meat comes from
   * @param isRaw       -> whether the Meat is raw or not
   */
  public Meat(String name, double weight, double[] nutrition, String temperature, boolean dirty, String cuisine,
      String color, String flavour, int spiciness, String organ, String animal, boolean isRaw) {
    super(name, weight, nutrition, temperature, dirty, cuisine, color, flavour, spiciness);
    this.organ = organ;
    this.animal = animal;
    this.isRaw = isRaw;
  }

  // Methods

  /**
   * Reconstruct the animal from the Meat
   * 
   * @return invokes the Animal constructor to create a new animal from the meat
   */
  public Animal reconstructAnimal(Meat meat) {
    return new Animal(meat.getName(), 1, "meow");
  }

  /**
   * Performs a ritual using the meat
   * 
   * @param int grams -> portion of meat in grams to be used in the ritual
   */
  public void performRitual(int grams) {
    if (grams < 0) { // A negative value cannot be accepted
      System.out.println("The gods shall not grant thy food, peon!");
      return;
    }
    if (grams > this.getWeight()) { // A ritual cannot be performed without sufficient amount of meat
      System.out.println("Air is not an acceptable replacement for meat");
      return;
    }
    this.setWeight(this.getWeight() - grams);
    System.out.println("The gods are happy");
  }

  /**
   * puts the meat on a bruise, returns integers 1,0,-1 based on if the meat is
   * hot,cold, or warm when applied to bruise
   * 
   * @return integer effect of meat put on bruise in values of -1,0,1
   */
  public int putOnBruise() {
    if (this.getTemperature().equals("Hot")) {
      System.out.println("Yeowch!");
      return -1;
    }
    if (this.getTemperature().equals("Warm")) {
      System.out.println("No effect");
      return 0;
    }
    System.out.println("MMMmmmmMMmMMmMMmNNIFBGEUGOWUQGR");
    return 1;
  }

  /*
   * Accessors
   */

  /**
   * Gets the organ the meat comes from
   * 
   * @return String what organ is the meat
   */
  public String getOrgan() {
    return this.organ;
  }

  /**
   * Gets the name of the animal the meat comes from
   * 
   * @return String animal in which the meat originated from
   */
  public String getAnimal() {
    return this.animal;
  }

  /**
   * Gets if the meat is raw or not
   * 
   * @return boolean is the meat raw
   */
  public boolean isRaw() {
    return this.isRaw;
  }

  // Mutators

  /**
   * Sets the new organ the meat comes from
   * 
   * @param organ -> new organ of meat
   */
  public void setOrgan(String organ) {
    this.organ = organ;
  }

  /**
   * Changes the animal the meat comes from
   * 
   * @param animal -> new animal of meat
   */
  public void setAnimal(String animal) {
    this.animal = animal;
  }

  /**
   * Overrides default toString() method and provides all useful info for Meat
   * 
   * @return the information of all attributes for meat
   */
  @Override
  public String toString() {
    return super.toString() + "\nAnimal: " + this.animal + "\nOrgan: " + this.organ + "\nRaw? " + this.isRaw;
  }

}
