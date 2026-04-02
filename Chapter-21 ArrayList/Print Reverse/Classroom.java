import java.util.ArrayList;
public class Classroom{
  public static void main(String args[]){
    ArrayList<Integer> number = new ArrayList<>();

    // Add elements
    number.add(1);    //O(n)
    number.add(2);
    number.add(3);
    number.add(4);

    // Size
    System.out.println(number.size());    //O(n)

    //Print the elements of ArrayList in Print Reverse
    for(int i=number.size()-1; i>=0; i--){
      System.out.print(number.get(i)+ " ");
    }
    System.out.println();
  }
}
//Print Reverse