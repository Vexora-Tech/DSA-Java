import java.util.ArrayList;
public class Classroom{
  public static void swap(ArrayList<Integer> number, int idx1, int idx2){
    int temp = number.get(idx1);
    number.set(idx1, number.get(idx2));
    number.set(idx2, temp);
  }
  public static void main(String args[]){
    ArrayList<Integer> number = new ArrayList<>();

    // Add elements
    number.add(3);
    number.add(5);
    number.add(9);
    number.add(2);

    int idx1 = 1, idx2 = 3;
    System.out.println(number);
    swap(number, idx1, idx2);
    System.out.println(number);
  }
}
//Swap 2 Numbers