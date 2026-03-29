import java.util.ArrayList;
public class Classroom{
  public static void main(String args[]){
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements
    fruits.add("Apple");    //O(n)
    fruits.add("Banana");
    fruits.add("Mango");

    // Access by index
    // Apple
    System.out.println(fruits.get(0));  //O(1)

    // Update
    fruits.set(1, "Blueberry");

    // Remove
    fruits.remove("Mango");     //O(n)
    fruits.remove(0);  // remove by index

    // Size
    System.out.println(fruits.size());    //O(n)

    // Iterate
    for (String fruit : fruits) {         //O(n)
      System.out.println(fruit);
    }
  }
}
//Operations on ArrayList