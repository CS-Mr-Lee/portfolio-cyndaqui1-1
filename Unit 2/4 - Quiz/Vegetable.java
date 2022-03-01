/**
 * Name: Franklin Zhang
 * Date: Feb 23 2022
 * Description:
 * This vegetable class defines the attributes of a vegetable: color, name,
 * calories, weight, edible or not, is green or not. In this exercise we learned
 * how to create our own constructors and mutator and accessor methods to change
 * or access the attributes of this class.
 */
public class Vegetable {

  /*
   * Attributes
   */
  /** Color of the vegetable */
  private String color;
  /** name of the vegetable */
  private String name;
  /** amount of calories the vegetable has */
  private int calories;
  /** weight of the vegetable in grams */
  private double weight;
  /** if the vegetable is edible or not */
  private boolean isEdible;
  /** if the vegetable is green or not */
  private boolean isGreen;

  // Veggetable Constructors

  public Vegetable() { // Empty constructor provides a default object
    this.name = "";
    this.weight = -1;
    this.calories = -1;
  }

  /**
   * Creates a beta vegetable
   * @param name String expected new name of veggie
   * @param weight double expected new name of veggie
   * @param calories integer expected new calories of veggie
   */
  public Vegetable(String name, double weight, int calories) {
    this.name = name;
    this.weight = weight;
    this.calories = calories;
  }

  /**
   * Filled constructor initializes a vegetable object with the following
   * attributes
   * 
   * @param color    -> the color of the vegetable
   * @param name     -> the name of the vegetable
   * @param calories -> amount of calories the vegetable has
   * @param weight   -> weight of the vegetable in grams
   * @param isEdible -> if the vegetable can be eaten
   * @param isGreen  -> if the vegetable is green
   */
  public Vegetable(String color, String name, int calories, double weight, boolean isEdible, boolean isGreen) {
    this.color = color;
    this.name = name;
    this.isEdible = isEdible;
    this.isGreen = isGreen;

    // Calories cannot be less than 1
    if (calories < 1) {
      this.calories = 1;
    } else {
      this.calories = calories;
    }

    // Weight must not be less than 1
    if (weight < 1) {
      this.weight = 1;
    } else {
      this.weight = weight;
    }
  }

  /**
   * Gets the color of the vegetable
   * 
   * @return the color of the vegetable
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Gets the name of the vegetable
   * 
   * @return the name of the vegetable
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the calories of the vegetable
   * 
   * @return the calories of the vegetable
   */
  public int getCalories() {
    return this.calories;
  }

  /**
   * Gets the weight of the vegetable
   * 
   * @return the weight of the vegetable
   */
  public double getWeight() {
    return this.weight;
  }

  /**
   * Changes the weight attribute value with the passed value
   * 
   * @param weight -> the new weight of the vegetable
   */
  public void setWeight(double weight) {
    // Weight cannot be less than 1
    if (weight < 1) {
      this.weight = 1;
    } else {
      this.weight = weight;
    }
  }

  /**
   * Gets whether or not this vegetable can be eaten
   * 
   * @return true or false value of whether or not this vegetable is edible
   */
  public boolean getIsEdible() {
    return this.isEdible;
  }

  /**
   * Gets whether or not this vegetable is green
   * 
   * @return ture or false value of whether or not this vegetable is green
   */
  public boolean getIsGreen() {
    return this.isGreen;
  }

  // Other Methods


  /**
   * The veggie is eaten, unless they cannot abide by the laws of mathematics and give an unreasonable weight amount or the veggie is a harbinger of death. returns the amount of calories eaten by a set formula. Also reduces the cookuie based ot amount eaten
   * @param weight double expected weight of veggie to be eaten
   * @return amouhnt of calories gained from eating portion given of veggie, or if veggie is eaten or not based on events
   */
  public int eaten(double weight) {
    if (weight > this.weight) {
      return -1;
    }
    if (!this.isEdible) {
      return -2;
    }
    int ret_value = this.calories/(this.weight/weight);
    this.weight-=weight;
    return ret_value;
  }

  /**
   * Returns a string of important information of veggie
   * @return a concatenated string of labels and veggie attributes
   */
  public String toString() {
    return "Name: " + this.name + "\nColor: " + this.color + "\nWeight: " + this.weight + "\nCalories: " + this.calories + "\nGreen? " + this.isGreen + "\nPoisonous? " + !this.isEdible;
  }

}