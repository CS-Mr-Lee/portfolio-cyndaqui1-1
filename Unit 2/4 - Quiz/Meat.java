

public class Meat {
   /*
   Attributes
   */
   
   /** the type of animal it comes from */
   private String animal;
   
   /** the part of the animal */
   private String organ;
   
   /** the weight of the meat */
   private double weight;
   
   /** whether the meat has a bone*/
   private boolean hasBone;
   
   /** how much percentage fat is in the meat */
   private double fatContent;
   
   /*
   Constructor
   */
   /**
   
   */
//    public Meat(String a, String o, double f, double w, boolean hB){
//       this.animal = a; //we are initializing the attribute with the parameter
//       
//    }
   /**
   Meat
   Creates a basic meat
   @param animal the type of animal
   @param organ the organ in the animal
   @param fatContent the percentage of fat
   @param weight the weight of the meat in grams
   @param hasBone whether there is a 20g bone
   */
   public Meat(String animal, String organ, double fatContent, double weight, boolean hasBone){
      this.animal = animal; //we are initializing the attribute with the parameter
      this.organ = organ;
      this.hasBone = hasBone;
      
      //setting restrictions for fatContent attribute
      if (fatContent < 0) {
         this.fatContent = 0;
      } else if (fatContent > 100) {
         this.fatContent = 100;
      } else {
         this.fatContent = fatContent;
      }
      
      
      
      //initializing weight depending on bone content
      if (hasBone) {
         if (weight < 20) {
            this.weight = 20;
         } else {
            this.weight = weight;
         }
      } else { 
         if (weight < 0) {
            this.weight = 0;
         } else {
            this.weight = weight;
         }

      }
      
   }
   
   /*
   Methods
   */
   
   //Accessors
   
   /**
   Gets the type of animal
   @return the animal name
   */
   public String getAnimal() {
      return this.animal;
   }
   
   /**
   Gets the organ
   @return the organ the meat is from
   */
   public String getOrgan() {
      return this.organ;
   }
   
   /**
   gets the weight of the meat in grams
   @return the meat weight in grams
   */
   public double getWeight() {
      return this.weight;
   }
   
   /**
   gets whether the bone exists
   @return boolean whether there is a bone
   */
   public boolean getHasBone() { 
      return this.hasBone;
   }
   
   /**
   Gets the fat content
   @return the fat content as a percentage
   */
   public double getFatContent() {
      return this.fatContent;
   }
   
   /*
   Mutators
   */
   /**
   changes the weight of the meat; cannot be less than 0 
   nor greater than the original weight
   @param newWeight expected new weight
   */
   public void setWeight(double newWeight) {
      //make it not bigger than original, must be > 0
      
      if (newWeight > this.weight) {
         this.weight = this.weight; //not to do anything
      } else if (newWeight < 0)  { //restriction from negative weight
         this.weight = 0; 
      } else if (newWeight == 0) { //specifically for 0
         this.weight = 0;
      } else { //all other cases
         this.weight = newWeight;
      }
   }
   //setFatContent - between 0 and 100 inclusive,
   
   /**
   remove the bone if it had a bone
   */
   public void debone() {
      if (this.hasBone) {
         this.hasBone = false;
      }
   }
}
