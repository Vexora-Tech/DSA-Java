import java.util.Scanner;      // import specific class
import java.util.*;            // import all classes in package

//A package is a folder/namespace that groups related classes together to avoid naming conflicts and organize code.

public class OOPS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = sc.nextLine();
    System.out.println("Hello " + name);
  }
}

//Packages in Java

//Packages
  //├── Built-in Packages   (provided by Java)
  //└── User-defined Packages (created by user)

