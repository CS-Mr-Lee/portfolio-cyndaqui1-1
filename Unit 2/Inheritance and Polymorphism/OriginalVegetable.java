/**
 * Name: Franklin and Mike
 * Date: March 4 2022
 * Description:
 * Class original Vegetable has attributes that define it and also provides extra methods that
 * are associated with consuming and preparing Vegetable.
 */
public class OriginalVegetable {

    // Attributes

    /** name of the Vegetable */
    private String name;
    /** weight of the Vegetable */
    private double weight;
    /** nutrition of the Vegetable */
    private double[] nutrition;
    /** temperature of the Vegetable */
    private String temperature;
    /** is the Vegetable dirty */
    private boolean dirty;
    /** cuisine of Vegetable */
    private String cuisine;
    /** color of the Vegetable */
    private String color;
    /** flavoring of Vegetable */
    private String flavour;
    /** how spicy is the Vegetable */
    private int spiciness;
    /** String plant type of vegetable */
    private String plantType;

    /**
     * Initialises a default instance of Vegetable which inherits the properties of
     * Vegetable
     */
    public OriginalVegetable() {
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
    public OriginalVegetable(String name, double weight, double[] nutrition, String temperature, boolean dirty, String cuisine,
        String color, String flavour, int spiciness, String plantType) {
        this.name = name;
        this.weight = weight;
        this.nutrition = nutrition;
        this.temperature = temperature;
        this.dirty = dirty;
        this.cuisine = cuisine;
        this.color = color;
        this.flavour = flavour;
        this.spiciness = spiciness;
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

    /*
     * Accessors
     */

    /**
     * Gets the name of the Vegetable
     * 
     * @return String name of Vegetable
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the weight of the Vegetable
     * 
     * @return double weight of Vegetable
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Gets the nutrition value of the Vegetable
     * 
     * @return double array nutrition values of Vegetable
     */
    public double[] getNutrition() {
        return this.nutrition;
    }

    /**
     *
     * @return String temperature of Vegetable
     */
    public String getTemperature() {
        return this.temperature;
    }

    /**
     * Gets whether the Vegetable is dirty or not
     * 
     * @return boolean is the Vegetable dirty
     */
    public boolean isDirty() {
        return this.dirty;
    }

    /**
     * Gets the cuisine of Vegetable
     * 
     * @return the cuisine of Vegetable
     */
    public String getCuisine() {
        return this.cuisine;
    }

    /**
     * Gets the color of Vegetable
     * 
     * @return the color of Vegetable
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Gets the flavour of Vegetable
     * 
     * @return the flavour of Vegetable
     */
    public String getFlavour() {
        return this.flavour;
    }

    /**
     * Gets the spiciness level of Vegetable
     * 
     * @return the spiciness of Vegetable
     */
    public int getSpiciness() {
        return this.spiciness;
    }

    /*
     * Mutators
     */

    /**
     * Sets the name of the Vegetable
     * 
     * @param name -> the new name of the Vegetable
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the weight of the Vegetable
     * 
     * @param weight -> the new weight of the Vegetable
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Sets the nutrition value of Vegetable
     * 
     * @param nutrition -> the nutrition value of the Vegetable to be set
     */
    public void setNutrition(double[] nutrition) {
        this.nutrition = nutrition;
    }

    /**
     * Sets the temperature of the Vegetable
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
     * Sets the cuisine of the Vegetable
     * 
     * @param cuisine -> the new cuisine to be set
     */
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    /**
     * Sets the spiciness of the Vegetable
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
     * Gets the caloric amount and nutrition content from consuming the Vegetable
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
     * Cooks the Vegetable by setting the temperature attribute to hot
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
     * Refrigerate the Vegetable by setting the temperature to cold
     */
    public void refrigerate() {
        this.temperature = "Cold";
    }

    /**
     * Overrides default toString() method and provides all useful info for
     * Vegetable
     * 
     * @return the information of all attributes for vegetable
     */
    @Override
    public String toString() {
        return this.name + "\nWeight: " + this.weight + "\nFats: " + this.nutrition[0] + "\nSodium: " + this.nutrition[1] +
            "\nProteins: " + this.nutrition[2] + "\nCarbohydrates: " + this.nutrition[3] + "\nSugar: " + this.nutrition[4] +
            "\n" +
            this.temperature + "\nDirty? " + this.dirty + "\nCuisine: " + this.cuisine + "\nFlavoring: " + this.flavour +
            "\nSpiciness: " + this.spiciness + "\nPlant Type: " + this.plantType;
    }

}
