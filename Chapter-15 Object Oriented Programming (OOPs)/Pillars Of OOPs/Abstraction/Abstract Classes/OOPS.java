public class OOPS {
  public static void main(String[] args) {
    // Animal a = new Animal();       // ❌ Cannot instantiate abstract class
    Fish f = new Fish();
    f.eat();                          // "Fish eats insects"
    f.breathe(); 
  }
}

// Abstract class — cannot be instantiated
abstract class Animal {
  Animal(){
    System.out.println("Animal Constructor called..");
  }

  String color;

  // Abstract method — no body, MUST be overridden
  abstract void eat();

  // Normal method — has body
  void breathe() {
    System.out.println("Animal breathes");
  }
}

class Fish extends Animal {
  Fish(){
    System.out.println("Fish Constructor called..");
  }

  void eat() {                          
    System.out.println("Fish eats insects");
  }

  void swim() {
    System.out.println("Fish swims");
  }
}
//Abstract Classes

