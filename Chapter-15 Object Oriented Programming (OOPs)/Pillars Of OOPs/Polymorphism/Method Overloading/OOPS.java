public class OOPS{
  public static void main(String args[]){
    Animal a = new Animal();
    a.eat();                    
    a.eat("grass");             
    a.eat("grass", 3);         
  }
}

class Animal {
  // Same method name, different parameters
  void eat() {
    System.out.println("Animal eats something");
  }

  void eat(String food) {
    System.out.println("Animal eats " + food);
  }

  void eat(String food, int times) {
    System.out.println("Animal eats " + food + " " + times + " times");
  }
}
//Method Overloading


