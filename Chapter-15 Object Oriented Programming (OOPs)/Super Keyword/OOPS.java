//super is a reference to the parent class object. It is used to access parent class members from the child class.

//3 Uses of Super
  // super
    // ├── super.variable      (access parent variable)
    // ├── super.method()      (access parent method)
    // └── super()  


// 1. super.variable
public class OOPS {
  public static void main(String[] args) {
    Fish f = new Fish();
    f.showColor();
  }
}

class Animal {
  String color = "white";
}

class Fish extends Animal {
  String color = "red";      // hides parent's color

  void showColor() {
    System.out.println(color);          // "red"   (own)
    System.out.println(super.color);    // "white" (parent's)
  }
}


//2. super.method()
public class OOPS {
  public static void main(String[] args) {
    Fish f = new Fish();
    f.eat();
  }
}
class Animal {
  void eat() {
    System.out.println("Animal eats");
  }
}

class Fish extends Animal {
  void eat() {
    super.eat();                           //calls Animal's eat()
    System.out.println("Fish eats insects");
  }
}


//3. super() — Parent Constructor
public class OOPS {
  public static void main(String[] args) {
    Fish f = new Fish("blue", 5);
    System.out.println(f.color);   
    System.out.println(f.fins);    
  }
}
class Animal {
  String color;

  Animal(String color) {
    this.color = color;
    System.out.println("Animal constructor called");
  }
}

class Fish extends Animal {
  int fins;

  Fish(String color, int fins) {
    super(color);         // MUST be first line — calls Animal(String color)
    this.fins = fins;
    System.out.println("Fish constructor called");
  }
}
//Super Keyword

