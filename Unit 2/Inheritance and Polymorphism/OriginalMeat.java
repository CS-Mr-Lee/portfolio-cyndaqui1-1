/**
 * Name: Franklin and Mike
 * Date: March 4 2022
 * Description:
 * Class Original Meat has attributes that define it and also provides extra methods that
 * are associated with consuming and preparing Meat.
 */
public class OriginalMeat {

    // Attributes
    /** name of the Meat */
    private String name;
    /** weight of the Meat */
    private double weight;
    /** nutrition of the Meat */
    private double[] nutrition;
    /** temperature of the Meat */
    private String temperature;
    /** is the Meat dirty */
    private boolean dirty;
    /** cuisine of Meat */
    private String cuisine;
    /** color of the Meat */
    private String color;
    /** flavoring of Meat */
    private String flavour;
    /** how spicy is the Meat */
    private int spiciness;
    /** organ that the meat comes from */
    private String organ;
    /** animal that the meat comes from */
    private String animal;
    /** if the meat is raw */
    private boolean isRaw;

    /**
     * constructor for default Meat
     */
    public OriginalMeat() {
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
    public OriginalMeat(String name, double weight, double[] nutrition, String temperature, boolean dirty, String cuisine,
        String color, String flavour, int spiciness, String organ, String animal, boolean isRaw) {
        this.name = name;
        this.weight = weight;
        this.nutrition = nutrition;
        this.temperature = temperature;
        this.dirty = dirty;
        this.cuisine = cuisine;
        this.color = color;
        this.flavour = flavour;
        this.spiciness = spiciness;
        this.organ = organ;
        this.animal = animal;
        this.isRaw = isRaw;
    }

    /*
     * Accessors
     */

    /**
     * Gets the name of the Meat
     * 
     * @return String name of Meat
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the weight of the Meat
     * 
     * @return double weight of Meat
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Gets the nutrition value of the Meat
     * 
     * @return double array nutrition values of Meat
     */
    public double[] getNutrition() {
        return this.nutrition;
    }

    /**
     *
     * @return String temperature of Meat
     */
    public String getTemperature() {
        return this.temperature;
    }

    /**
     * Gets whether the Meat is dirty or not
     * 
     * @return boolean is the Meat dirty
     */
    public boolean isDirty() {
        return this.dirty;
    }

    /**
     * Gets the cuisine of Meat
     * 
     * @return the cuisine of Meat
     */
    public String getCuisine() {
        return this.cuisine;
    }

    /**
     * Gets the color of Meat
     * 
     * @return the color of Meat
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Gets the flavour of Meat
     * 
     * @return the flavour of Meat
     */
    public String getFlavour() {
        return this.flavour;
    }

    /**
     * Gets the spiciness level of Meat
     * 
     * @return the spiciness of Meat
     */
    public int getSpiciness() {
        return this.spiciness;
    }

    /*
     * Mutators
     */

    /**
     * Sets the name of the Meat
     * 
     * @param name -> the new name of the Meat
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the weight of the Meat
     * 
     * @param weight -> the new weight of the Meat
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Sets the nutrition value of Meat
     * 
     * @param nutrition -> the nutrition value of the Meat to be set
     */
    public void setNutrition(double[] nutrition) {
        this.nutrition = nutrition;
    }

    /**
     * Sets the temperature of the Meat
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
     * Sets the cuisine of the Meat
     * 
     * @param cuisine -> the new cuisine to be set
     */
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    /**
     * Sets the spiciness of the Meat
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
     * Gets the caloric amount and nutrition content from consuming the Meat
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
     * Cooks the Meat by setting the temperature attribute to hot
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
     * Refrigerate the Meat by setting the temperature to cold
     */
    public void refrigerate() {
        this.temperature = "Cold";
    }

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
     * @return the information of all attributes for Meat
     */
    @Override
    public String toString() {
        return this.name + "\nWeight: " + this.weight + "\nFats: " + this.nutrition[0] + "\nSodium: " +
            this.nutrition[1] +
            "\nProteins: " + this.nutrition[2] + "\nCarbohydrates: " + this.nutrition[3] + "\nSugar: " +
            this.nutrition[4] +
            "\n" +
            this.temperature + "\nDirty? " + this.dirty + "\nCuisine: " + this.cuisine + "\nFlavoring: " +
            this.flavour +
            "\nSpiciness: " + this.spiciness + "\nAnimal: " + this.animal + "\nOrgan: " + this.organ + "\nRaw? " + this.isRaw;
    }

}
