import java.util.*;
public class Classroom{
  public static void main(String args[]){
    ArrayList<Integer> number = new ArrayList<>();

    // Add elements
    number.add(3);
    number.add(5);
    number.add(9);
    number.add(2);

    System.out.println(number);
    Collections.sort(number);     //acending order
    System.out.println(number);
    
    Collections.sort(number, Collections.reverseOrder());       //decending order
    //reverseOrder - comparator - fxn logic
    System.out.println(number);
  }
}
//Sorting an ArrayList