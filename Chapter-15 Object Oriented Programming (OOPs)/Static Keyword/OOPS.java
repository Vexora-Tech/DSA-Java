//When a member is declared static, it belongs to the class rather than any individual object.
  //4 Uses of Static
    //static
      // ├── Static Variable
      // ├── Static Method
      // ├── Static Block
      // └── Static Class (Nested)


//1. Static Variable
public class OOPS {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.name = "Vansh";
    s2.name = "Rohan";

    // school is shared — changing it affects ALL objects
    Student.school = "XYZ School";

    System.out.println(s1.name + " " + s1.school);  
    System.out.println(s2.name + " " + s2.school);  
  }
}

class Student {
  String name;        // instance variable — each object has its own
  int roll;           // instance variable — each object has its own
  static String school = "ABC School";  // shared by ALL objects
}


//2. Static Method
public class OOPS {
  public static void main(String[] args) {
    // Call directly using class name — no object needed
    System.out.println(MathUtils.add(3, 5));      
    System.out.println(MathUtils.square(4));       
  }
}

class MathUtils {
  // Static method — no object needed
  static int add(int a, int b) {
    return a + b;
  }

  // Static method — no object needed
  static int square(int n) {
    return n * n;
  }
}


//3. Static Block
public class OOPS {
  public static void main(String[] args) {
    System.out.println("Main method executed!");
    System.out.println(Config.url + ":" + Config.port);
  }
}

class Config {
  static String url;
  static int port;

  // Runs ONCE when class is loaded — before main()
  static {
    url = "localhost";
    port = 8080;
    System.out.println("Static block executed!");
  }
}


//4. Static Nested Class
public class OOPs {
  public static void main(String[] args) {
    // No need to create Outer object
    Outer.Inner obj = new Outer.Inner();
    obj.show();     
  }
}

class Outer {
  static int x = 10;

  // Static nested class
  static class Inner {
    void show() {
      System.out.println("x = " + x);   // ✅ can access static members
    }
  }
}
//Static Keyword

