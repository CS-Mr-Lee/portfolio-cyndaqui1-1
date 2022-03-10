/**
 * Name: Franklin and Mike
 * Date: March 4 2022
 * Description:
 * This class inherits the properties of the Food superclass but has an
 * attribute specific to itself as well.
 * 
 * @see Food
 */
public class Vegetable extends Food {

  // Attributes

  /** String plant type of vegetable */
  private String plantType;

  /**
   * Initialises a default instance of Vegetable which inherits the properties of
   * Food
   */
  public Vegetable() {
    super();
    this.plantType = "";
  }

  /**
   * Full constructor for Vegetable takes in all attributes that define its super
   * class
   * and also initialises the attributes that belong to Vegetable only
   *
   * @param name        -> name of the Vegetable
   * @param weight      -> weight of the Vegetable
   * @param nutrition   -> nutrition facts of the Vegetable
   * @param temperature -> temperature of the Vegetable
   * @param dirty       -> is the Vegetable dirty
   * @param color       -> color of the Vegetable
   * @param cuisine     -> cuisine the Vegetable comes from
   * @param flavour     -> flavour profile of the Vegetable
   * @param spiciness   -> the spiciness level of the Vegetable
   * @param plantType   -> the plant the vegetable comes from or is
   */
  public Vegetable(String name, double weight, double[] nutrition, String temperature, boolean dirty, String cuisine,
      String color, String flavour, int spiciness, String plantType) {
    super(name, weight, nutrition, temperature, dirty, cuisine, color, flavour, spiciness);
    this.plantType = plantType;
  }

  /**
   * Methods
   */

  /**
   * Offer a prayer using amount and deducts amount from veggie when used.
   * Punishes peon if scandals are attempted
   * 
   * @param grams -> portion of vegetable in grams to be used to offer
   *              prayer to the gods
   */
  public void offerPrayer(double grams) {
    if (this.getWeight() < grams || this.getWeight() < 0) {
      System.out.println("The gods see through all, now repent for you have sinned");
      this.setWeight(0);
      return;
    }
    this.setWeight(getWeight() - grams);
    System.out.println("You have offered " + grams + " grams of " + this.getName() + " to god");
    System.out.println("Amen");
  }

  // Accessors

  /**
   * @return plant type of veggie
   */
  public String getPlantType() {
    return this.plantType;
  }

  // Mutators

  /**
   * @param plantType -> new plant type to be assigned to veggie
   */
  public void setPlantType(String plantType) {
    this.plantType = plantType;
  }

  /**
   * Overrides default toString() method and provides all useful info for
   * Vegetable
   * 
   * @return the information of all attributes for vegetable
   */
  @Override
  public String toString() {
    return super.toString() + "\nPlant Type: " + this.plantType;
  }

}
