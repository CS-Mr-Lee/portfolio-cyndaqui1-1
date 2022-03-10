/**
 * Name: Franklin and Mike
 * Date: March 4 2022
 * Description:
 * Class Food has attributes that define it and also provides extra methods that
 * are associated with consuming and preparing food.
 */
public class Food {

  /** name of the food */
  private String name;
  /** weight of the food */
  private double weight;
  /** nutrition of the food */
  private double[] nutrition;
  /** temperature of the food */
  private String temperature;
  /** is the food dirty */
  private boolean dirty;
  /** cuisine of food */
  private String cuisine;
  /** color of the food */
  private String color;
  /** flavoring of food */
  private String flavour;
  /** how spicy is the food */
  private int spiciness;

  /**
   * constructor for default Food
   */
  public Food() {
    this.name = "";
    this.weight = -1;
    this.nutrition = new double[] {
        -1, -1, -1, -1, -1
    };
    this.temperature = "";
    this.dirty = false;
    this.cuisine = "";
    this.color = "";
    this.flavour = "";
    this.spiciness = -1;
  }

  /**
   * constructor for proper Food with all the attributes
   * 
   * @param name        -> name of the food
   * @param weight      -> weight of the food in grams
   * @param nutrition   -> nutrition facts of the food
   * @param temperature -> temperature of the food: Hot, Cold, Warm
   * @param dirty       -> if the food is dirty
   * @param cuisine     -> the cuisine this food originates from
   * @param color       -> the color of the food
   * @param flavour     -> the flavour profile
   * @param spiciness   -> the spiciness level
   */
  public Food(String name, double weight, double[] nutrition, String temperature, boolean dirty, String cuisine,
      String color, String flavour, int spiciness) {
    this.name = name;
    this.weight = weight;
    this.nutrition = nutrition;
    this.temperature = temperature;
    this.dirty = dirty;
    this.cuisine = cuisine;
    this.color = color;
    this.flavour = flavour;
    this.spiciness = spiciness;
  }

  /*
   * Accessors
   */

  /**
   * Gets the name of the food
   * 
   * @return String name of food
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the weight of the food
   * 
   * @return double weight of food
   */
  public double getWeight() {
    return this.weight;
  }

  /**
   * Gets the nutrition value of the food
   * 
   * @return double array nutrition values of food
   */
  public double[] getNutrition() {
    return this.nutrition;
  }

  /**
   *
   * @return String temperature of food
   */
  public String getTemperature() {
    return this.temperature;
  }

  /**
   * Gets whether the food is dirty or not
   * 
   * @return boolean is the food dirty
   */
  public boolean isDirty() {
    return this.dirty;
  }

  /**
   * Gets the cuisine of food
   * 
   * @return the cuisine of food
   */
  public String getCuisine() {
    return this.cuisine;
  }

  /**
   * Gets the color of food
   * 
   * @return the color of food
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Gets the flavour of food
   * 
   * @return the flavour of food
   */
  public String getFlavour() {
    return this.flavour;
  }

  /**
   * Gets the spiciness level of food
   * 
   * @return the spiciness of food
   */
  public int getSpiciness() {
    return this.spiciness;
  }

  /*
   * Mutators
   */

  /**
   * Sets the name of the Food
   * 
   * @param name -> the new name of the food
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the weight of the food
   * 
   * @param weight -> the new weight of the food
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /**
   * Sets the nutrition value of Food
   * 
   * @param nutrition -> the nutrition value of the food to be set
   */
  public void setNutrition(double[] nutrition) {
    this.nutrition = nutrition;
  }

  /**
   * Sets the temperature of the Food
   * 
   * @param temperature -> the new temperature to be set
   */
  public void setTemperature(String temperature) {
    if (!temperature.equals("Hot") || !temperature.equals("Cold") || !temperature.equals("Warm")) {
      return;
    }
    this.temperature = temperature;
  }

  /**
   * Sets the cuisine of the food
   * 
   * @param cuisine -> the new cuisine to be set
   */
  public void setCuisine(String cuisine) {
    this.cuisine = cuisine;
  }

  /**
   * Sets the spiciness of the food
   * 
   * @param spiciness -> the new spiciness level to be set
   */
  public void setSpiciness(int spiciness) {
    this.spiciness = spiciness;
    if (spiciness > 3000000) {
      spiciness = 3000000;
    }
    if (spiciness < 0) {
      spiciness = 0;
    }
  }

  /**
   * Gets the caloric amount and nutrition content from consuming the Food
   * 
   * @return an array of nutrition information
   */
  public double[] eat(int grams) {
    double[] ret_value = {
        nutrition[0] / (this.weight / grams),
        nutrition[1] / (this.weight / grams),
        nutrition[2] / (this.weight / grams),
        nutrition[3] / (this.weight / grams),
        nutrition[4] / (this.weight / grams)
    };
    return ret_value;
  }

  /**
   * Chops a vegetable by setting the weight in half
   * Overloaded method accepts Vegetable
   * 
   * @return the chopped Vegetable
   */
  public Vegetable chop(Vegetable veggie) {
    veggie.setWeight(veggie.getWeight() / 2);
    return veggie;
  }

  /**
   * Chops a meat by setting the weight in half
   * Overloaded method accepts meat
   * 
   * @return chopped meat with half of weight
   */
  public Meat chop(Meat meat) {
    meat.setWeight(meat.getWeight() / 2);
    return meat;
  }

  /**
   * Cooks the Food by setting the temperature attribute to hot
   */
  public void cook() {
    this.temperature = "Hot";
  }

  /**
   * Sets the dirty attribute to false because it has been washed
   */
  public void wash() {
    this.dirty = false;
  }

  /**
   * Refrigerate the Food by setting the temperature to cold
   */
  public void refrigerate() {
    this.temperature = "Cold";
  }

  /**
   * Overrides default toString() method and provides all useful info for Food
   * 
   * @return the information of all attributes for food
   */
  @Override
  public String toString() {
    return this.name + "\nWeight: " + this.weight + "\nFats: " + this.nutrition[0] + "\nSodium: " + this.nutrition[1] +
        "\nProteins: " + this.nutrition[2] + "\nCarbohydrates: " + this.nutrition[3] + "\nSugar: " + this.nutrition[4]
        + "\n" +
        this.temperature + "\nDirty? " + this.dirty + "\nCuisine: " + this.cuisine + "\nFlavoring: " + this.flavour
        + "\nSpiciness: " + this.spiciness;
  }

}
