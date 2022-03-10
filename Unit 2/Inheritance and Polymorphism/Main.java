/**
 * Name: Franklin and Mike
 * Date: March 4 2022
 * Description: 
 */
public class Main {
  public static void main(String[] args) {

    Food airplaneFood = new Food("Airplane food", 420, new double[] {
        32,
        40,
        21,
        53,
        52
    }, "Warm", false, "American", "RGB", "Stale", 0);

    System.out.println(airplaneFood.toString());

    Meat airplaneMeat = new Meat("Airplane meat", 420, new double[] {
        32,
        40,
        21,
        53,
        52
    }, "Warm", false, "American", "RGB", "Stale", 0, "heart", "Vithuren", true);

    System.out.println(airplaneMeat.toString());

  }
}
