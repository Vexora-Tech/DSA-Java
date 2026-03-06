public class OOPS{
  public static void main(String args[]){
    Animal a = new Animal();
    Animal f = new Fish();    
    Animal d = new Dog();     

    a.eat();   
    f.eat();   
    d.eat();   
  }
}

// Base Class
class Animal {
  void eat() {
    System.out.println("Animal eats");
  }

  void breathe() {
    System.out.println("Animal breathes");
  }
}

// Fish overrides eat()
class Fish extends Animal {
  int fins;

  void eat() {
    System.out.println("Fish eats insects near water"); // ✅ Overridden
  }

  void swim() {
    System.out.println("Fish swims in water");
  }
}

// Dog overrides eat()
class Dog extends Animal {
  void eat() {
    System.out.println("Dog eats bones"); // ✅ Overridden
  }
}
//Method Overriding


