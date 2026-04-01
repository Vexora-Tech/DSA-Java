import java.util.ArrayList;
public class Classroom{
  public static void main(String args[]){
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements
    fruits.add("Apple");    //O(n)
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");

    // Size
    System.out.println(fruits.size());    //O(n)

    //Print the elements of ArrayList
    for(int i=0; i<fruits.size(); i++){
      System.out.print(fruits.get(i)+ " ");
    }
    System.out.println();
  }
}
//Size of ArrayList