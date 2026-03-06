public class OOPS{
  public static void main(String args[]){
    Mammal dog = new Mammal();
    dog.eat();
    dog.walk();

    Fish shark = new Fish();
    shark.eat();
    shark.swim();

    Bird parrot = new Bird();
    parrot.eat();
    parrot.fly();
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

class Mammal extends Animal {
  void walk(){
    System.out.println("walks");
  }
}

class Fish extends Animal {
  void swim(){
    System.out.println("swims");
  }
}

class Bird extends Animal {
  void fly(){
    System.out.println("fly");
  }
}
//Hierarchial Inheritance


