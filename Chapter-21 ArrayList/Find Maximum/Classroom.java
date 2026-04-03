import java.util.ArrayList;
public class Classroom{
  public static void main(String args[]){
    ArrayList<Integer> number = new ArrayList<>();

    // Add elements
    number.add(3);    //O(n)
    number.add(5);
    number.add(9);
    number.add(2);

    int max = Integer.MIN_VALUE;
    for(int i=0; i<number.size(); i++){
      if(max < number.get(i)){
        max = number.get(i);
      }
      // max = Math.max(max, number.get(i));
    }
    System.out.println("max element is " + max);
  }
}
//Find Maximum