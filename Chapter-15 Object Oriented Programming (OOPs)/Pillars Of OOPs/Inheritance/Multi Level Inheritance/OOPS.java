public class OOPS{
  public static void main(String args[]){
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
  }
}

//Base Class
class Animal {
  String color;

  void eat(){
    System.out.println("eats");
  }

  void breathe(){
    System.out.println("breathes");
  }
}

// ⬇️ inherites animal
class Mammal extends Animal {
  int legs;
}

// ⬇️ inherites mammal
class Dog extends Mammal {
  String breed;
}
//Multi Level Inheritance


