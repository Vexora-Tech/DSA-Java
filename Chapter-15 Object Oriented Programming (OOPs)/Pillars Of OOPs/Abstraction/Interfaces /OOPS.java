public class OOPS {
  public static void main(String[] args) {
    Fish f = new Fish();
    f.eat();        // "Fish eats insects"
    f.breathe();    // "Fish breathes through gills"
    f.swim();       // "Fish swims in water"
  }
}

// Interface — all methods are abstract by default
interface Animal {
  // public abstract — by default
  void eat();
  void breathe();
}

interface Swimmable {
  void swim();
}

// A class can implement MULTIPLE interfaces
class Fish implements Animal, Swimmable {
  public void eat() {
    System.out.println("Fish eats insects");
  }

  public void breathe() {
    System.out.println("Fish breathes through gills");
  }

  public void swim() {
    System.out.println("Fish swims in water");
  }
}
//Interfaces

