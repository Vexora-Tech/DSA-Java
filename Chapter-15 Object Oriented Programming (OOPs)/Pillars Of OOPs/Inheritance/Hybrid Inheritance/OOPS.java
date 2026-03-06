public class OOPS{
  public static void main(String args[]){
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);

    Human h1 = new Human();
    h1.walk();
    h1.talk();

    Peacock p1 = new Peacock();
    p1.fly();
    p1.color = "blue-green";
    System.out.println(p1.color);
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

class Dog extends Mammal{
  int legs;
}

class Human extends Mammal{
  void talk(){
    System.out.println("humans can talk");
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

class Peacock extends Bird{
  String color;
}
//Hybrid Inheritance


