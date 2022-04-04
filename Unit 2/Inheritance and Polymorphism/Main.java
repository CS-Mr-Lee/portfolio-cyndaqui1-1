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

        // Testing original classes
        OriginalMeat originalMeat = new OriginalMeat("original meat", 420, new double[] {
            32,
            40,
            21,
            53,
            52
        }, "Warm", false, "American", "RGB", "Stale", 0, "", "", false);
        System.out.println(originalMeat.toString()); // Should print out all attributes of originalMeat
        OriginalMeat defaultOriginalMeat = new OriginalMeat();
        defaultOriginalMeat.cook(); // calls a method from defaultOriginalMeat object too change its attribute
        System.out.println(defaultOriginalMeat.getTemperature()); // Changes the temperature of the meat
        defaultOriginalMeat.performRitual(20); // Performs ritual on 20 grams of meat
        System.out.println(defaultOriginalMeat.toString()); // Should print out default attributes of defaultOriginalMeat


        OriginalVegetable originalVeggie = new OriginalVegetable("original greens", 420, new double[] {
            32,
            40,
            21,
            53,
            52
        }, "Warm", false, "American", "RGB", "Stale", 0, "legume");
        System.out.println(originalVeggie.toString()); // Should print out default attributes of originalVeggie
        OriginalVegetable defaultOriginalVeggie = new OriginalVegetable();
        defaultOriginalVeggie.offerPrayer(3.5); // Calls the prayer method of defaultOriginalVeggie
        System.out.println(defaultOriginalVeggie.toString()); // Should print out default attributes of defaultOriginalVeggie
        defaultOriginalVeggie.refrigerate();
        System.out.println(defaultOriginalVeggie.getTemperature());


        // Using the Food class to create a Food
        Food airplaneFood = new Food("Airplane food", 420, new double[] {
            32,
            40,
            21,
            53,
            52
        }, "Warm", false, "American", "RGB", "Stale", 0);
        Food defaultFood = new Food(); // Default food
        double[] amountOfFoodEaten = defaultFood.eat(12); // Eats some grams of food
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
        int bruise = defaultMeat.putOnBruise(); // checks if human will get bruise from meat temperature
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
        airplaneVeggie.offerPrayer(69); // offers prayers with veggie, deducting 69 grams of vegetable from the original veggie
        airplaneVeggie.setPlantType("flower");
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
        airplaneFoodVeggie.setPlantType("root veggie") // should be able to access the subclass's methods, so we call the set plant type method 
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
        airplaneFoodMeat.setAnimal("Cow") // should be able to access the subclass's methods, so we call the set animal method 
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
