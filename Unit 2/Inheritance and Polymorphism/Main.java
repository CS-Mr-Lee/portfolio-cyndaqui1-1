/**
 * Name: Franklin and Mike
 * Date: March 4 2022
 * Description:
 * In this assignment we created a Food superclass and a meat and vegetable
 * subclass that inherits the Food superclass. We test polymorphism through
 * casting the Food superclass objects into Meat or Vegetable subclass objects.
 */
public class Main {
  public static void main(String[] args) {

    // Using the Food class to create a Food
    Food airplaneFood = new Food("Airplane food", 420, new double[] {
        32,
        40,
        21,
        53,
        52
    }, "Warm", false, "American", "RGB", "Stale", 0);
    Food defaultFood = new Food(); // Default food

    // Using the class method of toString() to display important info
    System.out.println(airplaneFood.toString());

    // Using the Meat class to create a Meat
    Meat airplaneMeat = new Meat("Airplane meat", 420, new double[] {
        32,
        40,
        21,
        53,
        52
    }, "Warm", false, "American", "RGB", "Stale", 0, "heart", "Vithuren", true);
    Meat defaultMeat = new Meat(); // Default meat uses the default constructor
    // Using the class method of toString() to display important info
    System.out.println(airplaneMeat.toString());

    // Using the Vegetable class to create a Vegetable
    Vegetable airplaneVeggie = new Vegetable("Airplane greens", 420, new double[] {
        32,
        40,
        21,
        53,
        52
    }, "Warm", false, "American", "RGB", "Stale", 0, "legume");
    Vegetable defaultVeggie = new Vegetable();
    // Using the class method of toString() to display important info
    System.out.println(airplaneVeggie.toString());

    // Demonstrating polymorphism of a Food object that is created as a Vegetable
    // instance
    Food airplaneFoodVeggie = new Vegetable("Airplane greens", 420, new double[] {
        32,
        40,
        21,
        53,
        52
    }, "Warm", false, "American", "RGB", "Stale", 0, "legume");

    // Using the class method of toString() to display important info
    System.out.println(airplaneFoodVeggie.toString());

    // Demonstrating polymorphism of a Food object that is created as a Meat
    // instance
    Food airplaneFoodMeat = new Meat("Airplane meat", 420, new double[] {
        32,
        40,
        21,
        53,
        52
    }, "Warm", false, "American", "RGB", "Stale", 0, "heart", "Vithuren", true);

    // Using the class method of toString() to display important info
    System.out.println(airplaneFoodMeat.toString());

    if (airplaneFoodMeat instanceof Meat) { // This means that the superclass Food has 'morphed' into a Meat object,
                                            // thus can be considered as an instance of Meat
      System.out.println("Polymorphism!");
    }
    if (!(airplaneFoodMeat instanceof Vegetable)) { // Testing if airplaneFoodMeat is not an instance of Vegetable, it
                                                    // is not
      // because the superclass Food is being morphed through polymorphism to
      // a Meat instance, not a Vegetable instance
      System.out.println(
          "It doesn't work because airplaneFoodMeat is a Food object which is a Meat instance, not a Vegetable instance");
    }

    // Using casting and instance of to demonstrate polymorphism because the
    // superclass theoretically can morph into a subclass object
    Meat newAirplaneMeat = new Meat();

    if (airplaneFoodMeat instanceof Meat) { // Checking if airplaneFoodMeat is an instance of Meat
      newAirplaneMeat = (Meat) airplaneFoodMeat; // Cast the Food object to a meat object because the superclass is able
                                                 // to morph into a subclass through polymorphism
    }

    System.out.println(newAirplaneMeat.toString()); // Should give attributes of a airplaneFoodMeat
    System.out.println(newAirplaneMeat instanceof Meat); // Prints out true, meaning we have casted the Food object to a
                                                         // Meat object

  }
}
