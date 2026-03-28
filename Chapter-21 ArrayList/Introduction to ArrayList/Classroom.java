import java.util.ArrayList;
public class Classroom{
  public static void main(String args[]){
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    // Access by index
    System.out.println(fruits.get(0));  // Apple

    // Update
    fruits.set(1, "Blueberry");

    // Remove
    fruits.remove("Mango");
    fruits.remove(0);  // remove by index

    // Size
    System.out.println(fruits.size());

    // Iterate
    for (String fruit : fruits) {
      System.out.println(fruit);
    }
  }
}

//ArrayList in Java
//An ArrayList is a resizable array implementation of the List interface in Java. Unlike regular arrays, it can grow and shrink dynamically as elements are added or removed.

//Key Characteristics
  // Dynamic sizing — automatically resizes itself
  // Ordered — maintains insertion order
  // Index-based — elements accessed via index (0-based)
  // Allows duplicates — same value can appear multiple times
  // Allows null — can store null values
  // Not thread-safe — use Collections.synchronizedList() or CopyOnWriteArrayList for multithreading


//Introduction to ArrayList