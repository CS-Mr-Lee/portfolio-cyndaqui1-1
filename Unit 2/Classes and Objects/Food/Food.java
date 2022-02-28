

/**
* Name:
* Date:
* Description:
*/
public class Food {

   /*
   Constants related to servingTemp
   */
   private final int COLD = 0;
   private final int WARM = 1;
   private final int HOT = 2;
   
   /**
   Constants related to max temperatures to heat up to index is related to the servingTemp
   */
   private final double [] MAX_TEMP = {41, 135, 200};

   
   /*
   Attributes
   */
   
   private String name;
   
   /**
   used to find the serving temperature for the food
   */
   private int servingTemp;
   /**
   the current temperature of the food in fahrenheit
   */
   private double currTemp;
   
   //You shouldn't do this... why not? 
   /**
   the current weight of the food in grams
   */
   public double weight;
   
   
   /*
   Constructor
   */
   public Food(String name, double weight, String servingTempText, double currTemp) {
      this.name = name;
      this.weight = weight;
      this.currTemp = currTemp;
      
      if (servingTempText.equalsIgnoreCase("cold")) {
         this.servingTemp = COLD;
      } else if (servingTempText.equalsIgnoreCase("warm")) {
         this.servingTemp = WARM;
      } else {
         this.servingTemp = HOT;
      }
   }
   
   
   /*
      Methods - Accessors
   */
   public String getName() {
      return this.name;
   }
   
   public double getCurrTemp() {
      return this.currTemp;
   }
   
   /*
      Methods - Mutators
   */
   
   /**
      Heats the food up by 10 degrees, provided it is under the expected heating temp
      If the temperature will exceed the serving temp, it will only match the serving temperature
   */
   public void heatUp() {
      if (currTemp + 10 > MAX_TEMP[servingTemp]) {
         currTemp = MAX_TEMP[servingTemp];
      } else { 
         currTemp += 10;
      }
   }
}
