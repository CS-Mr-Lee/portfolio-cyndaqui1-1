/**
* Name:
* Date:
* Description:
*/


public class TestingFood {
   public static void main (String [] args) { 
   
      //create a food
      Food mrLeesFood = new Food("Lasagna", 400, "hot", 150);
      System.out.println(mrLeesFood.getName() + " is now " + mrLeesFood.getCurrTemp() + " degrees fahrenheit.");
      mrLeesFood.heatUp();
      System.out.println(mrLeesFood.getName() + " is now " + mrLeesFood.getCurrTemp() + " degrees fahrenheit.");
      System.out.println(mrLeesFood.getName() + " is " + mrLeesFood.weight + "g.");
      
      //1. Create your own food.
      
      //2. Try to print out the name of your food.
      //   Can you print it with a method? (Does the method currently exist)
      //   Can you print it with the attribute?
      
      //3. Try to print out the weight of the food.
      //   Can you print it with a method? (Does the method currently exist)
      //   Can you print it with the attribute? 
      
      
      //4. Can you change the name of the food?
      //   Why might we not want to change the food name?
      
      
      //5. In the food class, is the access modifier for weight public or private?
      //   Answer:
      
      
      //6. Change the weight to -50, and print it out.  Is it possible?
      
      
      //7. Why might we not want to have a public attribute?
      //   What could be a suitable method to allow us to change the attribute?
      
      
      
      //8. Can you heat up the food? Alternate heating up the food and printing the temperature.
      //   How does it act?
      
      
      //9. Finish adding commenting to the Food class.
   }
}