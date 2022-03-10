public class Animal {

  /*
   * NOTE:
   * Do not mark this, there is no header; barebones class
   */

  private String name;
  private int legs;
  private String sound;

  public Animal(String name, int legs, String sound) {
    this.name = name;
    this.legs = legs;
    this.sound = sound;
  }

  // Methods

  public void makeSound() {
    System.out.println(this.sound);
  }

  // Accessors

  public String getName() {
    return this.name;
  }

  public int getLegs() {
    return this.legs;
  }

  public String getSound() {
    return this.sound;
  }

  // Mutators

  public void changeName(String name) {
    this.name = name;
  }

  public void changeSound(String sound) {
    this.sound = sound;
  }

  public void changeLegs(int legs) {
    this.legs = legs;
  }
}
